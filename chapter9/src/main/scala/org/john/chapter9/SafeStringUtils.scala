package org.john.chapter9

trait SafeStringUtils {
  def trimToNone(s: String): Option[String] = {
    Option(s)
      .map(_.trim)
      .filterNot(_.isEmpty)
  }
}

class Page2(val s: String) extends SafeStringUtils with HtmlUtilsTrait {
  def asPlainText: String = {
    trimToNone(s)
      .map(removeMarkup)
      .getOrElse("N/A")
  }
}