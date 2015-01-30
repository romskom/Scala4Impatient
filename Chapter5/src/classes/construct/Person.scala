package classes.construct

/**
 * Created by rkomarov on 30.01.2015.
 */
class Person {

  private var name: String = ""

  private var age: Int = 0

  /** auxiliary constructor #1*/
  def this(name: String) {
    this()
    this.name = name
  }

  /** auxiliary constructor #2*/
  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }

}

object Person {
  def main(args: Array[String]) {
    val p1 = new Person()
    val p2 = new Person("Mike")
    val p3 = new Person("Stiv", 21)
  }
}