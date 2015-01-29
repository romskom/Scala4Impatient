package maps

/**
 * Created by rkomarov on 29.01.2015.
 */
object MapsObj extends App {

  val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  println (scores)
  println (scores.getClass)

  val scoresMutable = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  println(scoresMutable)
  println(scoresMutable.getClass)

  val scoresEmpty = new scala.collection.mutable.HashMap[String, Int]
  println(scoresEmpty)
  println(scoresEmpty.getClass)

  val pair = "Alice" -> 10
  println(pair)
  println(pair.getClass())
  val pair2 = ("Alice", 10)
  println(pair2)
  println(pair2.getClass())

  val scoresTuples = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))

  val bobScore = scores("Bob")
  val bobScore2 = if(scores.contains("Bob")) scores("Bob") else 0
  val bobScore3 = scores.getOrElse("Bob", 0)

  val bobScore4 = scores.get("Bob")
  println(bobScore4)
  println(bobScore4.getClass)

}
