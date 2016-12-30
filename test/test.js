var assert = require('assert'),
    exec = require('child_process').exec,
    fs = require('fs'),
    root = require('path').normalize(__dirname + '/../'),
    underscore = fs.readFileSync(__dirname + '/underscore.js'),
    monkeyPatch = fs.readFileSync(__dirname + '/monkey-patch.js'),
    javaHeader = fs.readFileSync(__dirname + '/java-header.txt'),
    javaFooter = fs.readFileSync(__dirname + '/java-footer.txt'),
    todo = ['functions-as-vars', 'tuple-enums-1',  'tuple-enums-2', 'strings-5', 'functions-16', 'functions-17'],
    languages = ['ts', 'java'];

languages.forEach(language => {
    describe(language, () => {
        fs.readdirSync(__dirname).forEach(dir => {
            if(dir === 'node_modules' || dir === '.' || dir === '..' || dir === '.idea') return;
            if(!fs.statSync(__dirname + '/' + dir).isDirectory()) return;

            describe(dir, function() {
                this.timeout(10 * 1000);

                fs.readdirSync(__dirname + '/' + dir).forEach(file => {
                    if(!file.includes('.swift')) return;
                    if(todo.some(todo => file.startsWith(todo))) return;

                    it(file.replace('.swift', ''), done => {
                        var transpiledLog, expectedLog;

                        exec('cd ' + root + 'out/production/antlr4example; export CLASSPATH=".:/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH"; export CLASSPATH=".:/Users/bubulkowanorka/projects/antlr4-visitor/lib/*:$CLASSPATH"; /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/bin/java Main /Users/bubulkowanorka/projects/antlr4-visitor/test/' + dir + '/' + file + ' ' + language, (err, stdout) => {
                            var transpiledAmmended = language === 'ts' ? underscore + monkeyPatch + stdout : javaHeader + stdout + javaFooter;
                            fs.writeFileSync(root + 'test/test.' + language, transpiledAmmended);

                            var compileCommand =
                                language === 'ts' ? 'ts-node --disableWarnings ' + root + 'test/test.ts'
                                : 'javac ' + root + 'test/test.java; java test';

                            exec(compileCommand, (err, stdout) => {
                                transpiledLog = stdout;

                                exec('swift ' + __dirname + '/' + dir + '/' + file, (err, stdout) => {
                                    expectedLog = stdout;
                                    assert(expectedLog.length > 1);
                                    assert(transpiledLog.length > 1);
                                    var tsLines = transpiledLog.split('\n'), swiftLines = expectedLog.split('\n');
                                    assert(tsLines.length > 1);
                                    assert(swiftLines.length > 1);
                                    assert.equal(tsLines.length, swiftLines.length);
                                    for(var i = 0; i < swiftLines.length; i++) {
                                        if(swiftLines[i] === 'nil') assert(tsLines[i] === 'null' || tsLines[i] === 'undefined');
                                        else assert.equal(tsLines[i], swiftLines[i]);
                                    }
                                    done();
                                });
                            });
                        });
                    });
                });
            });
        });
    });
});