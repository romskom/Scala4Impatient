package tuples

/**
 * Created by rkomarov on 29.01.2015.
 */
object TuplesObj extends App {

  val t = (1, 3.14, "Fred")
  println(t)
  println(t.getClass)

  val t1 = t._1
  println(t1)
  val t2 = t._2
  println(t2)

  val (first, _, third) = t
  println(">>>")
  println(first)
  println(third)

  val s = "New York".partition(_.isUpper)
  println(s)
  println(s.getClass)
}
