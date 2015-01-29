package arrays.iter

/**
 * Created by rkomarov on 29.01.2015.
 */
object ArrayIterationObj extends App {

  val a: Array[Int] = Array.range(1, 10)
  val odd = for(i <- a if i % 2 == 0) yield i
  println(odd.mkString("[", ", ", "]"))
}
