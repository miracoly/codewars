const convertNumToFizzBuzz = require("./fizzbuzz.js");

test("accept numbers", () => {
    expect(convertNumToFizzBuzz(1)).toBe("1");
});

test("Multiples of 3 should return Fizz", () => {
    expect(convertNumToFizzBuzz(3)).toBe("Fizz");
});

test("Multiples of 5 should return Buzz", () => {
    expect(convertNumToFizzBuzz(5)).toBe("Buzz");
});
