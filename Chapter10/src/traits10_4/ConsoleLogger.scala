package traits10_4

/**
 * Created by Роман on 12.02.2015.
 */
trait ConsoleLogger extends Logged {
  override def log(msg: String) { println(msg) }
}
