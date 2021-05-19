import XmasTree from "../../src/XmasTree";

test("XmasTree.fromHeight - height = 1 - should return only a '*'-tree", () => {
    expect(XmasTree.fromHeight(1).tree[0]).toBe("*");
})

test("XmasTree.fromHeight - height = 2 - should return only a '*'-tree", () => {
    const tree = XmasTree.fromHeight(2);
    expect(tree.tree[0]).toBe(" * ");
    expect(tree.tree[1]).toBe("***");
})

test("XmasTree.toString - height = 2 - should return correct string", () => {
    const strTree = XmasTree.fromHeight(2).toString();
    expect(strTree).toBe(" *\n***");
})

test("XmasTree.fromHeight - height = 3 - should return only a '*'-tree", () => {
    const tree = XmasTree.fromHeight(3);
    expect(tree.tree[0]).toBe("  *");
    expect(tree.tree[1]).toBe(" ***");
    expect(tree.tree[2]).toBe("*****");
})

test("XmasTree.fromHeight - height = 3 - should return only a '*'-tree", () => {
    const tree = XmasTree.fromHeight(4);
    expect(tree.tree[0]).toBe("   *");
    expect(tree.tree[1]).toBe("  ***");
    expect(tree.tree[2]).toBe(" *****");
    expect(tree.tree[3]).toBe("*******");
})

test("XmasTree.calculateStars - count 1 till 5 - should return correct stars", () => {
    expect(XmasTree.generateStars(1)).toBe("*");
    expect(XmasTree.generateStars(2)).toBe("***");
    expect(XmasTree.generateStars(3)).toBe("*****");
    expect(XmasTree.generateStars(4)).toBe("*******");
    expect(XmasTree.generateStars(5)).toBe("*********");
})

test("XMasTree.addSpacesToStars - should add correct spaces", () => {
    expect(XmasTree.addSpacesToStars("*", 2)).toBe(" *");
    expect(XmasTree.addSpacesToStars("***", 2)).toBe("***");
    expect(XmasTree.addSpacesToStars("***", 3)).toBe(" ***");
})