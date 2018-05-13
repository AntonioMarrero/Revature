"use strict";
exports.__esModule = true;
var User = /** @class */ (function () {
    function User(username, password) {
        this._accounts = [];
        this._username = username;
        this._password = password;
    }
    Object.defineProperty(User.prototype, "username", {
        get: function () {
            return this._username;
        },
        set: function (value) {
            this._username = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(User.prototype, "password", {
        get: function () {
            return this._password;
        },
        set: function (value) {
            this._password = value;
        },
        enumerable: true,
        configurable: true
    });
    User.prototype.login = function (user, pass) {
        return this._username === user && this._password === pass;
    };
    User.prototype.getAccount = function (type) {
        return this._accounts.filter(function (account) { return account.type == type; })[0];
    };
    return User;
}());
exports.User = User;
