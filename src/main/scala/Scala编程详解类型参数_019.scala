///**
// *  泛型类
// *  泛型函数
// *  上边界bounds
// *  下边界bounds
// *  View Bounds?
// *  Context Bounds?
// *  协变和逆变
// *  Existential Type - 占位符
// */
//class Scala编程详解类型参数_019 {
//
//  //泛型类 + 自动推断
//  class student[T](val localId: T) {
//    def getSchoolId(hukouId: T) = {
//      "S-" + hukouId + "-" + localId
//    }
//  }
//
//  //泛型函数
//  def getCard[T](content: T): Unit ={
//    if(content.isInstanceOf[Int]) "card: 001," + content
//    else if(content.isInstanceOf[String]) "card: this is your card" + content
//    else "card: " + content
//  }
//
//  //上边界bounds
//  class Person(val name: String){
//    def sayHello = println("Hello. I'm " + name)
//    def makeFriends(p: Person): Unit = {
//      sayHello
//      p.sayHello
//    }
//  }
//
//  class Student(name: String) extends Person(name)
//  class Party[T <:Person](p1: T, p2: T){
//    def play = p1.makeFriends(p2)
//  }
//
//  //下边界bounds
//  class Father(val name:String)
//
//  class Child(name: String) extends Father(name)
//
//  class Worker(val name: String)
//
//  def getLostIDCard[T >: Child](p: T): Unit = {
//    if(p.getClass == classOf[Child]) println("tell your parents")
//    else if(p.getClass == classOf[Father]) println("sign your name")
//    else println("not the right class")
//  }
//
//  //View bounds
//  class Person2(val name: String) {
//    def sayHello = println("Hello, I'm " + name)
//    def makeFriends(p: Person): Unit = {
//      sayHello
//      p.sayHello
//    }
//  }
//
//  class Student2(name: String) extends Person(name)
//  class Dog(val name: String) {def sayHello = println("Wang Wang I'm " + name)}
//
//  implicit def dog2person(dog: Object): Person = if(dog.isInstanceOf[Dog]) {
//    val _dog = dog.asInstanceOf[Dog];
//    new Person(_dog.name)
//  }else Nil
//
//  class Party[T <% Person](p1: T, p2: T)
//
//
//}
