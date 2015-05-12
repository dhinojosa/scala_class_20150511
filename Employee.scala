
import scala.beans.BeanProperty

class Employee (@BeanProperty val ssn:String, 
                @BeanProperty var firstName:String, 
                @BeanProperty val lastName:String) {

   def this(firstName:String, lastName:String) = this("000-00-0000", firstName, lastName)

   def this() = this("000-00-0000", "John", "Doe")
}

