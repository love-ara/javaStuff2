let number = [1, 2, 3, 4]

number.pop()
//console.log(number)
number.push(4)
//console.log(number)

/**shift removes first index, unshift add to first index
slice and splice : slice removes from index or range provided; with splice,
if you provide a starting point and number of steps,
it keeps the starting points and deletes by step of the number you provide
splice also removes from the starting index provided one point.


**/
let num = [12, 3, 4, 5]
num.unshift(1)

//console.log(num)
//console.log(num.slice(1))
//console.log(num.slice(1, 3))
//console.log(num.splice(2))
num.splice(2, 0, 2,3)
//console.log(num)

let numOne = [2, 3, 4]
//console.log(num.concat(numOne))
let numb = num.concat(numOne)
//console.log(numb)

let obj = [["car", 2000],["Truck", 500],["Bike",6500]]

//console.log(obj.splice(0,1))
//console.log(obj[0][0])
//obj.push(["Scooter, 1500"])
//console.log(obj)

//let arr = [["car", 2000, ["Toyota", "Nissan"]],["Truck", 500, ["Ford"]],["Bike",6500, "Honda"]]
//arr.push(["Scooter", 500, ["Ford"]])
//console.log(arr)
obj[0].push(["Toyota", "Nissan"])
obj[1].push(["Ford"])
obj[2].push(["Honda"])

//console.log(obj)

let raw_arr = [[200, 50, 300, 5], [10, 25, 7, 100], [25, 20, 70, 45], [500, 170, 11, 35]]

console.log(raw_arr[1].slice(0, 3))