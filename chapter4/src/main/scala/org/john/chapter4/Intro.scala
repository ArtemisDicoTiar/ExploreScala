package org.john.chapter4

class Intro {
  def hi1 = "hi"
  def hi2: String = "hi"

  def multiplier(x: Int, y: Int): Int = {x * y}

  def safeTrim(s: String): String = {
    if (s == null) return null
    s.trim()
  }
}
