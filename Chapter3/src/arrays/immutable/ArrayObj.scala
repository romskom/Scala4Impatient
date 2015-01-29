package arrays.immutable

/**
 * Created by rkomarov on 29.01.2015.
 */
object ArrayObj extends App {

  val nums = new Array[Int](10)

  val a = new Array[String](10)

  val s = Array("Hello", "World")
  s(0) = "Goodbuy"

  println(s)
  println(s.getClass)

}
