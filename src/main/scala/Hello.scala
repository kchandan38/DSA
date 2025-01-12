object Hello extends App {
    var name = "Chandan"

  for (
    i <-name.length until 0 by -1
  )
  yield (
    println(i)
    //println(name(i-1))
  )
}