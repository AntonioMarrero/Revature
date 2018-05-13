"use strict";
exports.__esModule = true;
var LikeComponent = /** @class */ (function () {
    // likesCount: number;
    // isSelected: boolean;
    function LikeComponent(_likesCount, _isSelected) {
        this._likesCount = _likesCount;
        this._isSelected = _isSelected;
    }
    LikeComponent.prototype.onClick = function () {
        // if(this._isSelected){
        //     this._likesCount--;
        //     // this._isSelected = false;
        // } else {
        //     this._likesCount++;
        //     // this._isSelected = true;
        // }
        this._likesCount += (this._isSelected) ? -1 : 1;
        this._isSelected = !this._isSelected;
    };
    Object.defineProperty(LikeComponent.prototype, "likesCount", {
        get: function () {
            return this._likesCount;
        },
        set: function (value) {
            this._likesCount = value;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(LikeComponent.prototype, "isSelected", {
        get: function () {
            return this._isSelected;
        },
        set: function (value) {
            this._isSelected = value;
        },
        enumerable: true,
        configurable: true
    });
    return LikeComponent;
}());
exports.LikeComponent = LikeComponent;
