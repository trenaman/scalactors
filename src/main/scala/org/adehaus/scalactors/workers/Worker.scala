package org.adehaus.scalactors.workers

import actors.Actor

class Worker extends Actor {
  def act() {
    loop {
      react {
        case Work(x) =>
          sender ! Done(x)
        case Done(_) =>
          exit
      }
    }
  }
}
