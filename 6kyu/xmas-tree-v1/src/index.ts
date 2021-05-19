import XmasTree from "./XmasTree";

function christmasTree(height) {
    return XmasTree.fromHeight(height).toString();
}

console.log(christmasTree(3));
console.log(christmasTree(4));
console.log(christmasTree(5));