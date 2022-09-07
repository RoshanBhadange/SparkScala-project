package org.apache.creditasset

import org.apache.spark.sql.SparkSession

object SparkReadJson {
  val spark = SparkSession.
    builder().
    appName("JsonDf")
    .master("local")
    .getOrCreate()

  def main(args: Array[String]){
    val df = spark.read.json("src/main/resources/data/cars.json")
    // df.show(5)
    df.printSchema()
  }
}