package exercises.ex1.accounts

/**
 * Created by rkomarov on 06.02.2015.
 */
object BankAccountTest extends App {

  val account = new BankAccount(1000)
  println(account)

  account.withdraw(10)
  println(account)

  account.deposit(20)
  println(account)

  val account1 = new BankAccount(1000)
  println(account1)

  account1.withdraw(10)
  println(account1)

  account1.deposit(20)
  println(account1)


}
