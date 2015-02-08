package valsandvars

/**
 * Created by Роман on 08.02.2015.
 */
class ClassVal {

  val id = ClassVal.id

  val publicValue : String = "Private Value"

  private val privateValue : String = "Public Value"

  override def toString = s"ClassVal(id=$id, publicValue=$publicValue, privateValue=$privateValue)"

}

object ClassVal {

  private var nextId = 0

  private def id = { nextId +=1; nextId }

  def apply() : ClassVal = {
    val newClassVal = new ClassVal()
    newClassVal
  }

}
