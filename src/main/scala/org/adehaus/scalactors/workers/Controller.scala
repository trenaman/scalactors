package org.adehaus.scalactors.workers

import actors.Actor

class Controller extends Actor {
  def act() {
    val workers = ((1 to 20) map { n => new Worker() }).toVector
  }
}
