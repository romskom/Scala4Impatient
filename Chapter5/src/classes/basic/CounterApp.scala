package classes.basic

/**
 * Created by rkomarov on 30.01.2015.
 */
object CounterApp  extends App {
/*

Хорошим стилем считается использовать () при вызове методов-мутаторов
(mutator, изменяющих состояние объекта)
 и опускать их при вызове методов-акцессоров
(accessor, не изменяющих состояния объекта).

 */

  val myCounter = new Counter()
  myCounter.increment()
  println( myCounter.current )

}
