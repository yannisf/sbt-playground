package eu.frlab

trait Greeting {
  lazy val greeting: String = "Hello"

  def greet(name: String) = s"$greeting, $name"
}
