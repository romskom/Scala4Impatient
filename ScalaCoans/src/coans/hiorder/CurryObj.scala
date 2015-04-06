package coans.hiorder

/**
 * Created by rkomarov on 06.04.2015.
 */
object CurryObj extends App {

  def multiply(x: Int, y: Int) = x * y
  println( multiply _)

  println((multiply _).isInstanceOf[Function2[_, _, _]])
  val multiplyCurried = (multiply _).curried

  println( multiply(2, 3) )
  println( multiplyCurried(2) )

  def customFilter(f: Int => Boolean)(xs: List[Int]) = {
    xs.filter( f )
  }
  def onlyEven(x: Int) = x % 2 == 0
  val xs = List(12, 11, 5, 20, 3, 13, 2)
  customFilter(onlyEven)(xs)

  val onlyEvenFilter = customFilter(onlyEven) _
  onlyEvenFilter(xs)

}
