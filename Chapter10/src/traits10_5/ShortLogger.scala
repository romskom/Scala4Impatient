package traits10_5

/**
 * Created by Роман on 12.02.2015.
 */
trait ShortLogger extends Logged {

  val maxLength = 15

  override def log(msg: String): Unit = {
    super.log(
      if (msg.length <= maxLength) msg
      else msg.substring(0, maxLength - 3) + "..."
    )
  }
}
