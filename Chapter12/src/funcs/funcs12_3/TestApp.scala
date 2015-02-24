package funcs.funcs12_3

import scala.math._
/**
 * Created by rkomarov on 16.02.2015.
 */
object TestApp extends App {

  def valueAtOneQuarter(f: (Double) => Double) = { f(0.25) }

  val c = valueAtOneQuarter(ceil _ )
  val d = valueAtOneQuarter(sqrt _ )

  println( c )
  println( d )

  def mulBy(factor : Double) = { (x : Double) => factor * x }

  val quintuple = mulBy(5)
  val qr = quintuple(20)

  println( qr )


}
