package exercises.ex2.accounts

/**
 * Created by rkomarov on 06.02.2015.
 */
object SavingsAccountTest extends App {

  val account = new SavingsAccount(1000, 0.01, 1)
  println(account)

  account.deposit(100)
  println(account)
  account.deposit(200)
  println(account)
  account.deposit(300)
  println(account)
  account.withdraw(500)
  println(account)
  account.withdraw(10)
  println(account)
  account.withdraw(10)
  println(account)

  account.earnMonthlyInterest
  println(account)

}
