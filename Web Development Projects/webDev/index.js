    //Comments: Explain why's and hows, not whats.
        //This is my first Javascript Code
console.log('Hello World');


//VARIABLES NOTES: ----------------------------------------------


//Declared Variable Named Thomas

//Rules for variables:
//Cannot Be Reserved Keyword
//Should be meaningful names they need to give a clue of what it is
//Cannot start with a number
//Cannot contain Space or Hyphen use camelCase instead
//Variable names are case-sensitive, so stick to camel-case so no confusion


let names = 'Thomas';
console.log(names);


// You can initialize two variables on the same row, but that is not best practice, so do it like this instead.
let firstName = 'Thomas';
let lastName = 'Raines';


//CONSTANTS NOTES --------------------------------------------------
//If you dont need to reassign variales, then make it constant like this. If you want to change the values later, then use let

const interestRate = 0.3;
//interestRate = 1;
//console.log(interestRate);



//PRIMITIVE TYPES NOTES --------------------------------------------
//Strings, nums, boolean, undef, null

let name = 'ghools'; // String Literal Type

let age = 30; // Number Literal

let isApproved = true; // Boolean Literal (true and false are going to be reserved)

let firstNames = undefined; // undefined is a type

let lastNames = null; // Use null to clear a variables value, in case you want to instantiate it later. Type null is an object

// DYNAMIC TYPING --------------------------------------------------

//JS is a Dynamic Language
//There are Static and Dynamic Languages.
//Static types are determined when they are written, but Dynamic Types are determined at the program's run-time so they can change type after being executed



//REFERENCE TYPES NOTES ============================================

// Consists of: Objects, Arrays, and Functions


//Here is an object representing a person with attributes of name and age

//let name1 = 'Tom';
//let age1 = 22;

// This is not efficient if there are lots of attributes so we can make a person oject to represent all this:

//Representation of a person object
// To make an object use let then use {} fill these with key->value pairs separated by : like name:"Thumnus" ,etc.

let person = {
    name1: "Tom" ,
    age1: 22
};

//Let's Change name of the person. There are two ways:

//Dot Notation (best practice.. usually):
person.name1 ='John';


//bracket Notation:
person["name1"] = "mary"


//expected result here: {name1: mary, age1: 22}
console.log(person);

//ARRAYS NOTES -----------------------------------------------------

//How to create array literal (this is an oject type)
let selectedColors = ['red', 'blue'];

console.log(selectedColors);


//To get the first index:

console.log(selectedColors[0]);


//Arrays are Dynamic and can be changed at Run-time:


//We can append a new item to this at runtime. Now we have an array of 3 colors.
selectedColors[2] = "magenta";

console.log(selectedColors);

//You can store different types in an array:
selectedColors[3] = 3405;

console.log(selectedColors);


//Can use the Dot Notation on arrays too:


//This is a prototype function that shows us our length
console.log(selectedColors.length);


//FUNCTIONS NOTES -----------------------------------------------------------------------------

//Functions performs a task or calculates a value

//Function Declaration doesn't need ; at end
function greet() {
    //function body:
    console.log('Hello User!');
}

//function call


greet()




//This function performs a task
//Functions can take inputs:
//This name parameter is only accessible to this function
function greet1(name, lastName) {
    //function body:
    console.log('Hello ' + name+ ' ' + lastName);
}

//This is an argument called John
greet1('John', "Smith")
greet1("Mary", "Magdeline")
greet1("Thomas", "Raines")





//TYPES OF FUNCTIONS NOTES --------------------------------------------------------------------

// Calculates a value:
function square(number){
    return number * number;
}

//Since we returned the value , we can store it in a variable: 
let numbs = square(2);
console.log(numbs)

// We can also just send the return value to the console print statement:
console.log(square(4));


