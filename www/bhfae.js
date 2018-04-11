var exec = require('cordova/exec');

var bhfaeExport = {};

bhfaeExport.showToast = function (arg0, success, error) {
    exec(success, error, 'Bhfae', 'showToast', [arg0]);
};

bhfaeExport.getAppVersion = function (arg0, success, error) {
    exec(success, error, 'Bhfae', 'getAppVersion', [arg0]);
};

module.exports = bhfaeExport;