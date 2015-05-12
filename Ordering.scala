
case class Employee(val ssn:String, val firstName:String, 
                    val lastName:String, val salary:Long)

object MyOrderingLibrary {
   implicit val orderBySalary = new Ordering[Employee] {
       def compare(e1:Employee, e2:Employee) = e1.salary.compare(e2.salary)
   }

   implicit val orderBySSN = new Ordering[Employee] {
       def compare(e1:Employee, e2:Employee) = e1.ssn.compare(e2.ssn)
   }
}

import MyOrderingLibrary.{orderBySSN}

val list = List(new Employee("123-45-6789", "Bob", "Henderson", 20000),
                new Employee("222-04-0202", "Ann", "McCarthy", 150000),
                new Employee("930-22-9943", "Janice", "Agnew", 40000))

println(list.sorted)
