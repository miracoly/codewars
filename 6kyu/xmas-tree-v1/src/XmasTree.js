"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var XmasTree = /** @class */ (function () {
    function XmasTree(height, tree) {
        this.height = height;
        this.tree = tree;
    }
    XmasTree.fromHeight = function (height) {
        var tree = [];
        for (var i = 1; i <= height; i++) {
            tree.push(this.generateTreeLevel(i, height));
        }
        return new XmasTree(height, tree);
    };
    XmasTree.prototype.toString = function () {
        var strTree = this.tree.reduce(function (acc, curr, i, tree) { return acc + (i !== tree.length - 1) ? "\n" : ""; }, "");
        return strTree;
    };
    XmasTree.generateTreeLevel = function (levelFromTop, height) {
        var stars = this.generateStars(levelFromTop);
        var starsWithSpaces = this.addSpacesToStars(stars, height);
        return starsWithSpaces;
    };
    XmasTree.addSpacesToStars = function (stars, height) {
        var width = 2 * height - 1;
        var spacesPerSite = (width - stars.length) / 2;
        return " ".repeat(spacesPerSite) + stars;
    };
    XmasTree.generateStars = function (count) {
        if (count <= 1) {
            return "*";
        }
        return "**" + this.generateStars(count - 1);
    };
    return XmasTree;
}());
exports.default = XmasTree;
