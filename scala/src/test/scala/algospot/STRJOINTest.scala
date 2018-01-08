package algospot
package STRJOIN

import utest._
import Main.solution

object Test extends TestSuite {
  val tests = Tests {
    'first - {
      val input = List(2, 2, 4)
      val result = solution(input)
      assert(result == 12)
    }
    'second - {
      val input = List(3, 1, 3, 4, 1)
      val result = solution(input)
      assert(result == 26)
    }
    'third - {
      val input = List(1, 1, 1, 1, 1, 1, 1, 2)
      val result = solution(input)
      assert(result == 27)
    }
  }
}
