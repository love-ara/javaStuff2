//
// function reverseArray(numbers){
//
//     for(let number = 0, j = numbers.length-1; number < j;number++, j--){
//         [numbers[number], numbers[j]] = [numbers[j], numbers[number]];
//     }
//     return numbers;
// }
//
// function reverseArray1(numbers){
//     const reversedList= [];
//
//     for(let number = numbers.length-1; number >= 0; number--){
//         reversedList.push(numbers[number]);
//     }
//     return reversedList;
// }
//
//







// exr.js

function getGrade(arr) {
    return arr.map((score) => {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    });
}


const studentScores = [95, 78, 85, 60, 45, 92];
//const studentScores = [90, 80, 70, 60];
const grades = getGrade(studentScores);
console.log(grades);


