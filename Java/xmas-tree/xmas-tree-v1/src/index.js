"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var XmasTree_1 = require("./XmasTree");
function christmasTree(height) {
    return XmasTree_1.default.fromHeight(height).toString();
}
console.log(christmasTree(3));
console.log(christmasTree(4));
console.log(christmasTree(5));
