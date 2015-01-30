package exercises.exercise1

/**
 * Created by rkomarov on 30.01.2015.
 */
class Counter {

  private[this] var value = 0

  def increment() = { if (value < Int.MaxValue) value += 1 }

  def current = value

}
