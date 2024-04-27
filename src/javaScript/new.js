function Person(name, age){
    this.name  = name;
    this.age = age;

    this.sayName = function (){
        console.log(this.name);
    }
}

const personOne = new Person("Jumoke", 13);
const personTwo = new Person("Ara", 16);
console.log(personOne.name)
console.log(personTwo.name)
console.log(new Person("John", 20));
personTwo.sayName();

const jsom = '{"result" : true, "count" : 42}';
const obj = JSON.parse(jsom);
console.log(obj);
const s = JSON.stringify(obj);
console.log(s);