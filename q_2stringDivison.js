// Find the sum of all the numbers in a string which is divisible by 3 and also find the last
// such number


const str = "The best 6 of 8 will get 9 points";

const strArr = str.split("");
const threesArr = strArr.filter(e => parseInt(e) % 3 == 0);
const sumOfThrees = threesArr.reduce((acc, curr) => acc + parseInt(curr), 0);

const allNumbers = strArr.filter(e => parseInt(e));
const lastNumber = allNumbers[allNumbers.length - 1];

console.log("Sum: " + sumOfThrees);
console.log("Last: " + lastNumber);