class 模式匹配 {
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

  def main(args: Array[String]): Unit = {
    judgeGrade("FC", "A")
  }
}
