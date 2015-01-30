package classes.basic

/**
 * Created by rkomarov on 30.01.2015.
 */
object SomeApp {

  def main(args: Array[String]) {
    val someVal = new SomeValClass()
    var i1: Int = someVal.foo
    // someVal.foo = 5 !!! WRONG

    val someVar = new SomeVarClass()
    var i2: Int = someVar.foo
    i2 += 1
    someVar.foo = i2

    val someFoo = new SomeFooClass()
    val i3 = someFoo.foo
  }

}
