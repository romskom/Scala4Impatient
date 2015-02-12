package traits10_4

/**
 * Created by Роман on 12.02.2015.
 */
object TraitTestApp extends App {

  val account = new SavingsAccount with ConsoleLogger
  account.deposit(1000)
  account.withdraw(100)

}
