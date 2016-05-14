var fs = require('fs'),
    request = require('request'),
    async = require('async');

const URLS = [
    'https://www.weheartswift.com/variables-constants-basic-operations',
    'https://www.weheartswift.com/conditionals',
    'https://www.weheartswift.com/types',
    'https://www.weheartswift.com/loops',
    'https://www.weheartswift.com/strings',
    'https://www.weheartswift.com/arrays',
    'https://www.weheartswift.com/functions',
    'https://www.weheartswift.com/recursion',
    'https://www.weheartswift.com/closures',
    'https://www.weheartswift.com/tuples-enums',
    'https://www.weheartswift.com/dictionaries'
];

console.log('FETCHING');

async.eachSeries(URLS, function(url, callback) {
    request(url, function(err, res, body) {

        var index = 0, i = 0;
        while((index = body.indexOf('<div class="sp-head" title="Expand">\nSolution', index + 1)) >= 0) {
            var htmlSlice = body.slice(body.indexOf('<pre>', index), body.indexOf('</pre>', index)),
                unHtmled = htmlSlice.replace(/<[^>]+?>/g, "").replace(/&gt;/, ">").replace(/&lt;/, "<");
            if(unHtmled.indexOf('print') < 0) continue;

            fs.writeFileSync(__dirname + '/weheartswift/' + url.slice(url.lastIndexOf('/') + 1) + '-' + (++i) + '.swift', unHtmled);
        }
        callback();
    })
});