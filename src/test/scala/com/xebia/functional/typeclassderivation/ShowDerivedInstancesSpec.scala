package com.xebia.functional.typeclassderivation

import munit.FunSuite
import com.xebia.functional.typeclassderivation.shapeless3.Show

class ShowDerivedInstancesSpec extends FunSuite {

  enum StatusEnum derives Show:
    case Good(score: Int)
    case Bad(reason: String)

  test("Type class instances derived using Shapeless 3") {

    assertEquals(
      Show[StatusEnum].show(StatusEnum.Good(100)),
      "Good(score = 100)"
    )
    assertEquals(
      Show[StatusEnum].show(StatusEnum.Bad("fail")),
      "Bad(reason = fail)"
    )

  }

}
