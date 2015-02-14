package operators.infix

/**
 * Created by Роман on 14.02.2015.
 */
object OperatorsTestApp extends App {

  val range1 = 1 to 10
  println(range1)

  val range2 = 1.to(10)
  println(range2)

  val q = 1 -> 10
  println(q)
  println(q.getClass)

}
