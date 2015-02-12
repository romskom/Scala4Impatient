package traits10_5

/**
 * Created by Роман on 12.02.2015.
 */
trait TimestampLogger extends Logged {
  override def log(msg: String): Unit = {
    super.log(new java.util.Date() + " " + msg)
  }
}
