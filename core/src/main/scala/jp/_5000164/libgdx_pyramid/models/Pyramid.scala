package jp._5000164.libgdx_pyramid.models

case class Pyramid(depth: Int) {
  require(depth > 0)

  def render(): List[String] = {
    List("sample", "test")
  }
}
