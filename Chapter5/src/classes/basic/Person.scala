package classes.basic

import scala.beans.BeanProperty

/**
 * Created by rkomarov on 30.01.2015.
 */
class Person {

  private[this] var privateAge = 0

  // def age() :Int = { return privateAge }
  def age = privateAge

  def age_=(newValue: Int): Unit = {
    if (newValue > privateAge) privateAge = newValue;
  }

  @BeanProperty
  var name : String = _

}

object Person {
  def main(args: Array[String]) {
    val person = new Person
    person.setName("Mike")
    val name = person.getName
    println(name)
  }
}
