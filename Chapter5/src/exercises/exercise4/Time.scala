package exercises.exercise4

/**
 * Created by Роман on 01.02.2015.
 */
class Time (val _hours: Int, val _minutes: Int) {

  val value : Int = _hours * 60 + _minutes

  def hours = value / 60

  def minutes = value % 60

  def before(other: Time): Boolean = {
    return this.value < other.value
  }

}

object TimeTestApp {

  def main(args: Array[String]) {


    val t1 = new Time(12, 30)
    val t2 = new Time(12, 25)
    println(t1.before(t2))
    println(t2.before(t1))

    val t3 = new Time(13, 0)
    val t4 = new Time(14, 0)
    var tlist: List[Time] = List[Time](t1, t2, t3, t4)

    println(t3.before(t4))
    println(t4.before(t3))

    for (t <- tlist) println(t.hours + " " + t.minutes)
    // t1.hours = 10
    // t1.minutes = 20

  }

}