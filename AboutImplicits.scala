
//Added extends AnyRef will Optimize to one object (Verify)

implicit class PigLatinWrapper(x:String) extends AnyRef {
   def pigLatinize =  x.tail.head.toUpper + 
                      x.tail.tail + 
                      x.head.toLower + "ay"
}

//implicit def thisnamedoesntmatter(x:String) = new PigLatinWrapper(x)

//implicit val pigLatinWrapper = (x:String) => new PigLatinWrapper(x)

println("Canada".pigLatinize)
println("Steam".pigLatinize)
println("Syzygy".pigLatinize)
