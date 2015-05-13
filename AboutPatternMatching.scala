
val (a, b) = (4, 5)

println(a)
println(b)

class Employee(val firstName:String, val lastName:String)

object Employee {

    def apply(fn:String, ln:String) = new Employee(fn, ln)

    def unapply(e:Employee):Option[(String, String)] = {
        Some(e.firstName -> e.lastName)
    }
}

val e = Employee("Bob", "Barker")

val Employee(fn, ln) = e

println(fn)
println(ln)

e match {
   case Employee(a, _)  => println(s"Oh hello $a")
   case _ => println("Get Out!")
}

val xs = List(1,2,3,4) 

val r = xs match {
  case Nil => println("It's empty")
  case x :: Nil => println("One item and it is " + x)
  case x :: xs => println("Many item list, head is " + x + " and tail is " + xs)
}


val r1 = xs match {
  case List() => println("It's empty")
  case List(x) => println("One item and it is " + x)
  case List(x, xs@_*) => println("Many item list, head is " + x + " and tail is " + xs)
}

object Odds {
    def unapplySeq(xs:List[Int]) = Some(xs.filter(x => x % 2 != 0))
}

val r2 = xs match {
   case Odds() => println("No odds")
   case Odds(x) => println("1 odd")
   case Odds(xs@_*) => println("Lots of odds")
}











