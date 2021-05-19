"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var XmasTree_1 = require("../../src/XmasTree");
test("XmasTree.fromHeight - height = 1 - should return only a '*'-tree", function () {
    expect(XmasTree_1.default.fromHeight(1).tree[0]).toBe("*");
});
test("XmasTree.fromHeight - height = 2 - should return only a '*'-tree", function () {
    var tree = XmasTree_1.default.fromHeight(2);
    expect(tree.tree[0]).toBe(" * ");
    expect(tree.tree[1]).toBe("***");
});
test("XmasTree.toString - height = 2 - should return correct string", function () {
    var strTree = XmasTree_1.default.fromHeight(2).toString();
    expect(strTree).toBe(" *\n***");
});
test("XmasTree.fromHeight - height = 3 - should return only a '*'-tree", function () {
    var tree = XmasTree_1.default.fromHeight(3);
    expect(tree.tree[0]).toBe("  *");
    expect(tree.tree[1]).toBe(" ***");
    expect(tree.tree[2]).toBe("*****");
});
test("XmasTree.fromHeight - height = 3 - should return only a '*'-tree", function () {
    var tree = XmasTree_1.default.fromHeight(4);
    expect(tree.tree[0]).toBe("   *");
    expect(tree.tree[1]).toBe("  ***");
    expect(tree.tree[2]).toBe(" *****");
    expect(tree.tree[3]).toBe("*******");
});
test("XmasTree.calculateStars - count 1 till 5 - should return correct stars", function () {
    expect(XmasTree_1.default.generateStars(1)).toBe("*");
    expect(XmasTree_1.default.generateStars(2)).toBe("***");
    expect(XmasTree_1.default.generateStars(3)).toBe("*****");
    expect(XmasTree_1.default.generateStars(4)).toBe("*******");
    expect(XmasTree_1.default.generateStars(5)).toBe("*********");
});
test("XMasTree.addSpacesToStars - should add correct spaces", function () {
    expect(XmasTree_1.default.addSpacesToStars("*", 2)).toBe(" *");
    expect(XmasTree_1.default.addSpacesToStars("***", 2)).toBe("***");
    expect(XmasTree_1.default.addSpacesToStars("***", 3)).toBe(" ***");
});
