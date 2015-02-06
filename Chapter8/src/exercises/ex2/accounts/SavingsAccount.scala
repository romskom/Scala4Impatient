package exercises.ex2.accounts

import exercises.ex1.accounts.BankAccount

/**
 * Created by rkomarov on 06.02.2015.
 */
class SavingsAccount(initialBalance: Double, initialInterestRate: Double, initialCommission:Double = 1.0) extends BankAccount(initialBalance) {

  private val accountInterestRate = initialInterestRate

  private val accountCommission = initialCommission

  private var transactionCounter = 0

  private def incrementTransactionCounter = {transactionCounter += 1}

  private def resetTransactionCounter = {transactionCounter = 0}

  override def deposit(amount: Double): Double = {
    incrementTransactionCounter
    if (transactionCounter > 3) {
      super.withdraw(commission)
    }
    super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    incrementTransactionCounter
    if (transactionCounter > 3) {
      super.withdraw(commission)
    }
    super.withdraw(amount)
  }

  def interestRate = accountInterestRate

  def commission = accountCommission

  private def chargeInterest = {
    val interest = currentBalance * interestRate
    deposit(interest)
  }

  def earnMonthlyInterest = {
    chargeInterest
    resetTransactionCounter
  }

  override def toString = s"SavingsAccount(balance=$currentBalance, accountInterestRate=$accountInterestRate, accountCommission=$accountCommission, transactionCounter=$transactionCounter)"

}
