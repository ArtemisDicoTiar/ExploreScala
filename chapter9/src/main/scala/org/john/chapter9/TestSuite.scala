package org.john.chapter9

class TestSuite(suiteName: String) {
  def start(): Unit = {}
}

trait RandomSeeded {
  self: TestSuite =>
    def randomStart(): Unit = {
      util.Random.setSeed(System.currentTimeMillis)
      self.start()
    }
}

class IdSpec extends TestSuite("ID Tests") with RandomSeeded {
  def testId(): Unit = {println(util.Random.nextInt != 1)}

  override def start(): Unit = {
    testId()
  }


  println("Starting...")
  randomStart()
}
