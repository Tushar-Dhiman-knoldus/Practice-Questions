package com.knoldus.practice.CrudOperationUsingFuture

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class CrudOperation {

  def create: Future[List[Int]] = Future {
    List(1,2,3,4,5)
  }

  def read(listOfIntegers: Future[List[Int]]): Future[List[Int]] = {
    listOfIntegers
  }

  def update(listOfIntegers: Future[List[Int]]): Future[List[Int]] = {
    listOfIntegers.map(list => list.map(element => element*2))
  }

  def delete(element: Int, listOfIntegers: Future[List[Int]]):Future[List[Int]] = {
    listOfIntegers.map{list => list.filter(_ != element)}
  }
}
