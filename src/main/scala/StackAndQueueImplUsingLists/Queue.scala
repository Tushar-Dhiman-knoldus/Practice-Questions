package com.knoldus.practice
package StackAndQueueImplUsingLists

class Queue {

  private var queueList: List[Int] = List()

  def enqueue(number: Int): List[Int] = {
    queueList = queueList :+ number
    queueList
  }

  def dequeue: Option[Int] ={
    if (queueList.isEmpty) None
    else {
      val firstElement = queueList.head
      queueList = queueList.drop(1)
      Some(firstElement)
    }
  }

  def isEmpty: Boolean = {
    if (queueList.length == 0) true else false
  }

  def peek: List[Int] = {
    queueList.take(1)
  }

}
