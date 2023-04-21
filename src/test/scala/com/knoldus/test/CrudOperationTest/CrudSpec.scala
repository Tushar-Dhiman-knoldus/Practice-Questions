package com.knoldus.test.CrudOperationTest

import com.knoldus.practice.CrudOperationUsingFuture.CrudOperationCall
import org.scalatest.funsuite.AnyFunSuite

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

class CrudSpec extends AnyFunSuite {

  private val crudOperationCall = new CrudOperationCall
  private val listOfIntegers = List(1, 2, 3, 4, 5)

  test("createCall should return a list of integers") {
    val result: Future[List[Int]] = crudOperationCall.createCall
    result.onComplete {
      case Failure(exception) => fail(s"Unexpected exception: ${exception.getMessage}")
      case Success(value) => assert(value == listOfIntegers)
    }
  }

  test("readCall should return the same list of integers") {
    val listOfIntegers = List(1, 2, 3, 4, 5)
    val result: Future[List[Int]] = crudOperationCall.readCall(Future(listOfIntegers))
    result.onComplete {
      case Failure(exception) => fail(s"Unexpected exception: ${exception.getMessage}")
      case Success(value) => assert(value == listOfIntegers)
    }
  }

  test("updateCall should return a list of doubled integers") {
    val listOfIntegers = List(1, 2, 3, 4, 5)
    val result: Future[List[Int]] = crudOperationCall.updateCall(Future(listOfIntegers))
    result.onComplete {
      case Failure(exception) => fail(s"Unexpected exception: ${exception.getMessage}")
      case Success(value) => assert(value == listOfIntegers.map(_ * 2))
    }
  }

  test("deleteCall should return a list of integers without the specified element") {
    val listOfIntegers = List(1, 2, 3, 4, 5)
    val element = 3
    val result: Future[List[Int]] = crudOperationCall.deleteCall(element, Future(listOfIntegers))
    result.onComplete {
      case Failure(exception) => fail(s"Unexpected exception: ${exception.getMessage}")
      case Success(value) => assert(value == listOfIntegers.filter(_ != 3))
    }
  }

}

