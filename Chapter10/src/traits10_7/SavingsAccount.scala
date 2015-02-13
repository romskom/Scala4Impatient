package traits10_7

/**
 * Created by rkomarov on 13.02.2015.
 */
class SavingsAccount extends Account with Logger {

  override def deposit(amount: Double): Unit = {
    info("deposit account")
    balance += amount
  }

  override def withdraw(amount: Double): Unit = {
    if (amount > balance) {
      severe("insufficient funds")
    } else {
      info("withdraw account")
      balance -= amount
    }
  }

  override def log(msg: String): Unit = { println(msg) }
}
