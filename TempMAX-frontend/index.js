var express = require('express');
var app = express();
var bodyParser = require('body-parser');

app.use(express.static('static'));

var server = app.listen(3000, function () {
    console.log("On :3000");
});
