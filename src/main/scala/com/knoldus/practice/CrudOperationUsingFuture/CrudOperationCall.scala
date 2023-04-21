package com.knoldus.practice.CrudOperationUsingFuture

import scala.concurrent.Future

class CrudOperationCall {

  private val crudOperation = new CrudOperation

  def createCall: Future[List[Int]] = {
    val listOfIntegers = crudOperation.create
    listOfIntegers
  }

  def readCall(listOfIntegers: Future[List[Int]]): Future[List[Int]] = {
    crudOperation.read(listOfIntegers)
  }

  def updateCall(listOfIntegers: Future[List[Int]]): Future[List[Int]] = {
    crudOperation.update(listOfIntegers)
  }

  def deleteCall(element: Int, listOfIntegers: Future[List[Int]]): Future[List[Int]] = {
    crudOperation.delete(element, listOfIntegers)
  }
}

