import scala.reflect.runtime.universe._

def inspectWithTypeTags(l:List[T]) = {
    
}

def inspect[T](l: List[T])(implicit tt: TypeTag[T]) = tt.tpe.typeSymbol.name.decoded

val list:List[Int] = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

println(inspect(list))
println(inspect(List("One", "Two", "Three")))
