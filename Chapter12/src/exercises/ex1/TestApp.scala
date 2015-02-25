package exercises.ex1

/**
 * Created by rkomarov on 24.02.2015.
 */
/*
Напишите функцию values(fun: (Int) => Int, low: Int, high: Int),
возвращающую коллекцию из значений в указанном диапазоне.
Например, вызов values(x => x * x, -5, 5) должен вернуть
коллекцию пар (-5, 25), (-4, 16), (-3, 9), ..., (5, 25).
*/
object TestApp extends App {

  def values(fun: (Int) => Int, low: Int, high: Int) = {
    (low to high).map(x => (x, fun(x)))
  }

  val v = values(x => x * x, 1, 10)
  println(v)

  val v1 = values(x => x * x, -5, 5)
  println(v1)

  val v2 = values(x => x + 5, -5, 5)
  println(v2)

}
