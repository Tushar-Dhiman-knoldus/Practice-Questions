class Stack {

  def push(number: Int, list: List[Int]): List[Int] = {
    list :+ number
  }

  def pop(list: List[Int]): List[Int] = {
    list.dropRight(1)
  }

  def isEmpty(list: List[Int]): Boolean = {
    if(list.length == 0) true else false
  }

  def peek(list: List[Int]): List[Int]= {
    list.takeRight(1)
  }
}

class Queue {

  def enqueue(number: Int, list: List[Int]): List[Int] = {
    list :+ number
  }

  def dequeue(list: List[Int]): List[Int] ={
    list.drop(1)
  }

  def isEmpty(list: List[Int]): Boolean = {
    if (list.length == 0) true else false
  }

  def peek(list: List[Int]): List[Int] = {
    list.take(1)
  }

}

