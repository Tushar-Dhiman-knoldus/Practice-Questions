package com.knoldus.test.StackAndQueueTest

import com.knoldus.practice.StackAndQueueImpl.Stack
import org.scalatest.funsuite.AnyFunSuite

class StackSpec extends AnyFunSuite {
  test("Push operation adds an element to the stack") {
    val stack = new Stack
    stack.push(1)
    assert(stack.stackList === List(1))
  }

  test("Pop operation removes and returns the top element of the stack") {
    val stack = new Stack
    stack.push(1)
    stack.push(2)
    assert(stack.pop === Some(2))
  }

  test("Pop operation throws an exception when called on an empty stack") {
    val stack = new Stack
    assert(stack.pop === None)
  }

  test("Peek operation returns the top element of the stack without removing it") {
    val stack = new Stack
    stack.push(1)
    stack.push(2)
    assert(stack.peek() === List(2))
    assert(stack.stackList === List(1, 2))
  }

  test("isEmpty operation returns true when the stack is empty") {
    val stack = new Stack
    assert(stack.isEmpty === true)
  }

  test("isEmpty operation returns false when the stack is not empty") {
    val stack = new Stack
    stack.push(1)
    assert(stack.isEmpty === false)
  }
}
