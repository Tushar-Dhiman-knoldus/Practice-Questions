package com.knoldus.practice
package TableOfListElements

import scala.annotation.tailrec

class TableOfListElements {

  def generateTablesOfElementsOfList(list: List[Int]): List[List[Int]] = {
    list.map(element => generateTable(element))
  }

  // Function to generate table in a list using tail recursion.
  private def generateTable(num: Int): List[Int] = {

    @tailrec
    def helper(count: Int, myList: List[Int]): List[Int] = {
      if (count == 11) myList
      else helper(count + 1, myList :+ num * count)
    }

    helper(1, Nil)
  }
}