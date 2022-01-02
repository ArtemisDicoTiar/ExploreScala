package org.john.chapter9

class DBConnection {
  private val props = Map(
    "url" -> DBConnection.db_url,
    "user" -> DBConnection.db_user,
    "pass" -> DBConnection.db_pass
  )

  println(s"Established new DB Connection for " + props("url"))
}

object DBConnection {
  private val db_url = "jdbc://localhost"
  private val db_user = "franken"
  private val db_pass = "berry"

  /**
   *
   * @return new instance of DBConnection class
   *         when Apply method
   *          eg. DBConnection(smth, smth...)
   *         is called
   */
  def apply() = new DBConnection
}