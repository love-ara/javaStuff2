
function reverseArray(numbers){
    const reversedList= [];

    for(let number = numbers.length-1; number >= 0; number--){
        reversedList.push(numbers[number]);
    }
    return reversedList;
}

console.log(reverseArray([1,2,3,4,5,6,7]));