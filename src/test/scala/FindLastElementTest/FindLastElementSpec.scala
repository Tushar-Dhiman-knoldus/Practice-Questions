package com.knoldus.practice
package FindLastElementTest

import FindLastElementOfListWithIndex.FindLastElement

import org.scalatest.funsuite.AnyFunSuite

class FindLastElementSpec extends AnyFunSuite {

  test("Finding last element and its index in a non-empty list") {
    assert(FindLastElement.findLastElement(List(2, 3, 4, 5, 6)) == (4, 6))
  }

  test("Finding last element and its index in a list with single element") {
    assert(FindLastElement.findLastElement(List(2)) == (0, 2))
  }

  test("Finding last element and its index in an empty list should throw an exception") {
    assertThrows[Exception](FindLastElement.findLastElement(List()))
  }

}
