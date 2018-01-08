package algospot
package STRJOIN

import scala.io.StdIn._

object Main extends App {
  def solution(xs: Seq[Int]): Int = {
    @annotation.tailrec
    def loop(xs: Seq[Int], acc: Int): Int = {
      if (xs.length == 1) acc
      else {
        val sum = xs.take(2).sum
        loop((sum +: xs.drop(2)).sorted, sum + acc)
      }
    }
    loop(xs.sorted, 0)
  }


  def loop(): Unit = {
    readLine()

    val result = solution {
      readLine()
        .split(' ')
        .map(_.toInt)
        .toVector
    }

    println(result)
  }

  val loopCount = readInt()
  (1 to loopCount) foreach (_ => loop())

  val a = new { def a = 3 }
}
