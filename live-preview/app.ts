import express = require('express');
import path = require('path');
import fs = require('fs');
import bodyParser = require('body-parser');

var app = express();

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(express.static(path.join(__dirname, './client')));

app.use('/api/transpile', require('./routes/transpile'));

app.use(require('./routes/index'));

export = app;
