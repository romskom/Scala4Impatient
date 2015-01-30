package classes.basic

/**
 * Created by rkomarov on 30.01.2015.
 */
class Counter {

  private var value = 0

  def increment() { value += 1 }

  def current()= value

}
