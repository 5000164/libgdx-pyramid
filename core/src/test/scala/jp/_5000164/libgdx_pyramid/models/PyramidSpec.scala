package jp._5000164.libgdx_pyramid.models

import org.scalatest.FreeSpec

class PyramidSpec extends FreeSpec {
  "Pyramid" - {
    "calculateHeight" - {
      "各行の高さを求める" in {
        assert(IndexedSeq(1, 2, 3, 2, 1) == Pyramid(3).calculateHeight())
      }
    }

    "render" - {
      "高さに合わせて文字列を生成する" in {
        assert(List("o", "oo", "ooo", "oo", "o") == Pyramid(3).render())
      }
    }
  }
}
