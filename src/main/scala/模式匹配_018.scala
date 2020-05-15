import java.io.{FileNotFoundException, IOException}

/**
 * match 模式匹配
 * 1. 基础语法
 * 2. Class 类型
 * 3. Array和List内容匹配
 * 4. case class匹配
 * 5. Option-Some-None匹配
 *
 */
class 模式匹配_018 {
  def judgeGrade(name: String, grade: String): Unit = {
    grade match {
        //类似Java里的switch语句 更强大一些
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Just so so")
        //其他值以后再判断一次
      case _ if name == "leo" => println(name + ", you are a good boy, come on")
      case _ => println("you need to work harder")
    }
  }

  def judgeGrad2(grade:String): Unit = {
    grade match {
      case "A" => println("you got A grade, excel")
      case "B" => println("you got B")
      //如果谁都不是 自动赋值给变量
      case badGrade => println("your got " + badGrade + ", work harder!")
    }
  }

  //对类型进行模式匹配
  def processException(e : Exception): Unit = {
    e match {
      case e1:IllegalArgumentException => println("you passed IllegalArgument Exception. Exception is: " + e1)
      case e2:FileNotFoundException => println("Cannot file file. Exception: " + e2)
      case e3:IOException => println("IOE, Exception: " + e3)
      case _: Exception => println("AAH")
    }
  }

  //对Array和List进行匹配
  def greeting(arr:Array[String]): Unit = {
    arr match {
      case Array("Leo") => println("How are you Leo")
      case Array(girl1, girl2, girl3) => println("hi girls Im jack" + girl1 + "," + girl2 + " " + girl3)
      case Array("Leo", _*) => println("hi Leo, why not introduce yoru friends to me")
      case _ => println("who are you?")
    }
  }

  //List
  def greeting1(list: List[String]): Unit = {
    list match {
      case "leo" :: Nil => println("hi leo")
      case girl1 :: girl2 :: girl3 :: Nil => println("hi girls" + girl1 + " " + girl2 + " " + girl3)
      case "leo" :: tail => println("Hi leo introduce you friends")
      case _ => println("who you are")

    }
  }

  def main(args: Array[String]): Unit = {
    judgeGrade("FC", "A")
  }
}


////Case class 模式匹配 学校门禁程序
//class Person
//case class Teacher(name: String, subject: String) extends Person
//case class Student(name: String, classroom: String) extends Person
//case class Worker(name: String, field: String) extends Person
//
//def judgeItentity(p: Person): Unit = {
//  p match {
//    case Teacher(name, subject) => println("Teacher: " + name + ". you teach: " + subject)
//    case Student(name, classroom) => println("Student: " + name + ". your class is: " + classroom)
//    case _ => println("please leave school")
//  }
//}
//
////Option 模式匹配
//val grades = Map("Leo" -> "A", "Jack" -> "B", "Tom"->"C")
//def getGrade(name: String): Unit = {
//  var grade = grades.get(name)
//  grade match {
//    case Some(grade) => println("your grade is: " + grade)
//    case None => println("your grade is not in your system.")
//  }
//}


