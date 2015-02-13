package traits10_7

/**
 * Created by rkomarov on 13.02.2015.
 */
trait Logger {

  def log(msg: String) // This is an abstract method
  def info(msg: String) { log("INFO: " + msg) }
  def warn(msg: String) { log("WARN: " + msg) }
  def severe(msg: String) { log("SEVERE: " + msg) }

}
