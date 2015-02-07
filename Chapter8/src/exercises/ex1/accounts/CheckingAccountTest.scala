package exercises.ex1.accounts

/**
 * Created by rkomarov on 06.02.2015.
 */
object CheckingAccountTest extends App {

  private val checkingAccount = new CheckingAccount(1000, 1)
  println(checkingAccount)

  checkingAccount.withdraw(100)
  println(checkingAccount)

  checkingAccount.deposit(500)
  println(checkingAccount)

  val checkingAccount1 = new CheckingAccount(1000, 1)
  println(checkingAccount1)

  checkingAccount1.withdraw(100)
  println(checkingAccount1)

  checkingAccount1.deposit(500)
  println(checkingAccount1)

}
