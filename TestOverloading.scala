class Foo {
   def method1(x:Int, y:Int, z:Int):Int = x + y + z
   def method1(x:Int, y:Int):Int = x + y


    import scala.annotation.tailrec //importing annotation!

    def findMeZeFact(z:Int) = {
      @tailrec
      def fact(i: BigInt, accumulator: BigInt): BigInt = {
        if (i <= 1)
         accumulator
        else
          fact(i - 1, i * accumulator)
      }

      def fact(i: BigInt): BigInt = {
        fact(i, 1)
      }
    }
}

object MyApp extends App {
   val foo = new Foo()
   println(foo.method1(3,4))
   println(foo.method1(3,4,5))
   println(foo.fineMeZeFact(4))
}
