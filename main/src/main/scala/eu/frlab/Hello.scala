package eu.frlab

import scala.io.{BufferedSource, Source}

object Hello extends Greeting with App {

  private val source: BufferedSource = Source.fromResource("name.txt")
  val name: String = source.getLines().next()
  source.close()

  println(greet(name))
}
