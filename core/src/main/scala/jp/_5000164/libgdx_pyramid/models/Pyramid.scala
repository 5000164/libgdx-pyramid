package jp._5000164.libgdx_pyramid.models

import scala.math.abs

case class Pyramid(depth: Int) {
  require(depth > 0)

  def calculateHeight(): IndexedSeq[Int] = {
    for (i <- -depth to depth if depth - abs(i) != 0) yield depth - abs(i)
  }

  def render(): List[String] = {
    val heightList = this.calculateHeight()
    heightList.toList.map("o" * _)
  }
}
