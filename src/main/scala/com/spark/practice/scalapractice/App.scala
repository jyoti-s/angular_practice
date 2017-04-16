package com.spark.practice.scalapractice

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

/**
 * @author ${user.name}
 */
object App {
  
  def main(args : Array[String]) {
    val data = new SparkConf().setMaster("local").setAppName("First App")
    
    val sc  = new SparkContext(data)
    
    val input = sc.textFile("src/input//input.txt")
    
    input.foreach { x => println(x.toString()) }
    
    //println(input.collect())
    
  }

}
