package com.spark.practice.scalapractice

import org.apache.spark.sql.SparkSession
import org.mortbay.util.ajax.JSONDateConvertor

object SqlClass {
  
  def main(args: Array[String]){
  
  val sparkSession = SparkSession.builder().master("local").getOrCreate()
  
  val jsonData = sparkSession.read.json("src//input//input.txt")
  
  jsonData.select("name").show()
  }
}