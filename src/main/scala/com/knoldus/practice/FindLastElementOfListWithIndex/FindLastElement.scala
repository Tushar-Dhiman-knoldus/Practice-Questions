package com.knoldus.practice.FindLastElementOfListWithIndex

import scala.annotation.tailrec

object FindLastElement extends App {

  // Function to find the last element with its index
  def findLastElement(myList: List[Int]): (Int, Int) = {

    @tailrec
    def helper(list: List[Int], index: Int): (Int, Int) = list match {
      case head :: Nil => (index, head)
      case _ :: next => helper(next, index + 1)
      case Nil => throw new Exception
    }

    val lastElement = helper(myList, 0)
    (lastElement._1, lastElement._2)
  }
}
