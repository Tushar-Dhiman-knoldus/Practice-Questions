package com.knoldus.practice.StackAndQueueImpl

class Stack {

  var stackList: List[Int] = List()

  def push(number: Int): List[Int] = {
    stackList = stackList :+ number
    stackList
  }

  def pop: Option[Int] = {
    if (stackList.isEmpty) None
    else {
      val topElement = stackList.last
      stackList = stackList.dropRight(1)
      Some(topElement)
    }
  }

  def isEmpty: Boolean = {
    if (stackList.length == 0) true else false
  }

  def peek(): List[Int] = {
    stackList.takeRight(1)
  }
}