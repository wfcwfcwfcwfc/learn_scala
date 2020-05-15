/**
 * 函数赋值给变量
 * 匿名函数
 * 高阶函数
 * 高阶函数类型推断
 * Scala常用高阶函数
 * 闭包
 * SAM转换
 * Currying函数
 * return
 */
class Scala编程详解函数式编程_016 {
  def sayHello(name:String): Unit = {
    println(name + " Hello!")
  }

  //把函数赋值给变量
  val sayHelloFunc = sayHello _

  //匿名函数语法规则： （参数名：参数类型）=> {函数体}
  val sayHelloFunc1 = (name:String) => println("Hello, " + name)

  //高阶函数
//  def greeting(func:(String)=>Unit, name: String): Unit = {
//    func(name)
//  }

  //Higher-order function demo #2
  Array(1,2,3,4,5).map((num:Int)=> num * num)

  //高阶函数，函数作为返回值
  def getGreetings(name:String) = (msg:String) => println("hello, " + name + msg)
  val greetingFunc3 = getGreetings("Fengchao")
  greetingFunc3("My new message")

  //高阶函数的类型推断
  def greeting(func:(String)=> Unit, name:String): Unit = {
    func(name)
  }
  greeting((name:String)=> println("Hello, " + name), "leo")
  greeting((name) => println("Hello, " + name), "leo")
  greeting(name => println("Hello, "+ name), "leo")

  def triple(func:(Int)=>Int) = {func(3)}
  triple((value:Int) => 3 * value)
  triple((value) => 3 * value)
  //匿名函数只有一个参数且只用了一次
  triple(3 * _)

  //Scala常用高阶函数
  Array(1,2,3,4,5).map(2 * _)

  //Foreach没有返回值
  (1 to 9).map("*" * _).foreach(println _)

  //Filter
  (1 to 20).filter(_ % 2 == 0)

  //Reduce, 结果 * 值
  (1 to 10).reduce(_ * _)
  Array(2,6,1,2,7,3).sortWith(_ < _)

  //闭包：变量超出了其作用域还可以使用 叫做闭包
//  val sayHelloFunc = sayHello _
//  val sayHelloFunc1 = (name:String) => println("Hello, " + name)


  //SAM转换


  //Currying函数
  def sum(a:Int, b: Int) = {
    a + b
  }

  def sum2(a:Int) = (b:Int) => {a + b}

  def sum3(a:Int)(b:Int) = {a + b}

  //Return
  def greeting(name: String) = {
    def sayHello(name: String): String = {
      return "Hello," + name
    }
    sayHello("wfc")
  }
}
