package example

import org.scalatest.FunSuite

/**
  * Created by joanenric on 25/06/2016.
  */
class HelloTest extends FunSuite {
  test("sayHello method works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }

}
