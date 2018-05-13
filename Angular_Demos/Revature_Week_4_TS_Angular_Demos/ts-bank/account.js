"use strict";
exports.__esModule = true;
var Account = /** @class */ (function () {
    function Account(balance, type) {
        this._balance = balance;
        this._type = type;
    }
    Object.defineProperty(Account.prototype, "balance", {
        get: function () {
            return this._balance;
        },
        set: function (value) {
            this._balance = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Account.prototype, "type", {
        get: function () {
            return this._type;
        },
        set: function (value) {
            this._type = value;
        },
        enumerable: true,
        configurable: true
    });
    Account.prototype.withdraw = function (amount) {
        if (this._balance - amount < 0) {
            console.log('Overdafts not permitted. Transaction denied!');
        }
        this._balance -= amount;
    };
    Account.prototype.deposit = function (amount) {
        if (this._balance + amount > 0) {
            this._balance = amount;
        }
    };
    return Account;
}());
exports.Account = Account;
