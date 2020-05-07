class Scala编程详解函数式编程 {
  def sayHello(name:String): Unit = {
    println(name + " Hello!")
  }

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


}
