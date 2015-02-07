package exercises.ex1.accounts

/**
 * Created by rkomarov on 06.02.2015.
 */
class BankAccount(initialBalance: Double) {

  private val accountId = BankAccount.getNewId

  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }

  def currentBalance = balance

  def id = accountId

  override def toString() = "BankAccount[ id = " + this.accountId + ", balance = " + currentBalance + "]"

}

object BankAccount {

  var currentId = 0

  def getNewId = {currentId += 1; currentId}

  def apply(initialBalance: Double) = {
    val newAccount = new BankAccount(initialBalance)
    newAccount
  }
}
