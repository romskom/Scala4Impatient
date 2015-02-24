package funcs.asvalue

import scala.math._

/**
 * Created by rkomarov on 16.02.2015.
 */
object TestApp extends App {

  val num = 3.14
  val fun = ceil _

  println(fun.getClass)
  println(fun)

  val num2 = fun(num)
  println(num2)

  val arr = Array(3.14, 1.42, 2.0).map(fun)
  println(arr.mkString(", "))

}
