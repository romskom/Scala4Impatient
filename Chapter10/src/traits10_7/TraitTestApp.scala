package traits10_7

/**
 * Created by rkomarov on 13.02.2015.
 */
object TraitTestApp extends App {
  val account = new SavingsAccount();
  account.deposit(1000)
  account.withdraw(100)
  account.withdraw(1000)
}
