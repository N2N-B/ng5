/**
 

JavaScript is an object-based scripting language which is lightweight and cross-platform.




Application of JavaScript
JavaScript is used to create interactive websites. It is mainly used for:

Client-side validation,
Dynamic drop-down menus,
Displaying date and time,
Displaying pop-up windows and dialog boxes (like an alert dialog box, confirm dialog box and prompt dialog box),
Displaying clocks etc.
JavaScript Example
<script>  
document.write("Hello JavaScript by JavaScript");  
</script>  

JavaScript Example

Javascript example is easy to code. JavaScript provides 3 places to put the JavaScript code: within body tag, 
within head tag and external JavaScript file.

Let’s create the first JavaScript example.

<script type="text/javascript">  
document.write("JavaScript is a simple language for javatpoint learners");  
</script>  


The script tag specifies that we are using JavaScript.

The text/javascript is the content type that provides information to the browser about the data.


The document.write() function is used to display dynamic content through JavaScript. 
We will learn about document object in detail later.

3 Places to put JavaScript code
Between the body tag of html
Between the head tag of html
In .js file (external javaScript)

1) JavaScript Example : code between the body tag
In the above example, we have displayed the dynamic content using JavaScript. 
Let’s see the simple example of JavaScript that displays alert dialog box.

<script type="text/javascript">  
 alert("Hello Javatpoint");  
</script>  


2) JavaScript Example : code between the head tag
Let’s see the same example of displaying alert dialog box of JavaScript that is contained inside the head tag.

In this example, we are creating a function msg().
 To create function in JavaScript, you need to write function with function_name as given below.

To call function, you need to work on event. Here we are using onclick event to call msg() function.

<html>  
<head>  
<script type="text/javascript">  
function msg(){  
 alert("Hello Javatpoint");  
}  
</script>  
</head>  
<body>  
<p>Welcome to JavaScript</p>  
<form>  
<input type="button" value="click" onclick="msg()"/>  
</form>  
</body>  
</html>  


External JavaScript file
We can create external JavaScript file and embed it in many html page.

It provides code re usability because single JavaScript file can be used in several html pages.

An external JavaScript file must be saved by .js extension. It is recommended to embed all JavaScript files into a single file. It increases the speed of the webpage.

Let's create an external JavaScript file that prints Hello Javatpoint in a alert dialog box.


message.js

function msg(){  
 alert("Hello Javatpoint");  
}  
Let's include the JavaScript file into html page. It calls the JavaScript function on button click.

index.html

<html>  
<head>  
<script type="text/javascript" src="message.js"></script>  
</head>  
<body>  
<p>Welcome to JavaScript</p>  
<form>  
<input type="button" value="click" onclick="msg()"/>  
</form>  
</body>  
</html>  

Advantages of External JavaScript
There will be following benefits if a user creates an external javascript:

It helps in the reusability of code in more than one HTML file.
It allows easy code readability.
It is time-efficient as web browsers cache the external js files, which further reduces the page loading time.
It enables both web designers and coders to work with html and js files parallelly and separately, i.e., 
without facing any code conflictions.
The length of the code reduces as only we need to specify the location of the js file.

Disadvantages of External JavaScript
There are the following disadvantages of external files:

The stealer may download the coder's code using the url of the js file.
If two js files are dependent on one another, then a failure in one file may affect the execution of the other 
dependent file.

The web browser needs to make an additional http request to get the js code.

A tiny to a large change in the js code may cause unexpected results in all its dependent files.

We need to check each file that depends on the commonly created external javascript file.

If it is a few lines of code, then better to implement the internal javascript code.


JavaScript Comment

The JavaScript comments are meaningful way to deliver message. 
It is used to add information about the code, warnings or suggestions so that end user can easily interpret
 the code.

The JavaScript comment is ignored by the JavaScript engine i.e. embedded in the browser.

Advantages of JavaScript comments
There are mainly two advantages of JavaScript comments.


To make code easy to understand It can be used to elaborate the code so that end user can easily understand the 
code.
To avoid the unnecessary code It can also be used to avoid the code being executed. 
Sometimes, we add the code to perform some action. But after sometime, there may be need to disable the code. 
In such case, it is better to use comments.

Types of JavaScript Comments
There are two types of comments in JavaScript.

Single-line Comment
Multi-line Comment

 
JavaScript Single line Comment
It is represented by double forward slashes (//). It can be used before and after the statement.

Let’s see the example of single-line comment i.e. added before the statement.

<script>  
// It is single line comment  
document.write("hello javascript");  
</script>  
Test it Now
Let’s see the example of single-line comment i.e. added after the statement.

<script>  
var a=10;  
var b=20;  
var c=a+b;//It adds values of a and b variable  
document.write(c);//prints sum of 10 and 20  
</script>  
Test it Now
JavaScript Multi line Comment
It can be used to add single as well as multi line comments. So, it is more convenient.

It is represented by forward slash with asterisk then asterisk with forward slash. For example:

/* your code here  */  
It can be used before, after and middle of the statement.

<script>  
/* It is multi line comment.  
It will not be displayed */  
document.write("example of javascript multiline comment");  
</script>  


JavaScript Variable

A JavaScript variable is simply a name of storage location. There are two types of variables in JavaScript : local variable and global variable.

There are some rules while declaring a JavaScript variable (also known as identifiers).

Name must start with a letter (a to z or A to Z), underscore( _ ), or dollar( $ ) sign.
After first letter we can use digits (0 to 9), for example value1.
JavaScript variables are case sensitive, for example x and X are different variables.
Correct JavaScript variables
var x = 10;  
var _value="sonoo";  
Incorrect JavaScript variables
var  123=30;  
var *aa=320;  
Example of JavaScript variable
Let’s see a simple example of JavaScript variable.


<script>  
var x = 10;  
var y = 20;  
var z=x+y;  
document.write(z);  
</script>  
Test it Now
Output of the above example
30

 
JavaScript local variable
A JavaScript local variable is declared inside block or function. 
It is accessible within the function or block only. For example:

<script>  
function abc(){  
var x=10;//local variable  
}  
</script>  
Or,

<script>  
If(10<13){  
var y=20;//JavaScript local variable  
}  
</script>  
JavaScript global variable
A JavaScript global variable is accessible from any function. 
A variable i.e. declared outside the function or declared with window object is known as global variable.
 For example:

<script>  
var data=200;//gloabal variable  
function a(){  
document.writeln(data);  
}  
function b(){  
document.writeln(data);  
}  
a();//calling JavaScript function  
b();  
</script>  


JavaScript Global Variable
A JavaScript global variable is declared outside the function or declared with window object. 
It can be accessed from any function.

Let’s see the simple example of global variable in JavaScript.

<html>
<body>
<script>  
var value=50;//global variable  
function a(){  
alert(value);  
}  
function b(){  
alert(value);  
}  

a();
</script>  
</body>
</html>

Declaring JavaScript global variable within function
To declare JavaScript global variables inside function, you need to use window object. For example:


window.value=90;  
Now it can be declared inside any function and can be accessed from any function. For example:

function m(){  
window.value=100;//declaring global variable by window object  
}  
function n(){  
alert(window.value);//accessing global variable from other function  
}  
Test it Now

 
Internals of global variable in JavaScript
When you declare a variable outside the function, it is added in the window object internally. You can access it through window object also. For example:

var value=50;  
function a(){  
alert(window.value);//accessing global variable   
}  

Javascript Data Types

JavaScript provides different data types to hold different types of values. 
There are two types of data types in JavaScript.

Primitive data type
Non-primitive (reference) data type
JavaScript is a dynamic type language, means you don't need to specify type of the variable 
because it is dynamically used by JavaScript engine. You need to use var here to specify the data type. 
It can hold any type of values such as numbers, strings etc. For example:

var a=40;//holding number  
var b="Rahul";//holding string  
JavaScript primitive data types
There are five types of primitive data types in JavaScript. They are as follows:

Data Type	Description
String	represents sequence of characters e.g. "hello"
Number	represents numeric values e.g. 100
Boolean	represents boolean value either false or true
Undefined	represents undefined value
Null	represents null i.e. no value at all

 
JavaScript non-primitive data types
The non-primitive data types are as follows:


Data Type	Description
Object	represents instance through which we can access members
Array	represents group of similar values
RegExp	represents regular expression



JavaScript Operators
JavaScript operators are symbols that are used to perform operations on operands. For example:

var sum=10+20;  
Here, + is the arithmetic operator and = is the assignment operator.

There are following types of operators in JavaScript.

Arithmetic Operators
Comparison (Relational) Operators
Bitwise Operators
Logical Operators
Assignment Operators
Special Operators

JavaScript Arithmetic Operators
Arithmetic operators are used to perform arithmetic operations on the operands. 
The following operators are known as JavaScript arithmetic operators.


Operator	Description	Example
+	Addition	10+20 = 30
-	Subtraction	20-10 = 10
*	Multiplication	10*20 = 200
/	Division	20/10 = 2
%	Modulus (Remainder)	20%10 = 0
++	Increment	var a=10; a++; Now a = 11
--	Decrement	var a=10; a--; Now a = 9

 
JavaScript Comparison Operators
The JavaScript comparison operator compares the two operands. The comparison operators are as follows:

Operator	Description	Example
==	Is equal to	10==20 = false
===	Identical (equal and of same type)	10==20 = false
!=	Not equal to	10!=20 = true
!==	Not Identical	20!==20 = false
>	Greater than	20>10 = true
>=	Greater than or equal to	20>=10 = true
<	Less than	20<10 = false
<=	Less than or equal to	20<=10 = false
JavaScript Bitwise Operators
The bitwise operators perform bitwise operations on operands. The bitwise operators are as follows:

Operator	Description	Example
&	Bitwise AND	(10==20 & 20==33) = false
|	Bitwise OR	(10==20 | 20==33) = false
^	Bitwise XOR	(10==20 ^ 20==33) = false
~	Bitwise NOT	(~10) = -10
<<	Bitwise Left Shift	(10<<2) = 40
>>	Bitwise Right Shift	(10>>2) = 2
>>>	Bitwise Right Shift with Zero	(10>>>2) = 2
JavaScript Logical Operators
The following operators are known as JavaScript logical operators.

Operator	Description	Example
&&	Logical AND	(10==20 && 20==33) = false
||	Logical OR	(10==20 || 20==33) = false
!	Logical Not	!(10==20) = true
JavaScript Assignment Operators
The following operators are known as JavaScript assignment operators.

Operator	Description	Example
=	Assign	10+10 = 20
+=	Add and assign	var a=10; a+=20; Now a = 30
-=	Subtract and assign	var a=20; a-=10; Now a = 10
*=	Multiply and assign	var a=10; a*=20; Now a = 200
/=	Divide and assign	var a=10; a/=2; Now a = 5
%=	Modulus and assign	var a=10; a%=2; Now a = 0
JavaScript Special Operators
The following operators are known as JavaScript special operators.

Operator	Description
(?:)	Conditional Operator returns value based on the condition. It is like if-else.
,	Comma Operator allows multiple expressions to be evaluated as single statement.
delete	Delete Operator deletes a property from the object.
in	In Operator checks if object has the given property
instanceof	checks if the object is an instance of given type
new	creates an instance (object)
typeof	checks the type of object.
void	it discards the expression's return value.
yield	checks what is returned in a generator by the generator's iterator.


JavaScript If-else
The JavaScript if-else statement is used to execute the code whether condition is true or false. There are three forms of if statement in JavaScript.

If Statement
If else statement
if else if statement
JavaScript If statement
It evaluates the content only if expression is true. The signature of JavaScript if statement is given below.

if(expression){  
//content to be evaluated  
}  
Flowchart of JavaScript If statement
if statement in javaScript
Let’s see the simple example of if statement in javascript.

<script>  
var a=20;  
if(a>10){  
document.write("value of a is greater than 10");  
}  
</script>  
Test it Now
Output of the above example
value of a is greater than 10

 
JavaScript If...else Statement
It evaluates the content whether condition is true of false. 
The syntax of JavaScript if-else statement is given below.


if(expression){  
//content to be evaluated if condition is true  
}  
else{  
//content to be evaluated if condition is false  
}  
Flowchart of JavaScript If...else statement
if else statement in javaScript
Let’s see the example of if-else statement in JavaScript to find out the even or odd number.

<script>  
var a=20;  
if(a%2==0){  
document.write("a is even number");  
}  
else{  
document.write("a is odd number");  
}  
</script>  

Test it Now

Output of the above example
a is even number

JavaScript If...else if statement

It evaluates the content only if expression is true from several expressions.
 The signature of JavaScript if else if statement is given below.

if(expression1){  
//content to be evaluated if expression1 is true  
}  
else if(expression2){  
//content to be evaluated if expression2 is true  
}  
else if(expression3){  
//content to be evaluated if expression3 is true  
}  
else{  
//content to be evaluated if no expression is true  
}  
Let’s see the simple example of if else if statement in javascript.

<script>  
var a=20;  
if(a==10){  
document.write("a is equal to 10");  
}  
else if(a==15){  
document.write("a is equal to 15");  
}  
else if(a==20){  
document.write("a is equal to 20");  
}  
else{  
document.write("a is not equal to 10, 15 or 20");  
}  
</script>  

Test it Now

Output of the above example

a is equal to 20



JavaScript Switch
The JavaScript switch statement is used to execute one code from multiple expressions. It is just like else if statement that we have learned in previous page. But it is convenient than if..else..if because it can be used with numbers, characters etc.

The signature of JavaScript switch statement is given below.

switch(expression){  
case value1:  
 code to be executed;  
 break;  
case value2:  
 code to be executed;  
 break;  
......  
  
default:   
 code to be executed if above values are not matched;  
}  
Let’s see the simple example of switch statement in javascript.

<script>  
var grade='B';  
var result;  
switch(grade){  
case 'A':  
result="A Grade";  
break;  
case 'B':  
result="B Grade";  
break;  
case 'C':  
result="C Grade";  
break;  
default:  
result="No Grade";  
}  
document.write(result);  
</script>  

Test it Now

Output of the above example
B Grade

JavaScript Loops
The JavaScript loops are used to iterate the piece of code using for, while, do while or for-in loops. It makes the code compact. It is mostly used in array.

There are four types of loops in JavaScript.

for loop
while loop
do-while loop
for-in loop
1) JavaScript For loop
The JavaScript for loop iterates the elements for the fixed number of times. It should be used if number of iteration is known. The syntax of for loop is given below.

for (initialization; condition; increment)  
{  
    code to be executed  
}  
Let’s see the simple example of for loop in javascript.


<script>  
for (i=1; i<=5; i++)  
{  
document.write(i + "<br/>")  
}  
</script>  
Test it Now
Output:

1
2
3
4
5

 
2) JavaScript while loop
The JavaScript while loop iterates the elements for the infinite number of times. It should be used if number of iteration is not known. The syntax of while loop is given below.

while (condition)  
{  
    code to be executed  
}  
Let’s see the simple example of while loop in javascript.

<script>  
var i=11;  
while (i<=15)  
{  
document.write(i + "<br/>");  
i++;  
}  
</script>  
Test it Now
Output:

11
12
13
14
15
3) JavaScript do while loop
The JavaScript do while loop iterates the elements for the infinite number of times like while loop. But, code is executed at least once whether condition is true or false. The syntax of do while loop is given below.

do{  
    code to be executed  
}while (condition);  
Let’s see the simple example of do while loop in javascript.

<script>  
var i=21;  
do{  
document.write(i + "<br/>");  
i++;  
}while (i<=25);  
</script>  
Test it Now
Output:

21
22
23
24
25

4) JavaScript for in loop
The JavaScript for in loop is used to iterate the properties of an object.

JavaScript Functions
JavaScript functions are used to perform operations. We can call JavaScript function many times to reuse the code.

Advantage of JavaScript function
There are mainly two advantages of JavaScript functions.

Code reusability: We can call a function several times so it save coding.
Less coding: It makes our program compact. We don’t need to write many lines of code each time to perform a common task.
JavaScript Function Syntax
The syntax of declaring function is given below.

function functionName([arg1, arg2, ...argN]){  
 //code to be executed  
}  
JavaScript Functions can have 0 or more arguments.


JavaScript Function Example
Let’s see the simple example of function in JavaScript that does not has arguments.

<script>  
function msg(){  
alert("hello! this is message");  
}  
</script>  
<input type="button" onclick="msg()" value="call function"/>  
Test it Now
Output of the above example

 
JavaScript Function Arguments
We can call function by passing arguments. Let’s see the example of function that has one argument.

<script>  
function getcube(number){  
alert(number*number*number);  
}  
</script>  
<form>  
<input type="button" value="click" onclick="getcube(4)"/>  
</form>  
Test it Now
Output of the above example
Function with Return Value
We can call function that returns a value and use it in our program. Let’s see the example of function that returns value.

<script>  
function getInfo(){  
return "hello javatpoint! How r u?";  
}  
</script>  
<script>  
document.write(getInfo());  
</script>  
Test it Now
Output of the above example
hello javatpoint! How r u?
JavaScript Function Object
In JavaScript, the purpose of Function constructor is to create a new Function object. It executes the code globally. However, if we call the constructor directly, a function is created dynamically but in an unsecured way.

Syntax
new Function ([arg1[, arg2[, ....argn]],] functionBody)  
Parameter
arg1, arg2, .... , argn - It represents the argument used by function.

functionBody - It represents the function definition.

JavaScript Function Methods
Let's see function methods with description.

Method	Description
apply()	It is used to call a function contains this value and a single array of arguments.
bind()	It is used to create a new function.
call()	It is used to call a function contains this value and an argument list.
toString()	It returns the result in a form of a string.
JavaScript Function Object Examples
Example 1
Let's see an example to display the sum of given numbers.


<script>  
var add=new Function("num1","num2","return num1+num2");  
document.writeln(add(2,5));  
</script>  
Test it Now
Output:

7
Example 2
Let's see an example to display the power of provided value.

<script>  
var pow=new Function("num1","num2","return Math.pow(num1,num2)");  
document.writeln(pow(2,3));  
</script>  

Test it Now
Output:

8

JavaScript Objects
A javaScript object is an entity having state and behavior (properties and method). 
For example: car, pen, bike, chair, glass, keyboard, monitor etc.

JavaScript is an object-based language. Everything is an object in JavaScript.

JavaScript is template based not class based. Here, we don't create class to get the object. 
But, we direct create objects.

Creating Objects in JavaScript
There are 3 ways to create objects.


By object literal
By creating instance of Object directly (using new keyword)
By using an object constructor (using new keyword)

1) JavaScript Object by object literal
The syntax of creating object using object literal is given below:

object={property1:value1,property2:value2.....propertyN:valueN}  
As you can see, property and value is separated by : (colon).

Let’s see the simple example of creating object in JavaScript.

<script>  
emp={id:102,name:"Shyam Kumar",salary:40000}  
document.write(emp.id+" "+emp.name+" "+emp.salary);  
</script>  

Output of the above example

102 Shyam Kumar 40000

2) By creating instance of Object
The syntax of creating object directly is given below:

var objectname=new Object();  
Here, new keyword is used to create object.

Let’s see the example of creating object directly.

<script>  
var emp=new Object();  
emp.id=101;  
emp.name="Ravi Malik";  
emp.salary=50000;  
document.write(emp.id+" "+emp.name+" "+emp.salary);  
</script>  

Test it Now

Output of the above example
101 Ravi 50000


3) By using an Object constructor
Here, you need to create function with arguments. 
Each argument value can be assigned in the current object by using this keyword.

The this keyword refers to the current object.

The example of creating object by object constructor is given below.

<script>  
function emp(id,name,salary){  
this.id=id;  
this.name=name;  
this.salary=salary;  
}  
e=new emp(103,"Vimal Jaiswal",30000);  
  
document.write(e.id+" "+e.name+" "+e.salary);  
</script>  

Output of the above example
103 Vimal Jaiswal 30000

Defining method in JavaScript Object
We can define method in JavaScript object. But before defining method, we need to add property in the function with same name as method.

The example of defining method in object is given below.

<script>  
function emp(id,name,salary){  
this.id=id;  
this.name=name;  
this.salary=salary;  
  
this.changeSalary=changeSalary;  
function changeSalary(otherSalary){  
this.salary=otherSalary;  
}  
}  
e=new emp(103,"Sonoo Jaiswal",30000);  
document.write(e.id+" "+e.name+" "+e.salary);  
e.changeSalary(45000);  
document.write("<br>"+e.id+" "+e.name+" "+e.salary);  
</script>  

Test it Now

Output of the above example
103 Sonoo Jaiswal 30000
103 Sonoo Jaiswal 45000

JavaScript Object Methods
The various methods of Object are as follows:


S.No	Methods	Description
1	Object.assign()	This method is used to copy enumerable and own properties from a source object to a target object
2	Object.create()	This method is used to create a new object with the specified prototype object and properties.
3	Object.defineProperty()	This method is used to describe some behavioral attributes of the property.
4	Object.defineProperties()	This method is used to create or configure multiple object properties.
5	Object.entries()	This method returns an array with arrays of the key, value pairs.
6	Object.freeze()	This method prevents existing properties from being removed.
7	Object.getOwnPropertyDescriptor()	This method returns a property descriptor for the specified property of the specified object.
8	Object.getOwnPropertyDescriptors()	This method returns all own property descriptors of a given object.
9	Object.getOwnPropertyNames()	This method returns an array of all properties (enumerable or not) found.
10	Object.getOwnPropertySymbols()	This method returns an array of all own symbol key properties.
11	Object.getPrototypeOf()	This method returns the prototype of the specified object.
12	Object.is()	This method determines whether two values are the same value.
13	Object.isExtensible()	This method determines if an object is extensible
14	Object.isFrozen()	This method determines if an object was frozen.
15	Object.isSealed()	This method determines if an object is sealed.
16	Object.keys()	This method returns an array of a given object's own property names.
17	Object.preventExtensions()	This method is used to prevent any extensions of an object.
18	Object.seal()	This method prevents new properties from being added and marks all existing properties as non-configurable.
19	Object.setPrototypeOf()	This method sets the prototype of a specified object to another object.
20	Object.values()	This method returns an array of values.


avaScript Array
JavaScript array is an object that represents a collection of similar type of elements.

There are 3 ways to construct array in JavaScript

By array literal
By creating instance of Array directly (using new keyword)
By using an Array constructor (using new keyword)
1) JavaScript array literal
The syntax of creating array using array literal is given below:

var arrayname=[value1,value2.....valueN];  
As you can see, values are contained inside [ ] and separated by , (comma).


Let's see the simple example of creating and using array in JavaScript.

<script>  
var emp=["Sonoo","Vimal","Ratan"];  
for (i=0;i<emp.length;i++){  
document.write(emp[i] + "<br/>");  
}  
</script>  
Test it Now
The .length property returns the length of an array.

Output of the above example

Sonoo
Vimal
Ratan
2) JavaScript Array directly (new keyword)
The syntax of creating array directly is given below:

var arrayname=new Array();  
Here, new keyword is used to create instance of array.

Let's see the example of creating array directly.

<script>  
var i;  
var emp = new Array();  
emp[0] = "Arun";  
emp[1] = "Varun";  
emp[2] = "John";  
  
for (i=0;i<emp.length;i++){  
document.write(emp[i] + "<br>");  
}  
</script>  
Test it Now
Output of the above example

Arun
Varun
John
3) JavaScript array constructor (new keyword)
Here, you need to create instance of array by passing arguments in constructor so that we don't have to provide value explicitly.


The example of creating object by array constructor is given below.

<script>  
var emp=new Array("Jai","Vijay","Smith");  
for (i=0;i<emp.length;i++){  
document.write(emp[i] + "<br>");  
}  
</script>  
Test it Now
Output of the above example

Jai
Vijay
Smith
JavaScript Array Methods
Let's see the list of JavaScript array methods with their description.

Methods	Description
concat()	It returns a new array object that contains two or more merged arrays.
copywithin()	It copies the part of the given array with its own elements and returns the modified array.
entries()	It creates an iterator object and a loop that iterates over each key/value pair.
every()	It determines whether all the elements of an array are satisfying the provided function conditions.
flat()	It creates a new array carrying sub-array elements concatenated recursively till the specified depth.
flatMap()	It maps all array elements via mapping function, then flattens the result into a new array.
fill()	It fills elements into an array with static values.
from()	It creates a new array carrying the exact copy of another array element.
filter()	It returns the new array containing the elements that pass the provided function conditions.
find()	It returns the value of the first element in the given array that satisfies the specified condition.
findIndex()	It returns the index value of the first element in the given array that satisfies the specified condition.
forEach()	It invokes the provided function once for each element of an array.
includes()	It checks whether the given array contains the specified element.
indexOf()	It searches the specified element in the given array and returns the index of the first match.
isArray()	It tests if the passed value ia an array.
join()	It joins the elements of an array as a string.
keys()	It creates an iterator object that contains only the keys of the array, then loops through these keys.
lastIndexOf()	It searches the specified element in the given array and returns the index of the last match.
map()	It calls the specified function for every array element and returns the new array
of()	It creates a new array from a variable number of arguments, holding any type of argument.
pop()	It removes and returns the last element of an array.
push()	It adds one or more elements to the end of an array.
reverse()	It reverses the elements of given array.
reduce(function, initial)	It executes a provided function for each value from left to right and reduces the array to a single value.
reduceRight()	It executes a provided function for each value from right to left and reduces the array to a single value.
some()	It determines if any element of the array passes the test of the implemented function.
shift()	It removes and returns the first element of an array.
slice()	It returns a new array containing the copy of the part of the given array.
sort()	It returns the element of the given array in a sorted order.
splice()	It add/remove elements to/from the given array.
toLocaleString()	It returns a string containing all the elements of a specified array.
toString()	It converts the elements of a specified array into string form, without affecting the original array.
unshift()	It adds one or more elements in the beginning of the given array.
values()	It creates a new iterator object carrying values for each index in the array.



JavaScript String
The JavaScript string is an object that represents a sequence of characters.

There are 2 ways to create string in JavaScript

By string literal
By string object (using new keyword)
1) By string literal
The string literal is created using double quotes. The syntax of creating string using string literal is given below:

var stringname="string value";  
Let's see the simple example of creating string literal.


<script>  
var str="This is string literal";  
document.write(str);  
</script>  
Test it Now
Output:

This is string literal
2) By string object (using new keyword)
The syntax of creating string object using new keyword is given below:

var stringname=new String("string literal");  
Here, new keyword is used to create instance of string.

Let's see the example of creating string in JavaScript by new keyword.

<script>  
var stringname=new String("hello javascript string");  
document.write(stringname);  
</script>  
Test it Now
Output:

hello javascript string
JavaScript String Methods
Let's see the list of JavaScript string methods with examples.

Methods	Description
charAt()	It provides the char value present at the specified index.
charCodeAt()	It provides the Unicode value of a character present at the specified index.
concat()	It provides a combination of two or more strings.
indexOf()	It provides the position of a char value present in the given string.
lastIndexOf()	It provides the position of a char value present in the given string by searching a character from the last position.
search()	It searches a specified regular expression in a given string and returns its position if a match occurs.
match()	It searches a specified regular expression in a given string and returns that regular expression if a match occurs.
replace()	It replaces a given string with the specified replacement.
substr()	It is used to fetch the part of the given string on the basis of the specified starting position and length.
substring()	It is used to fetch the part of the given string on the basis of the specified index.
slice()	It is used to fetch the part of the given string. It allows us to assign positive as well negative index.
toLowerCase()	It converts the given string into lowercase letter.
toLocaleLowerCase()	It converts the given string into lowercase letter on the basis of host?s current locale.
toUpperCase()	It converts the given string into uppercase letter.
toLocaleUpperCase()	It converts the given string into uppercase letter on the basis of host?s current locale.
toString()	It provides a string representing the particular object.
valueOf()	It provides the primitive value of string object.
split()	It splits a string into substring array, then returns that newly created array.
trim()	It trims the white space from the left and right side of the string.
1) JavaScript String charAt(index) Method
The JavaScript String charAt() method returns the character at the given index.

<script>  
var str="javascript";  
document.write(str.charAt(2));  
</script>  
Test it Now
Output:


v
2) JavaScript String concat(str) Method
The JavaScript String concat(str) method concatenates or joins two strings.

<script>  
var s1="javascript ";  
var s2="concat example";  
var s3=s1.concat(s2);  
document.write(s3);  
</script>  
Test it Now
Output:

javascript concat example
3) JavaScript String indexOf(str) Method
The JavaScript String indexOf(str) method returns the index position of the given string.

<script>  
var s1="javascript from javatpoint indexof";  
var n=s1.indexOf("from");  
document.write(n);  
</script>  
Test it Now
Output:

11
4) JavaScript String lastIndexOf(str) Method
The JavaScript String lastIndexOf(str) method returns the last index position of the given string.

<script>  
var s1="javascript from javatpoint indexof";  
var n=s1.lastIndexOf("java");  
document.write(n);  
</script>  
Test it Now
Output:

16
5) JavaScript String toLowerCase() Method
The JavaScript String toLowerCase() method returns the given string in lowercase letters.

<script>  
var s1="JavaScript toLowerCase Example";  
var s2=s1.toLowerCase();  
document.write(s2);  
</script>  
Test it Now
Output:


javascript tolowercase example
6) JavaScript String toUpperCase() Method
The JavaScript String toUpperCase() method returns the given string in uppercase letters.

<script>  
var s1="JavaScript toUpperCase Example";  
var s2=s1.toUpperCase();  
document.write(s2);  
</script>  
Test it Now
Output:

JAVASCRIPT TOUPPERCASE EXAMPLE
7) JavaScript String slice(beginIndex, endIndex) Method
The JavaScript String slice(beginIndex, endIndex) method returns the parts of string from given beginIndex to endIndex. In slice() method, beginIndex is inclusive and endIndex is exclusive.

<script>  
var s1="abcdefgh";  
var s2=s1.slice(2,5);  
document.write(s2);  
</script>  
Test it Now
Output:

cde

8) JavaScript String trim() Method
The JavaScript String trim() method removes leading and trailing whitespaces from the string.

<script>  
var s1="     javascript trim    ";  
var s2=s1.trim();  
document.write(s2);  
</script>  
Test it Now
Output:

javascript trim
9) JavaScript String split() Method
<script>  
var str="This is JavaTpoint website";  
document.write(str.split(" ")); //splits the given string.  
</script>  


JavaScript Date Object
The JavaScript date object can be used to get year, month and day. You can display a timer on the webpage by the help of JavaScript date object.

You can use different Date constructors to create date object. It provides methods to get and set day, month, year, hour, minute and seconds.

Constructor
You can use 4 variant of Date constructor to create date object.

Date()
Date(milliseconds)
Date(dateString)
Date(year, month, day, hours, minutes, seconds, milliseconds)
JavaScript Date Methods
Let's see the list of JavaScript date methods with their description.


Methods	Description
getDate()	It returns the integer value between 1 and 31 that represents the day for the specified date on the basis of local time.
getDay()	It returns the integer value between 0 and 6 that represents the day of the week on the basis of local time.
getFullYears()	It returns the integer value that represents the year on the basis of local time.
getHours()	It returns the integer value between 0 and 23 that represents the hours on the basis of local time.
getMilliseconds()	It returns the integer value between 0 and 999 that represents the milliseconds on the basis of local time.
getMinutes()	It returns the integer value between 0 and 59 that represents the minutes on the basis of local time.
getMonth()	It returns the integer value between 0 and 11 that represents the month on the basis of local time.
getSeconds()	It returns the integer value between 0 and 60 that represents the seconds on the basis of local time.
getUTCDate()	It returns the integer value between 1 and 31 that represents the day for the specified date on the basis of universal time.
getUTCDay()	It returns the integer value between 0 and 6 that represents the day of the week on the basis of universal time.
getUTCFullYears()	It returns the integer value that represents the year on the basis of universal time.
getUTCHours()	It returns the integer value between 0 and 23 that represents the hours on the basis of universal time.
getUTCMinutes()	It returns the integer value between 0 and 59 that represents the minutes on the basis of universal time.
getUTCMonth()	It returns the integer value between 0 and 11 that represents the month on the basis of universal time.
getUTCSeconds()	It returns the integer value between 0 and 60 that represents the seconds on the basis of universal time.
setDate()	It sets the day value for the specified date on the basis of local time.
setDay()	It sets the particular day of the week on the basis of local time.
setFullYears()	It sets the year value for the specified date on the basis of local time.
setHours()	It sets the hour value for the specified date on the basis of local time.
setMilliseconds()	It sets the millisecond value for the specified date on the basis of local time.
setMinutes()	It sets the minute value for the specified date on the basis of local time.
setMonth()	It sets the month value for the specified date on the basis of local time.
setSeconds()	It sets the second value for the specified date on the basis of local time.
setUTCDate()	It sets the day value for the specified date on the basis of universal time.
setUTCDay()	It sets the particular day of the week on the basis of universal time.
setUTCFullYears()	It sets the year value for the specified date on the basis of universal time.
setUTCHours()	It sets the hour value for the specified date on the basis of universal time.
setUTCMilliseconds()	It sets the millisecond value for the specified date on the basis of universal time.
setUTCMinutes()	It sets the minute value for the specified date on the basis of universal time.
setUTCMonth()	It sets the month value for the specified date on the basis of universal time.
setUTCSeconds()	It sets the second value for the specified date on the basis of universal time.
toDateString()	It returns the date portion of a Date object.
toISOString()	It returns the date in the form ISO format string.
toJSON()	It returns a string representing the Date object. It also serializes the Date object during JSON serialization.
toString()	It returns the date in the form of string.
toTimeString()	It returns the time portion of a Date object.
toUTCString()	It converts the specified date in the form of string using UTC time zone.
valueOf()	It returns the primitive value of a Date object.
JavaScript Date Example
Let's see the simple example to print date object. It prints date and time both.

Current Date and Time: <span id="txt"></span>  
<script>  
var today=new Date();  
document.getElementById('txt').innerHTML=today;  
</script>  
Test it Now
Output:

Current Date and Time: Fri Aug 20 2021 16:10:55 GMT+0530 (India Standard Time)  
  
Let's see another code to print date/month/year.

<script>  
var date=new Date();  
var day=date.getDate();  
var month=date.getMonth()+1;  
var year=date.getFullYear();  
document.write("<br>Date is: "+day+"/"+month+"/"+year);  
</script>  
Output:

Date is: 20/8/2021  
JavaScript Current Time Example
Let's see the simple example to print current time of system.

Current Time: <span id="txt"></span>  
<script>  
var today=new Date();  
var h=today.getHours();  
var m=today.getMinutes();  
var s=today.getSeconds();  
document.getElementById('txt').innerHTML=h+":"+m+":"+s;  
</script>  
Test it Now
Output:

Current Time: 16:10:55

JavaScript Digital Clock Example
Let's see the simple example to display digital clock using JavaScript date object.

There are two ways to set interval in JavaScript: by setTimeout() or setInterval() method.


Current Time: <span id="txt"></span>  
<script>  
window.onload=function(){getTime();}  
function getTime(){  
var today=new Date();  
var h=today.getHours();  
var m=today.getMinutes();  
var s=today.getSeconds();  
// add a zero in front of numbers<10  
m=checkTime(m);  
s=checkTime(s);  
document.getElementById('txt').innerHTML=h+":"+m+":"+s;  
setTimeout(function(){getTime()},1000);  
}  
//setInterval("getTime()",1000);//another way  
function checkTime(i){  
if (i<10){  
  i="0" + i;  
 }  
return i;  
}  
</script>  
Test it Now
Output:

Current Time: 16:20:45

JavaScript Math
The JavaScript math object provides several constants and methods to perform mathematical operation. Unlike date object, it doesn't have constructors.

JavaScript Math Methods
Let's see the list of JavaScript Math methods with description.

Methods	Description
abs()	It returns the absolute value of the given number.
acos()	It returns the arccosine of the given number in radians.
asin()	It returns the arcsine of the given number in radians.
atan()	It returns the arc-tangent of the given number in radians.
cbrt()	It returns the cube root of the given number.
ceil()	It returns a smallest integer value, greater than or equal to the given number.
cos()	It returns the cosine of the given number.
cosh()	It returns the hyperbolic cosine of the given number.
exp()	It returns the exponential form of the given number.
floor()	It returns largest integer value, lower than or equal to the given number.
hypot()	It returns square root of sum of the squares of given numbers.
log()	It returns natural logarithm of a number.
max()	It returns maximum value of the given numbers.
min()	It returns minimum value of the given numbers.
pow()	It returns value of base to the power of exponent.
random()	It returns random number between 0 (inclusive) and 1 (exclusive).
round()	It returns closest integer value of the given number.
sign()	It returns the sign of the given number
sin()	It returns the sine of the given number.
sinh()	It returns the hyperbolic sine of the given number.
sqrt()	It returns the square root of the given number
tan()	It returns the tangent of the given number.
tanh()	It returns the hyperbolic tangent of the given number.
trunc()	It returns an integer part of the given number.
Math.sqrt(n)
The JavaScript math.sqrt(n) method returns the square root of the given number.

Square Root of 17 is: <span id="p1"></span>    
<script>    
document.getElementById('p1').innerHTML=Math.sqrt(17);    
</script>    
Test it Now
Output:

Square Root of 17 is: 4.123105625617661 

 
Math.random()
The JavaScript math.random() method returns the random number between 0 to 1.

Random Number is: <span id="p2"></span>    
<script>    
document.getElementById('p2').innerHTML=Math.random();    
</script>   
Test it Now
Output:

Random Number is: 0.7498161881845111
Math.pow(m,n)
The JavaScript math.pow(m,n) method returns the m to the power of n that is mn.

3 to the power of 4 is: <span id="p3"></span>    
<script>    
document.getElementById('p3').innerHTML=Math.pow(3,4);    
</script>    
Test it Now
Output:

3 to the power of 4 is: 81
Math.floor(n)
The JavaScript math.floor(n) method returns the lowest integer for the given number. For example 3 for 3.7, 5 for 5.9 etc.

Floor of 4.6 is: <span id="p4"></span>    
<script>    
document.getElementById('p4').innerHTML=Math.floor(4.6);    
</script>    
Test it Now
Output:

Floor of 4.6 is: 4
Math.ceil(n)
The JavaScript math.ceil(n) method returns the largest integer for the given number. For example 4 for 3.7, 6 for 5.9 etc.

Ceil of 4.6 is: <span id="p5"></span>    
<script>    
document.getElementById('p5').innerHTML=Math.ceil(4.6);    
</script>    
Test it Now
Output:

Ceil of 4.6 is: 5
Math.round(n)
The JavaScript math.round(n) method returns the rounded integer nearest for the given number. If fractional part is equal or greater than 0.5, it goes to upper value 1 otherwise lower value 0. For example 4 for 3.7, 3 for 3.3, 6 for 5.9 etc.

Round of 4.3 is: <span id="p6"></span><br>    
Round of 4.7 is: <span id="p7"></span>    
<script>    
document.getElementById('p6').innerHTML=Math.round(4.3);   
document.getElementById('p7').innerHTML=Math.round(4.7);    
</script>    
Test it Now
Output:

Round of 4.3 is: 4
Round of 4.7 is: 5
Math.abs(n)
The JavaScript math.abs(n) method returns the absolute value for the given number. For example 4 for -4, 6.6 for -6.6 etc.

Absolute value of -4 is: <span id="p8"></span>      
<script>      
document.getElementById('p8').innerHTML=Math.abs(-4);      
</script>   
Test it Now
Output:

Absolute value of -4 is: 4


JavaScript Number Object
The JavaScript number object enables you to represent a numeric value. It may be integer or floating-point. JavaScript number object follows IEEE standard to represent the floating-point numbers.

By the help of Number() constructor, you can create number object in JavaScript. For example:

var n=new Number(value);  
If value can't be converted to number, it returns NaN(Not a Number) that can be checked by isNaN() method.

You can direct assign a number to a variable also. For example:


var x=102;//integer value  
var y=102.7;//floating point value  
var z=13e4;//exponent value, output: 130000  
var n=new Number(16);//integer value by number object  
Test it Now
Output:

102 102.7 130000 16  
JavaScript Number Constants
Let's see the list of JavaScript number constants with description.

Constant	Description
MIN_VALUE	returns the largest minimum value.
MAX_VALUE	returns the largest maximum value.
POSITIVE_INFINITY	returns positive infinity, overflow value.
NEGATIVE_INFINITY	returns negative infinity, overflow value.
NaN	represents "Not a Number" value.
JavaScript Number Methods
Let's see the list of JavaScript number methods with their description.

Methods	Description
isFinite()	It determines whether the given value is a finite number.
isInteger()	It determines whether the given value is an integer.
parseFloat()	It converts the given string into a floating point number.
parseInt()	It converts the given string into an integer number.
toExponential()	It returns the string that represents exponential notation of the given number.
toFixed()	It returns the string that represents a number with exact digits after a decimal point.
toPrecision()	It returns the string representing a number of specified precision.
toString()	It returns the given number in the form of string.

JavaScript Boolean
JavaScript Boolean is an object that represents value in two states: true or false. You can create the JavaScript Boolean object by Boolean() constructor as given below.

Boolean b=new Boolean(value);  
The default value of JavaScript Boolean object is false.

JavaScript Boolean Example
<script>  
document.write(10<20);//true  
document.write(10<5);//false  
</script>  

 
JavaScript Boolean Properties
Property	Description
constructor	returns the reference of Boolean function that created Boolean object.
prototype	enables you to add properties and methods in Boolean prototype.
JavaScript Boolean Methods
Method	Description
toSource()	returns the source of Boolean object as a string.
toString()	converts Boolean into String.
valueOf()	converts other type into Boolean.


Browser Object Model

The Browser Object Model (BOM) is used to interact with the browser.

The default object of browser is window means you can call all the functions of window by 
specifying window or directly. For example:

window.alert("hello javatpoint");  
is same as:

alert("hello javatpoint");  
You can use a lot of properties (other objects) defined underneath the window object like document, history, 
screen, navigator, location, innerHeight, innerWidth,


Note: The document object represents an html document. It forms DOM (Document Object Model).



Window Object


The window object represents a window in browser. An object of window is created automatically by the browser.

Window is the object of browser, it is not the object of javascript. The javascript objects are string, array, 
date etc.

Note: if html document contains frame or iframe, browser creates additional window objects for each frame.
Methods of window object
The important methods of window object are as follows:

Method	Description
alert()	displays the alert box containing message with ok button.
confirm()	displays the confirm dialog box containing message with ok and cancel button.
prompt()	displays a dialog box to get input from the user.
open()	opens the new window.
close()	closes the current window.
setTimeout()	performs action after specified time like calling function, evaluating expressions etc.

 
Example of alert() in javascript
It displays alert dialog box. It has message and ok button.

<script type="text/javascript">  
function msg(){  
 alert("Hello Alert Box");  
}  
</script>  
<input type="button" value="click" onclick="msg()"/>  
Output of the above example
Example of confirm() in javascript
It displays the confirm dialog box. It has message with ok and cancel buttons.

<script type="text/javascript">  
function msg(){  
var v= confirm("Are u sure?");  
if(v==true){  
alert("ok");  
}  
else{  
alert("cancel");  
}  
  
}  
</script>  
  
<input type="button" value="delete record" onclick="msg()"/>  
Output of the above example
Example of prompt() in javascript
It displays prompt dialog box for input. It has message and textfield.

<script type="text/javascript">  
function msg(){  
var v= prompt("Who are you?");  
alert("I am "+v);  
  
}  
</script>  
  
<input type="button" value="click" onclick="msg()"/>  
Output of the above example
Example of open() in javascript
It displays the content in a new window.

<script type="text/javascript">  
function msg(){  
open("http://www.javatpoint.com");  
}  
</script>  
<input type="button" value="javatpoint" onclick="msg()"/>  
Output of the above example
Example of setTimeout() in javascript
It performs its task after the given milliseconds.

<script type="text/javascript">  
function msg(){  
setTimeout(  
function(){  
alert("Welcome to Javatpoint after 2 seconds")  
},2000);  
  
}  
</script>  
  
<input type="button" value="click" onclick="msg()"/>  



JavaScript History Object

The JavaScript history object represents an array of URLs visited by the user. 
By using this object, you can load previous, forward or any particular page.

The history object is the window property, so it can be accessed by:

window.history  
Or,

history  
Property of JavaScript history object
There are only 1 property of history object.


No.	Property	Description
1	length	returns the length of the history URLs.
Methods of JavaScript history object
There are only 3 methods of history object.

No.	Method	Description
1	forward()	loads the next page.
2	back()	loads the previous page.
3	go()	loads the given page number.

 
Example of history object
Let’s see the different usage of history object.

history.back();//for previous page  
history.forward();//for next page  
history.go(2);//for next 2nd page  
history.go(-2);//for previous 2nd page  

JavaScript Navigator Object

The JavaScript navigator object is used for browser detection. 
It can be used to get browser information such as appName, appCodeName, userAgent etc.

The navigator object is the window property, so it can be accessed by:

window.navigator  
Or,

navigator  
Property of JavaScript navigator object
There are many properties of navigator object that returns information of the browser.


No.	Property	Description
1	appName	returns the name
2	appVersion	returns the version
3	appCodeName	returns the code name
4	cookieEnabled	returns true if cookie is enabled otherwise false
5	userAgent	returns the user agent
6	language	returns the language. It is supported in Netscape and Firefox only.
7	userLanguage	returns the user language. It is supported in IE only.
8	plugins	returns the plugins. It is supported in Netscape and Firefox only.
9	systemLanguage	returns the system language. It is supported in IE only.
10	mimeTypes[]	returns the array of mime type. It is supported in Netscape and Firefox only.
11	platform	returns the platform e.g. Win32.
12	online	returns true if browser is online otherwise false.

 
Methods of JavaScript navigator object
The methods of navigator object are given below.

No.	Method	Description
1	javaEnabled()	checks if java is enabled.
2	taintEnabled()	checks if taint is enabled. It is deprecated since JavaScript 1.2.
Example of navigator object
Let’s see the different usage of history object.

<script>  
document.writeln("<br/>navigator.appCodeName: "+navigator.appCodeName);  
document.writeln("<br/>navigator.appName: "+navigator.appName);  
document.writeln("<br/>navigator.appVersion: "+navigator.appVersion);  
document.writeln("<br/>navigator.cookieEnabled: "+navigator.cookieEnabled);  
document.writeln("<br/>navigator.language: "+navigator.language);  
document.writeln("<br/>navigator.userAgent: "+navigator.userAgent);  
document.writeln("<br/>navigator.platform: "+navigator.platform);  
document.writeln("<br/>navigator.onLine: "+navigator.onLine);  
</script>  

Test it Now

navigator.appCodeName: Mozilla 
navigator.appName: Netscape 
navigator.appVersion: 5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 
(KHTML, like Gecko) Chrome/37.0.2062.124 Safari/537.36 
navigator.cookieEnabled: true 
navigator.language: en-US 
navigator.userAgent: Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 
(KHTML, like Gecko) Chrome/37.0.2062.124 Safari/537.36 
navigator.platform: Win32 
navigator.onLine: true





Javascript - innerHTML

The innerHTML property can be used to write the dynamic html on the html document.

It is used mostly in the web pages to generate the dynamic html such as registration form, comment form, links etc.

Example of innerHTML property
In this example, we are going to create the html form when user clicks on the button.


In this example, we are dynamically writing the html form inside the div name having the id mylocation.
 We are identifing this position by calling the document.getElementById() method.

<script type="text/javascript" >  
function showcommentform() {  
var data="Name:<input type='text' name='name'><br>Comment:<br><textarea rows='5' cols='80'></textarea>  
<br><input type='submit' value='Post Comment'>";  
document.getElementById('mylocation').innerHTML=data;  
}  
</script>  
<form name="myForm">  
<input type="button" value="comment" onclick="showcommentform()">  
<div id="mylocation"></div>  
</form>  



Javascript - document.getElementById() method


The document.getElementById() method returns the element of specified id.

In the previous page, we have used document.form1.name.value to get the value of the input value. 
Instead of this, we can use document.getElementById() method to get value of the input text. 
But we need to define id for the input field.

Let's see the simple example of document.getElementById() method that prints cube of the given number.


<script type="text/javascript">  
function getcube(){  
var number=document.getElementById("number").value;  
alert(number*number*number);  
}  
</script>  
<form>  
Enter No:<input type="text" id="number" name="number"/><br/>  
<input type="button" value="cube" onclick="getcube()"/>  
</form> 


Javascript - document.getElementsByName() method


The document.getElementsByName() method returns all the element of specified name.

The syntax of the getElementsByName() method is given below:

document.getElementsByName("name")  
Here, name is required.


Example of document.getElementsByName() method
In this example, we going to count total number of genders. Here, we are using getElementsByName() method to get all the genders.

<script type="text/javascript">  
function totalelements()  
{  
var allgenders=document.getElementsByName("gender");  
alert("Total Genders:"+allgenders.length);  
}  
</script>  
<form>  
Male:<input type="radio" name="gender" value="male">  
Female:<input type="radio" name="gender" value="female">  
  
<input type="button" onclick="totalelements()" value="Total Genders">  
</form>  

The document.getElementsByTagName() method returns all the element of specified tag name.

The syntax of the getElementsByTagName() method is given below:

document.getElementsByTagName("name")  
Here, name is required.


Example of document.getElementsByTagName() method
In this example, we going to count total number of paragraphs used in the document. 
To do this, we have called the document.getElementsByTagName("p") method that returns the total paragraphs.

<script type="text/javascript">  
function countpara(){  
var totalpara=document.getElementsByTagName("p");  
alert("total p tags are: "+totalpara.length);  
  
}  
</script>  
<p>This is a pragraph</p>  
<p>Here we are going to count total number of paragraphs by getElementByTagName() method.</p>  
<p>Let's see the simple example</p>  
<button onclick="countpara()">count paragraph</button>  

Output of the above example
This is a pragraph

Here we are going to count total number of paragraphs by getElementByTagName() method.

Let's see the simple example

count paragraph


The innerText property can be used to write the dynamic text on the html document. Here, text will not be interpreted as html text but a normal text.

It is used mostly in the web pages to generate the dynamic content such as writing the validation message, password strength etc.

Javascript innerText Example
In this example, we are going to display the password strength when releases the key after press.


<script type="text/javascript" >  
function validate() {  
var msg;  
if(document.myForm.userPass.value.length>5){  
msg="good";  
}  
else{  
msg="poor";  
}  
document.getElementById('mylocation').innerText=msg;  
 }  
  
</script>  
<form name="myForm">  
<input type="password" value="" name="userPass" onkeyup="validate()">  
Strength:<span id="mylocation">no strength</span>  
</form>  


















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































* */