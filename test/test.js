var assert = require('assert'),
    exec = require('child_process').exec,
    fs = require('fs'),
    root = require('path').normalize(__dirname + '/../'),
    underscore = fs.readFileSync(__dirname + '/underscore.js');

fs.readdirSync(__dirname).forEach(function(dir) {
    if(dir === 'node_modules' || dir === '.' || dir === '..' || dir === '.idea') return;
    if(!fs.statSync(__dirname + '/' + dir).isDirectory()) return;
    //if(dir !== 'functions') return;

    describe(dir, function() {
        this.timeout(10 * 1000);

        fs.readdirSync(__dirname + '/' + dir).forEach(function(file) {
            if(!file.includes('.swift')) return;
            //if(file !== 'functions-as-vars.swift') return;

            it(file.replace('.swift', ''), function (done) {
                var tsResult, swiftResult;

                exec('cd ' + root + 'out/production/antlr4example; export CLASSPATH=".:/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH"; /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/bin/java Main /Users/bubulkowanorka/projects/antlr4-visitor/test/' + dir + '/' + file, function(err, stdout) {
                    fs.writeFileSync(root + 'test.ts', underscore + stdout);

                    exec('ts-node --disableWarnings ' + root + 'test.ts', function(err, stdout) {
                        tsResult = stdout;

                        exec('swift ' + __dirname + '/' + dir + '/' + file, function(err, stdout) {
                            swiftResult = stdout;
                            assert(swiftResult.length > 1);
                            assert(tsResult.length > 1);
                            var tsLines = tsResult.split('\n'), swiftLines = swiftResult.split('\n');
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