import scala.concurrent._
import ExecutionContext.Implicits.global

val f1 = future { Thread.sleep(40000); 10/2 }

val f2 = future { Thread.sleep(30000); 12/2 }

val f3 = for (x <- f1;
              y <- f2) yield (x + y)

f3 foreach println

val f3_explicit = f1.flatMap(x => f2.map(y => x + y))

f3_explicit foreach println

Thread.sleep(50000) //Keeps the VM Running for 60 minutes
