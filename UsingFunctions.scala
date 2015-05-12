// https://github.com/dhinojosa/scala_class_20150511

val a = new Function1[Int, Int] {
           def apply(x:Int):Int = x + 1
      }

val a_shorter = (x:Int) => x + 1

val b = new Function2[Int, String, Int] {
          def apply(x:Int, y:String):Int = {
               y.size + x
          }
}

val b_shorter = (x:Int, y:String) => y.size + x


val c = new Function2[Int, String, (String, String)] {
     def apply(x:Int, y:String):(String, String) = {
           if (x > 10) (x.toString, y + x)  //returning the last item
           else (x.toString, x + y)
     }
}

val c2 = new Function2[Int, String, Tuple2[String, String]] {
     def apply(x:Int, y:String):Tuple2[String, String] = {
           if (x > 10) (x.toString, y + x)  //returning the last item
           else (x.toString, x + y)
     }
}

val c3 = (x:Int, y:String) => {
           if (x > 10) (x.toString, y + x)  //returning the last item
           else (x.toString, x + y)
}

val c4:(Int, String) => (String, String) = (x:Int, y:String) => {
           if (x > 10) (x.toString, y + x)  //returning the last item
           else (x.toString, x + y)
}

val c5:Function2[Int, String, Tuple2[String, String]] = (x:Int, y:String) => {
           if (x > 10) (x.toString, y + x)  //returning the last item
           else (x.toString, x + y)
}


println(a.apply(4))
println(b.apply(5, "Wow"))
println(a(4))
println(b(5, "Wow"))
println(c.apply(4, "Zing"))
println(c(4, "Zing"))
println(c2.apply(4, "Zing"))
println(c2(4, "Zing"))
println(c3.apply(4, "Zing"))
println(c3(4, "Zing"))
println(c4.apply(4, "Zing"))
println(c4(4, "Zing"))
println(c5.apply(4, "Zing"))
println(c5(4, "Zing"))





//return a tuple
