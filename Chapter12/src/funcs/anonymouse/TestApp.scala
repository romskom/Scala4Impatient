package funcs.anonymouse

/**
 * Created by rkomarov on 16.02.2015.
 */
object TestApp extends App {

  (x: Double) => { 3 * x }

  val arr = Array(3.14, 1.42, 2.0).map((x: Double) => { 3 * x })

  println(arr.mkString("{" ,", ", "}" ))

  Array(3.14, 1.42, 2.0).map{ (x: Double) => 3 * x }

  Array(3.14, 1.42, 2.0) map { (x: Double) => 3 * x }

}
