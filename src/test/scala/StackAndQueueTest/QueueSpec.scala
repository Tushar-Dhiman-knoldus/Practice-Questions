package com.knoldus.practice
package StackAndQueueTest

import StackAndQueueImplUsingLists.Queue

import org.scalatest.funsuite.AnyFunSuite

class QueueSpec extends AnyFunSuite {

  test("Enqueue should add element to the queue") {
    val queue = new Queue
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    assert(queue.peek == List(1))
  }

  test("Dequeue should remove and return the first element of the queue") {
    val queue = new Queue
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    assert(queue.dequeue == Some(1))
    assert(queue.peek == List(2))
  }

  test("Dequeue should return None if the queue is empty") {
    val queue = new Queue
    assert(queue.dequeue.isEmpty)
  }

  test("isEmpty should return true if the queue is empty") {
    val queue = new Queue
    assert(queue.isEmpty)
  }

  test("peek should return the first element of the queue without removing it") {
    val queue = new Queue
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    assert(queue.peek == List(1))
  }
}
