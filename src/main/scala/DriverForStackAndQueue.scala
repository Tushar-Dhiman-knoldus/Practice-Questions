
object DriverForStack extends App {

  private val stackObject = new Stack()

  private var stackList = List(1, 2, 3)
  stackList = stackObject.push(5, stackList)
  println("After push stack is :-" + stackList)
  stackList = stackObject.pop(stackList)
  println("After pop stack is:- " + stackList)

  println("Is stack empty:- " + stackObject.isEmpty(stackList))

  println("Top of stack is:- " + stackObject.peek(stackList))


}
