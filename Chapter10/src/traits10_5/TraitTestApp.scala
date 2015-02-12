package traits10_5

/**
 * Created by Роман on 12.02.2015.
 */
object TraitTestApp extends App {
  val account = new SavingsAccount with ConsoleLogger with TimestampLogger with ShortLogger
  account.deposit(1000)
  account.withdraw(100)
}
