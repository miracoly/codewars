import { string } from "yargs";

const convertNumToFizzBuzz = (num: number) => {
    let result = num % 3 == 0 ? "Fizz" : "";
    result += num % 5 == 0 ? "Buzz" : "";
    return result === "" ? num.toString() : result;
};

const fizzBuzz = (num: number) => {
    let result = [];
    for (let i = 1; i <= num; i++) {
        result.push(i);
    }
    return result;
};

module.exports = convertNumToFizzBuzz;
