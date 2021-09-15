package $package$

import $package$.common.utils.Test

class TestConfig extends Test {

  behavior of "config"

  it should "be accessible" in {
    val $class;format="decap"$ = $class$()
    val message = $class;format="decap"$.getArgString("$class$.message", None)

    println(message)
  }
}
