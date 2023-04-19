
object DriverForQueue extends App{

  private val queueObject = new Queue()

  private var queueList = List(1, 2, 3)
  queueList = queueObject.enqueue(5, queueList)
  println("After enqueue stack is :-" + queueList)
  queueList = queueObject.dequeue(queueList)
  println("After dequeue stack is:- " + queueList)

  println("Is Queue empty:- " + queueObject.isEmpty(queueList))

  println("Top of Queue is:- " + queueObject.peek(queueList))


}
