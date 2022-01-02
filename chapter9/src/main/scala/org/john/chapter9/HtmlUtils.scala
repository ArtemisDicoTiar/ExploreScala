package org.john.chapter9

object HtmlUtils {
  def removeMarkup(input: String): String = {
    input
      .replaceAll("""</?\w[^>]*>""", "")
      .replaceAll("<.*>", "")
  }

}
