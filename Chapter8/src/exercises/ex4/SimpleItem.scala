package exercises.ex4

/**
 * Created by Роман on 07.02.2015.
 */
class SimpleItem(initialPrice: Double, initialDescription: String) extends Item {

  val itemPrice: Double = initialPrice

  val itemDescription: String = initialDescription

  /** get price of element       */
  def price: Double = itemPrice

  /** get description of element */
  def description: String = itemDescription

}
