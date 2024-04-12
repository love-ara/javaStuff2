
function reverseArray(numbers){
    const reversedList= [];

    for(let number = numbers.length-1; number >= 0; number--){
        reversedList.push(numbers[number]);
    }
    return reversedList;
}

console.log(reverseArray([1,2,3,4,5,6,7]));
console.log(reverseArray([3,2,3,4,5,6,10]));
console.log(reverseArray([30,2,43,7,15,6,10]));