package com.knoldus.practice
package TableOfListElementTest

import TableOfListElements.TableOfListElements

import org.scalatest.funsuite.AnyFunSuite

class TableOfListElementSpec extends AnyFunSuite {

  val tableOfListElements = new TableOfListElements
  test("findTable should return a list of 10 integers when given an integer") {

    val inputList = (2 to 6).toList
    val expectedResult: List[List[Int]] = List(List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20),
      List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30),
      List(4, 8, 12, 16, 20, 24, 28, 32, 36, 40),
      List(5, 10, 15, 20, 25, 30, 35, 40, 45, 50),
      List(6, 12, 18, 24, 30, 36, 42, 48, 54, 60))

    assert(tableOfListElements.generateTablesOfElementsOfList(inputList) === expectedResult)
  }

}
