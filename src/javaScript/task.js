const prompt =  require('prompt-sync')();

let x, y, sum, numberMod, remainder, a, result, product;
x = Number(prompt("Enter a value for X: "))
y = Number(prompt("Enter a value for Y: "))
sum=  2 * (x * y)
numberMod  = Number(prompt("Enter a number for mod: "))
remainder = (numberMod%10) + numberMod

const n = Number(prompt("Enter a value for n: "))

result = n*(x * x)

a = Number(prompt("Enter a value for a: "))
x = a + 10
y = a - 10
const z = a%10
product = (x * y * z) / a


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

let left_operand, right_operand, operator, ans;
operator = prompt("Enter your operator: ")
left_operand= Number(prompt("Enter your left operand: "));
right_operand= Number(prompt("Enter your right operand: "));
if(operator === "+ "){
    ans= left_operand + right_operand;
} else if(operator === "-"){
    ans =left_operand - right_operand;
} else if(operator === "*"){
    ans =left_operand * right_operand;
}else if(operator === "/"){
    ans =left_operand / right_operand;
}else(
    ans = NaN
)

console.log(ans);

