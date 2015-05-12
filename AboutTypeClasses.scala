class Employee (val ssn:String, val firstName:String, val lastName:String)

class CSV(val value:String)  {
   override def toString = value
}

object EmployeeSerializers {
  implicit val employee2XML = (e:Employee) => <employee><social-security>{e.ssn}</social-security><first-name>{e.firstName}</first-name><last-name>{e.lastName}</last-name></employee>

  implicit val employee2CSV = (e:Employee) => new CSV(s"Employee, ${e.ssn}, ${e.firstName}, ${e.lastName}")
}

import EmployeeSerializers._

def serialize[A, B](a:A)(implicit a2b: (A => B)):B = {
   a2b(a)
}

println(serialize[Employee, CSV](new Employee("123-22-1200", "Bob", "Barker")))
println(serialize[Employee, scala.xml.Elem](new Employee("123-22-1200", "Bob", "Barker")))
println(serialize(new Employee("123-22-1200", "Stan", "Lee")):CSV)
println(serialize(new Employee("123-22-1200", "Stan", "Lee")):scala.xml.Elem)


