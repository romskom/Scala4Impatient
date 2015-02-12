package traits

/**
 * Concrete class that extends trait Logger
 */
class ConsoleLogger extends Logger {

  def log(msg: String) {
    println(msg)
  }

}
