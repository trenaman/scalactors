package org.adehaus.scalactors.simple

import actors.Actor

class Receiver extends Actor {
  def act() {
   loop {
     react {
      case Message(data) =>
        println("Received message %s".format(data))
        sender ! Terminate
      }
   }
  }
}
