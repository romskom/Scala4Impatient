package traits10_4

/**
 * Created by Роман on 12.02.2015.
 */
class SavingsAccount extends Account with Logged {
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
