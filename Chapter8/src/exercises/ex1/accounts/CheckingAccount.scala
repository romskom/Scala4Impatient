package exercises.ex1.accounts

/**
 * Created by rkomarov on 06.02.2015.
 */
class CheckingAccount(initialBalance: Double, initialCommission :Double) extends BankAccount(initialBalance){

  val accountCommission = initialCommission

  override def deposit(amount: Double): Double = {
    super.deposit(amount)
    super.withdraw(accountCommission)
  }

  override def withdraw(amount: Double): Double = {
    super.withdraw(amount)
    super.withdraw(accountCommission)
  }

  def commission = accountCommission

  override def toString() = "CheckingAccount[ id = " + id + ", balance = " + currentBalance + ", commission = " + commission +  "]"

}
