package valsandvars

/**
 * Created by Роман on 08.02.2015.
 */
class ClassVar {

  val id = ClassVar.nextId

  var publicValue : String = "Public value"

  private var privateValue : String = "Private value"

  override def toString = s"ClassVar(id=$id, publicValue=$publicValue, privateValue=$privateValue)"

}

object ClassVar {

  private var currentId = 0;

  private def nextId = { currentId += 1; currentId }

  def apply(arg1: String, arg2: String) : ClassVar = {
    val newClassVar : ClassVar = new ClassVar()
    newClassVar.privateValue = arg1
    newClassVar.publicValue = arg2
    newClassVar
  }

}


