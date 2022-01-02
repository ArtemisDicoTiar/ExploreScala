package org.john.chapter9

trait HtmlUtilsTrait {
  def removeMarkup(input: String): String = {
    input
      .replaceAll("""</?\w[^>]*>""", "")
      .replaceAll("<.*>", "")
  }
}

class Page(val s: String) extends HtmlUtilsTrait {
  def asPlainText: String = removeMarkup(s)
}
