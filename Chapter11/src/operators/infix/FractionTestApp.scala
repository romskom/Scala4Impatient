package operators.infix

/**
 * Created by Роман on 14.02.2015.
 */
object FractionTestApp extends App {

  val frac1 = new Fraction(1, 3)

  val frac2 = new Fraction(2, 5)

  val fracM = frac1 * frac2

  println(fracM)

}
