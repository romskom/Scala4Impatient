package arrays.mutable

import scala.collection.mutable.ArrayBuffer

/**
 * Created by rkomarov on 29.01.2015.
 */
object ArrayBufferObj extends App {

  val b = new ArrayBuffer[Int]
  println(b)

  b += 1
  println(b)

  b += (2, 3, 4, 5)
  println(b)

  b ++= Array(7, 8, 9, 10)
  println(b)

  b.trimEnd(5)
  println(b)

  b.insert(2, 10)
  println(b)

  b.remove(2)
  println(b)

  b.insert(2, 10, 11, 12, 13, 14)
  println(b)

  b.remove(2, 5)
  println(b)

  val c :Array[Int] = b.toArray
  println(c.mkString("[", ", ", "]"))

}
