package org.adehaus.scalactors.simple

object Main {
  def main(args: Array[String]) {
    val receiver = new Receiver().start

    new Sender(receiver).start
  }
}
