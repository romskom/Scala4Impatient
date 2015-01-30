package classes.construct.main

/**
 * Created by rkomarov on 30.01.2015.
 */
class Person (val name: String = "", val age: Int = 0) {
  {
    println("this is a main constructor")
    println(this.name + " " + this.age)
  }

  override def toString(): String = {
    "" + this.getClass + "(" + "name = " + this.name + ", age = " + this.age + ")"
  }
}

object Person {

  def main(args: Array[String]) {
    val person: Person = new Person("Mike", 21)
    println(person)

    val person1: Person = new Person()
    println(person1)

  }

}