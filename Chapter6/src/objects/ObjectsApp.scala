package objects

/**
 * Created by rkomarov on 02.02.2015.
 */
object ObjectsApp extends App {

  val a1 = Array(100)
  val a2 = new Array(100)

  println(a1.getClass + " "  + a1.mkString(" : "))
  println(a2.getClass + " "  + a2)

}
