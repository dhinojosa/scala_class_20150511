def foo (x:Int) (y:Int => Int) = y(x)

println(foo(4)((x:Int) => x * 9))

val z = foo(3) _

//Million of line of code

println(z(x => 500 * x))

def multiply(x: Int, y: Int) = x * y

println(multiply(4, 3)) //12

val multiplyFunction:(Int, Int) => Int = (multiply _)

println(multiplyFunction(4, 5)) //20




