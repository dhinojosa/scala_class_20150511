
class Foo(var x:Int) {
   def bar(y:Int) = { 
      (z:Int) => x + y + z
   }
}

val foo = new Foo(13)

val f = foo.bar(10)

println(f(14)) //37

foo.x = 1000

println(f(14))
