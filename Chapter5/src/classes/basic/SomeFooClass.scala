package classes.basic

/**
 * Created by rkomarov on 30.01.2015.
 */
class SomeFooClass {

  private[this] var value :Int = 0

  def foo_=(arg: Int): Unit = {
    value = arg
  }

  def foo(): Int = {
    value
  }

}
