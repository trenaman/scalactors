package org.adehaus.scalactors.simple

import actors.Actor

class Sender(receiver: Receiver) extends Actor {
  def act() {
    receiver ! Message("Let's get this party started.")

    loop {
      react {
        case Terminate =>
          println("Got the terminate message; terminating.")
          exit
      }
    }
  }
}
