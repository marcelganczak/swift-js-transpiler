import express = require('express');
import path = require('path');

var router = express.Router();

router.get('*', function(req, res, next) {
    res.sendFile(path.join(__dirname, '../client/views/index.html'));
});

export = router;
