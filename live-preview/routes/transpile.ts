import express = require('express');
import path = require('path');
import fs = require('fs');
import async = require('async');
var    exec = require('child_process').exec;

var router = express.Router();

const MAX_CODE_LENGTH = 10 * 1024;
const JAR_PATH = path.join(__dirname, '../../out/artifacts/antlr4example_jar/antlr4example.jar');

router.post('*', function(req, res, next) {

    if(!req.body || typeof req.body.code !== 'string' || !req.body.code.length) return res.sendStatus(400);
    if(req.body.code.length > MAX_CODE_LENGTH) return res.sendStatus(413);

    let tmpFileName = '/var/tmp/' + new Date().getTime() + Math.random().toString().slice(2),
        transpiled = '';

    async.waterfall([
        callback => fs.writeFile(tmpFileName, req.body.code, callback),
        callback => {delete req.body.code; callback();},
        callback => exec(`java -jar ${JAR_PATH} ${tmpFileName} ${req.body.language || 'ts'}`, callback),
        (stdout, stderr, callback) => {
            console.log('!!!!!!!!!!stdout');
            console.log(stdout);
            console.log('!!!!!!!!!!stderr');
            console.log(stderr);
            transpiled = stdout;
            callback(stderr);
        }
    ],
    err => {
        async.series([
            callback => fs.unlink(tmpFileName, callback)
        ],
        err2 => {
            console.log('!!!!!!!!!!err');
            console.log(err);
            if(err) return res.sendStatus(500);
            res.send(transpiled);
        })
    });
});

export = router;
