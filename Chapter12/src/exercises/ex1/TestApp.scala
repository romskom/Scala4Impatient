package exercises.ex1

/**
 * Created by rkomarov on 24.02.2015.
 */
object TestApp extends App {

  def values(fun: (Int) => Int, low: Int, high: Int) = {
    (low to high).map(x => (x, fun(x)))
  }

  val v = values(x => x * x, 1, 10)

  println(v)
}
