const prompt =  require('prompt-sync')();

var x = prompt("Enter a value for X: ")
var y = prompt("Enter a value for Y: ")
let sum =  2 * (x * y)

var numberMod = (prompt("Enter a number for mod: "))
let remainder = (numberMod%10) + numberMod

const n = prompt("Enter a value for n: ")

let result = n*(x * x)

var a = prompt("Enter a value for a: ")
x = a + 10
y = a - 10
const z = a%10
let product = (x * y * z) / a


console.log("a =" + a)
console.log("x =" + x)
console.log("y =" + y)
console.log("X" + (x = a + 10))
console.log("Y= " + (y = a - 10))
console.log("n =" + n)
console.log("Sum(2(X * y)) =  "+ sum)
console.log("remainder(numberMod%10 + number)) = " + remainder)
console.log("result(n*(x * x)) " + result)
console.log("product (x * y * z) / a " + product)



