package org.webapp.ecomm

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._

object Main {
  def main(args: Array[String]): Unit = {
    println("Simple Ecomme!")

    val sparkSession = SparkSession.builder()
      .appName("Simple ETL")
      .master("local[*]")
      .getOrCreate()
  }
}