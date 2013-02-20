package org.adehaus.scalactors.workers

import actors.Actor

class Controller extends Actor {
  val NumJobs = 10000
  val NumWorkers = 20

  val workers = Array.fill(NumWorkers) { new Worker().start() }

  def act() {
    var job = 0
    var completedJobs = 0

    while (job < NumJobs) {
      workers(job % NumWorkers) ! Work(job)
      job += 1
    }

    loop {
      react {
        case Done(x) =>
          completedJobs += 1
          if (completedJobs == NumJobs) {
            println("All jobs are completed")
            workers foreach { _ ! Done(0) }
            exit
          }
      }
    }
  }
}
