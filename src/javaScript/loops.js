//
// let user = {
//     firstName : "Ara",
//     lastName : "Ara",
//     age : 2,
//     sex: "female"
// }
//
// //for/in loop
// for( const key in user ) {
//     console.log(user[key])
// }
//

// let arr = [1, 3, 4, 5,6]

// for (let i = 0; i < 5; i++) {
//     console.log(arr)
// }

// for(const i in arr) {
//     console.log(arr[i])
// }
// for(const value of arr) {
//     console.log(value)
// }

let obj = {
    name: String,
    population: Number,
    temp: Number,
    currency: String
}

const raw_array = [
    [null,
        {name : "Nigeria", population : 10, temp: 9, currency : "NGN"},
        {name : "Sudan", population : 200, temp: 10, currency : "Dollar"},
        {name : "South Africa", population : 12, temp: 10, currency : "Dollar"}
    ],
    [
        {name : "UK", population : 8, temp: 10, currency : "Pounds"},
        {name : "Japan", population : 1500, temp: 10, currency : "japanese won",},
        {name : "China", population :6, temp: 10, currency : "Dollar"},
        null
    ],
    [
        {name : "USA", population : 150, temp: 9, currency : "Dollar"},
        null,
        {name : "Egypt", population : 2, temp: 10, currency : "Dollar"},
        {name : "South Korea", population : 6, temp: 10, currency : "Won"}]];
let totalPopulation = 0;

for (const subArray of raw_array) {
    for (const obj of subArray) {
        if (obj != null&& obj.temp <= 10) {
            totalPopulation += obj.population;
        }
    }

}

console.log("Total population:", totalPopulation);

// console.log(raw_array);
// console.log(JSON.stringify(raw_array));
// for(const key in obj){
//     console.log(obj[key]);
// }

// const myDictionary = { a: 1, b: 2, c: 3 };
// for (const key in myDictionary) {
//     if (myDictionary.hasOwnProperty(key)) {
//         console.log(key, myDictionary[key]);
//     }
// }