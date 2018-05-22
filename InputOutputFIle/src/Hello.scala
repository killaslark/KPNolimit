import scala.collection.mutable.ArrayBuffer
// Classes
//class Greeter(prefix: String , sufix: String) {
//  def greet(name: String): Unit =
//    println(prefix + name + sufix)
//}

// Case Classes
//case class Point(x: Int, y: Int)
//
////Objects
//object IdFactory {
//  private var counter = 0
//  def create() : Int = {
//    counter += 1
//    counter
//  }
//}
//
//trait Greeter {
//  def greet(name: String): Unit =
//    println("hello " + name + " !")
//}
//
//class DefaultGreeter extends Greeter
//
//class CustomizableGreeter(prefix: String, sufix: String) extends Greeter {
//  override def greet(name: String): Unit = {
//    println(prefix + name + sufix)
//  }
//}

//class Point(var x: Int, var y: Int) {
//  def move (dx: Int, dy: Int) : Unit = {
//    x = x + dx
//    y = y + dy
//  }
//
//  override def toString: String =
//    s"(x : $x, y : $y)"
//
//}

//class Point{
//  private var _x = 0
//  private var _y = 0
//  private val bound = 100
//
//  def x = _x
//  def x_= (newValue: Int) : Unit = {
//    if (newValue < bound ) {
//      _x = newValue
//    } else {
//      printWarning
//    }
//  }
//
//  def y = _y
//  def y_= (newValue: Int) : Unit = {
//    if (newValue < bound ) {
//      _y = newValue
//    } else {
//      printWarning
//    }
//  }
//
//  private def printWarning = println("Warning : out of bounds")
//
//}

//trait
//trait Iterator[A] {
//  def hasNext : Boolean
//  def next() : A
//}
//
//class IntIterator(to: Int) extends Iterator[Int] {
//  private var current = 0
//  override def hasNext : Boolean = current < to
//  override def next() : Int = {
//    if (hasNext) {
//      val t = current
//      current += 1
//      println(t)
//      t
//    } else 0
//  }
//}

//Subtyping
//trait Pet {
//  val name : String
//}
//
//class Cat(val name :String) extends Pet
//class Dog(val name :String) extends Pet
//
//
//
//
object Hello extends App {

//  val point1 = new Point(1,2)
//  point1.x = 4
//  println(point1)

//  val newId : Int = IdFactory.create()
//  val newerId : Int = IdFactory.create()
//
//  println(newId + " "+newerId)

//  val greeter = new Greeter("Hello ", " !")
//  greeter.greet("Scala")

//  val greeter = new DefaultGreeter()
//  greeter.greet("Scala Developer")
//
//  val customizableGreeter = new CustomizableGreeter("How are you, ","?")
//  customizableGreeter.greet("Scala Developer")


//  val point = Point(1,2)
//  val anotherPoint = Point(1,2)
//  val yetAnotherPoint = Point(2,3)
//
//  if (point == anotherPoint) {
//    println(point + " and " + anotherPoint + " are the same.")
//  } else {
//    println(point + " and " + anotherPoint + " are different.")
//  }
//
//  if (point == yetAnotherPoint) {
//    println(point + " and " + yetAnotherPoint + " are the same.")
//  } else {
//    println(point + " and " + yetAnotherPoint + " are different.")
//  }
//
//  val iterator = new IntIterator(10)
//  iterator.next()
//  iterator.next()

//  val dog = new Dog ("Harry")
//  val cat = new Dog("Larry")
//
//  val animals = ArrayBuffer.empty[Pet]
//  animals.append(dog)
//  animals.append(cat)
//  animals.foreach(pet => println(pet.name))

//  val point = new Point
//  point.x = 99
//  point.y = 101

//  //Printing
//  println("Hello, World!")
//  println(1)
//
//  //Value and Variable
//  val x = 1 + 1         // val ga bisa diubah (value)
//  var y = 1 + 3         // variable
//  y = 2
//
//  println(y)
//
//  //Blocks
//  println({
//    val x = 1 + 2
//    x + 1
//  })
//
//
//  //Function
//  val addOne = (x: Int) => x + 1
//  println(addOne(5))
//
//  val add = (x: Int, y:Int) => x + y
//  println(add(5,6))
//
//  val getAnswer = () => 42
//  println(getAnswer())
//
//
//  //Methods
//  def addMethod(x: Int, y: Int): Int = x + y
//  println(addMethod(1,2))
//
//  def addThenMultiply(x: Int, y: Int) (multiplier: Int): Int = (x + y) * multiplier
//  println(addThenMultiply(1,2)(3))
//
//  def name: String = System.getProperty("user.name")
//  println("Hello, " +name + "!")
//
//  def getSquareString(input: Double): String = {
//    val square = input*input
//    square.toString
//  }
//  println("Square String : " + getSquareString(5.0))

//  def fibonacci(n: Int) : Int =  {
//    if (n == 0 ) {
//      val t = 0
//      t
//    } else if ( n == 1) {
//      val t = 1
//      t
//    } else if ( n == 2) {
//      val t = 1
//      t
//    } else {
//      val a = fibonacci(n-1) + fibonacci(n-2)
//      a
//    }
//  }
//
//  val n = scala.io.StdIn.readLine()
//
//  print(arrFibonacci(n.toInt))
//  def arrFibonacci(n: Int) = {
//
//    for (a <- 0 to n) {
//      print(fibonacci(a))
//    }
//  }



}

