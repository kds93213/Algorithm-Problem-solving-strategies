package algospot
package FIX

import scala.io.StdIn._

object Main extends App {
  def loop(): Unit = {
    readLine()
    println {
      readLine().split(' ').map(_.toInt).zipWithIndex.filter { case (i, j) => i == j + 1 }.length
    }
  }

  val loopCount = readInt()
  (1 to loopCount) foreach (_ => loop())
}
