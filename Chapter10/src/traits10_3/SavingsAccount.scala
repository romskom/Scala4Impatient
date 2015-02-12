package traits10_3

/**
 * Created by Роман on 12.02.2015.
 */
class SavingsAccount extends Account with ConsoleLogger{
  override def deposit(amount: Double): Unit = {
    log("deposit account")
    balance += amount
  }

  override def withdraw(amount: Double): Unit = {
    if (amount > balance) {
      log("insufficient funds")
    } else {
      log("withdraw account")
      balance -= amount
    }
  }
}
