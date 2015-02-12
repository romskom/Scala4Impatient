package traits10_3

/**
 * Simple trait with non-abstract method
 */
trait ConsoleLogger {
  def log(msg: String) { println(msg) } // this is a method with realisation
}
