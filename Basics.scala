// Expressions are computable statements.
// 1 + 1

// You can output results of expressions using println.
println(1) // 1
println(1 + 1) // 2 
println("Hello!") // Hello! 
println("Hello," + "world") // Hello, world!

// Values
// You can name results of expression with the val keyword.
val x = 1 + 1
println(x) // 2

// Named results, such as x here, are called values, Referencing a value does not
// re-compute it.
// Values cannot be re-assigned.
// x = 5 // Error

// Types of values can be inferred, but you can also explicitly state the type, like
// this:
val y: Int = 1 + 1

// Variables
// Variables are like values, except you can re-assign them. You can define a variable
// with the var keyword.
var z: Int = 1 + 1

// Blocks 
// You can combine expression by surrounding them with {}. We call this a block.
// The result of the last expression in the block is the results of the overall block.
println({
	val a = 1 + 1
	a + 1
}) // 3

// Functions
// Functions are expression that take parameters.
// You can define an anonymous function (i.e no name) that returns a given integer plus one:
(x: Int) => x + 1

// On the left of => is a list of parameters. On the right is an expression involving the parameters.
// You can also name functions.
val addOne = (x: Int) => x + 1
println(addOne(1)) // 2

//Functions may take multiple parameters.
val add = (x: Int, y: Int) => x + y
println(add(1, 2)) // 3

//Or it can take no parameters.
val getTheAnswer = () => 42
println(getTheAnswer())

// Methods
// Methods look and behave very similar to functions, but there are a few key differences between them.
// Methods are defined with the def keyword. def is followed by a name, parameter lists, a return type,
// and a body.
def methodAdd(x: Int, y: Int): Int = x + y
println(methodAdd(1, 2)) //3

// Notice how the return type is declared after the parameter list and a colon: Int
// Methods can take multiple parameter lists.
def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
println(addThenMultiply(1, 2)(3)) // 9

// Or no parameter list at all.
def name: String = System.getProperty("user.name")
println("Hello, " + name + "!")

// There are some other differences, but for now, you can think of them as something similar to functions.
// Methods can have multi-line expressions as well.
def getSquareString(input: Double): String = {
	val square = input * input
	square.toString
}

println(getSquareString(2.0)) // 4.0
// The last expression in the body is the method's return vaues.(Scala does have a return keyword, 
// but it's rarely used.)

// Classes
// You can define classes with the class keyword followed by its name and constructor parameters.
class Greeter(prefix: String, suffix: String) {

	def greet(name: String): Unit = {
		println(prefix + name + suffix)
	}

}

// The return type of the method greet is Unit, which says theres nothing meaningful to return.
// Its used similarly to void in Java and C. (A difference is that because every Scala expression
// must have some value, there is actually a singleton value of type Unit, written (). It carries
// no information.)
// You can make instance of a class with the new keyword.
val greeter = new Greeter("Hello, ", "!")
greeter.greet("Scala developer") // Hello, Scala developer!