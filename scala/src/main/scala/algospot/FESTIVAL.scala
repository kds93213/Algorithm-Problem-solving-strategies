package algospot
package FESTIVAL

import scala.io.StdIn._

object Main extends App {
  def loop: Unit = {
    val inputRaw = (1 to 2) map { _ =>
      readLine()
    }
    val firstLine = inputRaw(0).split(" ").map(_.toInt)
    //val maxDayLength = firstLine(0)
    val minTeams = firstLine(1)
    val costs = inputRaw(1).split(" ").map(_.toInt).toList

    //assert(costs.length == maxDayLength)

    val result = (minTeams to costs.length) flatMap { dayLength =>
      (dayLength to costs.length) flatMap { i =>
        costs.grouped(i).collect { case xs if xs.length == i =>
          xs.sum/(i.toDouble)
        }
      }
    }

    //val result2 = for {
    //  dayLength <- minTeams to costs.length
    //  i <- dayLength to costs.length
    //  xs <- costs.grouped(i)
    //  if xs.length == i
    //} yield xs.sum/(i.toDouble)
    //assert(result == result2)

    println(result.min)
  }

  val loopCount = readInt()
  (1 to loopCount) foreach (_ => loop)
}
