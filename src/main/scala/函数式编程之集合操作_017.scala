import scala.collection.mutable

class 函数式编程之集合操作_017 {

  val list = List(1,2,3,4)
  0 :: list
  list.head
  list.tail
  //如果只有一个元素 tail是Nil

  def decorator(l : List[Int], prefix: String): Unit = {
    if(l != Nil) {
      println(prefix + l.head)
      decorator(l.tail, prefix)
    }
  }

  //LinkedList可变list
  val linkedlist = mutable.LinkedList(1,2,3,4,5)
  var curlist = linkedlist

  while(curlist != Nil) {
    curlist.elem = curlist.elem * 2
    curlist = curlist.next
  }

  //每隔一个*2

  var first = true
  while(curlist != Nil && curlist.next != Nil) {
    if(first) {curlist.elem = curlist.elem * 2}
    curlist = curlist.next.next

  }

  //Set
  var set = Set(1,2,3)
  set + 1
  set + 2

  val linkedHashSet = mutable.LinkedHashSet(1,2,3)
  val sortedSet = mutable.SortedSet("apple", "orange", "banana")

  //集合的函数式编程
  List("Leo", "Jen", "Peter", "Jack").map("name is " + _)

  //flatMap
  List("Hello World", "You Me").flatMap(_.split(" "))

  List("I", "have", "beautiful", "house").foreach(println(_))

  //Zip!还能这样！
  List("Leo", "Jen", "Peter", "Jack").zip(List(100, 90, 75, 83))

  //统计单词总数
  val lines1 = scala.io.Source.fromFile("src\\main\\resource\\file1.txt").mkString
  val lines2 = scala.io.Source.fromFile("src\\main\\resource\\file2.txt").mkString
  val lines = List(lines1, lines2)

  lines.flatMap(_.split(" ")).map((_, 1)).map(_._2).reduceLeft(_+_)



}
