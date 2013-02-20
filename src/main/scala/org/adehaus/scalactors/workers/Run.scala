package org.adehaus.scalactors.workers


object Run {
  def main(args: Array[String]) {
    new Controller().start()
  }
}
