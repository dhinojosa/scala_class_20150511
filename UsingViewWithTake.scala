val lst = 1 to 100000
var history = List[String]()

def addHistory(s: String) {
  history = history :+ s
}

lst.view.map { x => addHistory("Doubling %s".format(x)); x * 2}.map {
               x => addHistory("Adding 1 to %s".format(x)); x + 1}.take(5).force

println(history)


history = List[String]()

lst.map { x => addHistory("Doubling %s".format(x)); x * 2}.map {
          x => addHistory("Adding 1 to %s".format(x)); x + 1}.take(5)

println("Sorry I have to do this for academia")

println(history)



