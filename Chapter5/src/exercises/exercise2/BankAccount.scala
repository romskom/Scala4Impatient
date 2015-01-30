package exercises.exercise2

/**
 * Created by rkomarov on 30.01.2015.
 */
class BankAccount {

  private[this] var _balance: Double = 0.0

  def deposit(arg: Double): Unit = {
    this._balance += arg
  }

  def withdraw(arg: Double): Unit = {
    if (this._balance > arg)
      this._balance -= arg
    /* else throw Exception ??? */

  }

  def balance: Double = _balance

}

object BankAccount {

  def main(args: Array[String]) {
    val bankAccount = new BankAccount
    bankAccount.deposit(100.0)
    println(bankAccount.balance)
    bankAccount.withdraw(50)
    println(bankAccount.balance)
    bankAccount.withdraw(100)
    println(bankAccount.balance)
  }

}