package valsandvars

/**
 * Created by Роман on 08.02.2015.
 */
object ClassTestApp extends App {

  val classVal = new ClassVal()
  val str1 = classVal.publicValue
  println(classVal)

  val classVal2 = ClassVal()
  val str12 = classVal2.publicValue
  println(classVal2)

  val classVar = new ClassVar()
  val str2 = classVar.publicValue
  classVar.publicValue = "new public value"
  println(classVar)

  val classVar2 = ClassVar("changed Private Value", "changed Public Value")
  val str22 = classVar2.publicValue

  println(classVar2)

}
