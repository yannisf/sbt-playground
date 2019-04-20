package eu.frlab

import scala.io.Source

object Hello extends Greeting with App {

  val ConfigurationFile = "name.txt"

  val source = Source.fromResource(ConfigurationFile)
  try {
    val name: String = source.getLines().mkString(" ")
    println(greet(name))
  } finally {
    source.close()
  }

}
