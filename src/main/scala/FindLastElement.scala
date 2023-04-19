import scala.annotation.tailrec

object FindLastElement extends App {

  private val myList: List[Int] = List(2, 3, 4, 5, 6)

  // Function to find the last element with its index
  private def findLastElement(myList: List[Int]): (Int, Int) = {

    @tailrec
    def helper(list: List[Int]): Int = list match {
      case head :: Nil => head
      case _ :: next => helper(next)
      case Nil => throw new Exception
    }

    val lastElement = helper(myList)
    (myList.indexOf(lastElement), lastElement)
  }

  println("The last element with index is:- " + findLastElement(myList))

}
