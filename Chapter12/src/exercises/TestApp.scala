package exercises

/**
 * Created by rkomarov on 25.02.2015.
 */
object TestApp extends App {

  def fuctorial(n: Int) : Int = {
    if (n < 0) 1;
    if (n == 1) 1;
    (1 to n).reduceLeft(_ * _)
  }

  for (x <- 1 to 10) {
    val f1 = fuctorial(x);
    println("x = " + x + "; fuctorial = " + f1)
  }
}
