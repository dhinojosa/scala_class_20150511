
 def myHead[A](lst:List[A]):Option[A] = lst match {
      case Nil => None
      case x :: Nil => Some(x)
      case x :: xs => Some(x)
 }


 def myMax(lst:List[Int]):Option[Int] = { 
 
   val compare = (x:Int, y:Int) => if (x > y) x else y

   def myMaxHelper(lst:List[Int], maxSoFar:Int):Option[Int] = {
     lst match {
        case Nil => None
        case x :: Nil => Some(compare(x, maxSoFar))
        case x :: xs => myMaxHelper(xs, compare(x, maxSoFar))
     }
   }
   myMaxHelper(lst, Int.MinValue)
 }


 println(myMax(List(1,2,3,4,5,6)))
 println(myMax(List(1000,22,3102,14,0,-2003)))
 println(myMax(List(1000)))
 println(myMax(List()))
