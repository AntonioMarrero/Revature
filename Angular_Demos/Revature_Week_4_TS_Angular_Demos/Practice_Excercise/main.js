"use strict";
exports.__esModule = true;
var like_component_1 = require("./like-component");
// Start off with a likecomponenet that has 10 likes and is already selected
var component = new like_component_1.LikeComponent(10, true);
// print the initial component fields
console.log("likesCount: " + component.likesCount + ", isSelected: " + component.isSelected);
// simulates click event
component.onClick();
console.log("EVENT: LikeComponent clicked");
// print the initial component fields
console.log("likesCount: " + component.likesCount + ", isSelected: " + component.isSelected);
