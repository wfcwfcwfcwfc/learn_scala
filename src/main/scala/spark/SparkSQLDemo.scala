package spark

import org.apache.spark.sql.SparkSession

object SparkSQLDemo {

  case class Person(name: String, age: Long)

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("SparkSQLDemo")
      .master("local[2]").getOrCreate();

    import spark.implicits._
    val df = spark.read.json("src\\main\\resource\\jsonExample.json")
    df.show()

    println("the class is: " + df.getClass)

    //7890-
    df.select($"name").show()

    df.filter($"name" ===  "Gilbert").show()

    df.createTempView("table_df")
    val SQLdf = spark.sql("Select * from table_df")
    SQLdf.show()

    val caseClassDS = Seq(Person("leo", 25)).toDS()

    caseClassDS.show()

    val primitiveDS = Seq(1,2,3).toDS()
    primitiveDS.map(_ + 1).show()


  }
}
