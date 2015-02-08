package exercises.ex4

/**
 * Created by Роман on 07.02.2015.
 */
object Exercise4TestApp extends App {

  val newItem : Item = new SimpleItem(100.0, "This is a simple item")
  println("Item price is: " + newItem.price + " and item description is '" + newItem.description + "'")

}
