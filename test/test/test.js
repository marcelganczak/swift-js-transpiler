var assert = require('assert'),
    exec = require('child_process').exec,
    fs = require('fs'),
    root = require('path').normalize(__dirname + '/../../');

describe('Example test', function() {
    this.timeout(10 * 1000);

    it("Checks if tests work alright", function (done) {
        exec('cd ' + root + 'out/production/antlr4example; export CLASSPATH=".:/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH"; /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/bin/java Main example.swift', function(err, stdout) {
            console.log('--------------------------------------------------');
            console.log('compiled .ts', stdout || err);
            fs.writeFileSync(root + 'blabla.ts', stdout);

            exec('ts-node ' + root + 'blabla.ts', function(err, stdout) {
                console.log('--------------------------------------------------');
                console.log('.ts result', stdout || err);

                exec('swift ' + root + 'example.swift', function(err, stdout) {
                    console.log('--------------------------------------------------');
                    console.log('.swift result', stdout || err);
                });
            });
        });
    });

});