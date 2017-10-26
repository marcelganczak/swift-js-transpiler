var assert = require('assert'),
    exec = require('child_process').exec,
    fs = require('fs'),
    root = require('path').normalize(__dirname + '/../'),
    underscore = fs.readFileSync(__dirname + '/underscore.js'),
    monkeyPatch = fs.readFileSync(__dirname + '/monkey-patch.js'),
    javaHeader = fs.readFileSync(__dirname + '/java-header.txt'),
    javaFooter = fs.readFileSync(__dirname + '/java-footer.txt'),
    todo = {
        ts: {dirs: [], files: ['functions-as-vars', 'tuple-enums-1',  'tuple-enums-2', 'strings-5', 'functions-16', 'functions-17', 'custom-operators']},
        java: {dirs: ['functions', 'classes', 'weheartswift'], files: ['custom-operators']}
    },
    only = {
        ts: {dir: null, file: null},
        java: {dir: null, file: null}
    },
    languages = ['ts', 'java'];

languages.forEach(language => {
    describe(language, () => {
        fs.readdirSync(__dirname).forEach(dir => {
            if(dir === 'node_modules' || dir === '.' || dir === '..' || dir === '.idea') return;
            if(!fs.statSync(__dirname + '/' + dir).isDirectory()) return;
            if(only[language].dir ? dir !== only[language].dir : todo[language].dirs.some(todo => dir === todo)) return;

            describe(dir, function() {
                this.timeout(10 * 1000);

                fs.readdirSync(__dirname + '/' + dir).forEach(file => {
                    if(!file.includes('.swift')) return;
                    if(only[language].file ? file !== only[language].file + '.swift' : todo[language].files.some(todo => file === todo + '.swift')) return;

                    it(file.replace('.swift', ''), done => {
                        var transpiledLog, expectedLog;

                        exec('cd ' + root + 'out/production/antlr4example; export CLASSPATH=".:/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH"; export CLASSPATH=".:' + root + '/lib/*:$CLASSPATH"; java Main ' + root + 'test/' + dir + '/' + file + ' ' + language, (err, stdout, stderr) => {
                            if(stderr) console.log(stderr);
                            var transpiledAmmended = language === 'ts' ? underscore + monkeyPatch + stdout : javaHeader + stdout + javaFooter;
                            fs.writeFileSync(root + 'test/test.' + language, transpiledAmmended);

                            var compileCommand =
                                language === 'ts' ? 'ts-node --disableWarnings ' + root + 'test/test.ts'
                                : 'javac ' + root + 'test/test.java; java test';

                            exec(compileCommand, (err, stdout) => {
                                transpiledLog = stdout;

                                exec('swift ' + __dirname + '/' + dir + '/' + file, (err, stdout) => {
                                    expectedLog = stdout;
                                    //console.log(expectedLog);
                                    //console.log('vs');
                                    //console.log(transpiledLog);
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
        after(function() {
            fs.unlinkSync(root + 'test/test.' + language);
        });
    });
});