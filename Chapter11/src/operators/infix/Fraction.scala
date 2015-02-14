package operators.infix

/**
 * Created by Роман on 14.02.2015.
 */
class Fraction(n: Int, d: Int) {

  private val num: Int = n

  private val den: Int = d

  def *(other: Fraction) : Fraction = new Fraction( num * other.num, den * other.den)

  override def toString = s"Fraction(num=$num, den=$den)"


  def canEqual(other: Any): Boolean = other.isInstanceOf[Fraction]

  override def equals(other: Any): Boolean = other match {
    case that: Fraction =>
      (that canEqual this) &&
        num == that.num &&
        den == that.den
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(num, den)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
