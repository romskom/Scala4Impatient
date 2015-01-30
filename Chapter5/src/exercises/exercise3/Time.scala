package exercises.exercise3

/**
 * Created by rkomarov on 30.01.2015.
 */
class Time(val hours: Int, val minutes: Int) {

  {
    if (hours < 0 || hours > 23 || minutes < 0 || minutes < 0|| minutes > 59) throw new Exception
  }

  def before(other: Time): Boolean = {
    if (this.hours < other.hours) true
    else if (this.hours > other.hours) false
    else if (this.minutes < other.minutes) false
    else true
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
    println(t3.before(t4))
    println(t4.before(t3))

    println(t1.hours + " " + t1.minutes)
    // t1.hours = 10
    // t1.minutes = 20

  }

}