

val a = List(1,2,3,4,5,6).foldLeft(0){(total, next) => 
           println(s"total: $total, next: $next");
           total + next }

println(a)

val b = List(1,2,3,4,5,6).reduceLeft{(total, next) => 
           println(s"total: $total, next: $next");
           total + next }

println(b)

val c = List(1,2,3,4,5,6).foldRight(0){(next, total) => 
           println(s"total: $total, next: $next");
           total + next }

println(c)


val a2 =  (0 /: List(1,2,3,4,5,6))
          {(total, next) => println(s"total: $total, next: $next"); total + next }

println(a2)


def myMax(xs:List[Int]) = xs.foldLeft(Int.MinValue){(winner, next) => if (next > winner) next else winner}

println(myMax(List(1000, 22, -13, 4, 0)))












