package org.adehaus.scalactors.simple

object Main {
  def main(args: Array[String]) {
    val receiver = new Receiver()
    receiver.start()

    new Sender(receiver).start
  }
}
