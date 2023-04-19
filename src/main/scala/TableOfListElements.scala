import scala.annotation.tailrec

object TableOfListElements extends App {

  val myList = List(2, 3, 4, 5, 6)
  private val listOfTable = myList.map(element => findTable(element))

  // Function to generate table in a list using tail recursion.
  def findTable(num: Int): List[Int] = {

    @tailrec
    def helper(count: Int, myList: List[Int]): List[Int] = {
      if (count == 11) myList
      else helper(count + 1, myList :+ num * count)
    }

    helper(1, Nil)
  }

  // Printing the tables in separate lists
  listOfTable.foreach {
    println
  }
}
