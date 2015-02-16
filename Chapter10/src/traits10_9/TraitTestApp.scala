package traits10_9

/**
 * Created by Роман on 12.02.2015.
 */
object TraitTestApp extends App {
  val account = new SavingsAccount with ConsoleLogger with TimestampLogger with ShortLogger { val maxLength = 20 }
  account.deposit(1000)
  account.withdraw(100)
}
