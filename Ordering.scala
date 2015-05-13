
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
 val list = List(new Employee("123-45-6789", "Bob", "Henderson", 20000),
                new Employee("222-04-0202", "Ann", "McCarthy", 150000),
                new Employee("213-03-9943", "Janice", "Agnew", 40000),
                new Employee("444-12-9943", "Sammy", "Zygote", 10000),
                new Employee("246-33-9943", "Marc", "Locust", 20000),
                new Employee("938-50-9943", "Julie", "Oleg", 30000),
                new Employee("888-19-9943", "Ramona", "Gonzales", 140000))


    def topThree [T : Ordering](xs:List[T]):List[T] = xs.sorted.take(3);

{
   import MyOrderingLibrary.{orderBySSN}
   println(list.sorted)
   println (topThree(list))
}

{
   import MyOrderingLibrary.{orderBySalary}
   println(topThree(list))
}
