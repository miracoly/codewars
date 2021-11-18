"use strict";
exports.__esModule = true;
var convertNumToFizzBuzz = function (num) {
    var result = num % 3 == 0 ? "Fizz" : "";
    result += num % 5 == 0 ? "Buzz" : "";
    return result === "" ? num.toString() : result;
};
var fizzBuzz = function (num) {
    var result = [];
    for (var i = 1; i <= num; i++) {
        result.push(i);
    }
    return result;
};
module.exports = convertNumToFizzBuzz;
