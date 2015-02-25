package exercises.ex2

/**
 * Created by rkomarov on 25.02.2015.
 */
object TestApp extends App {
  val arr = Array(1, 10, 15, -6, 25, 14, 11)

  val max = arr.reduceLeft( (x, y) => if (x > y) x else y )
  println("max = " + max)

  val min = arr.reduceLeft( (x, y) => if (x < y) x else y )
  println("min = " + min)

  val maxFunc = (x: Int, y: Int) => if (x > y) x else y
  val max2 = arr.reduceLeft(maxFunc)
  println("max2 = " + max2)

  val minFunc = (x: Int, y: Int) => if (x < y) x else y
  val min2 = arr.reduceLeft(minFunc)
  println("min2 = " + min2)

}
