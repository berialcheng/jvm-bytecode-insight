package org.nirvana.scala

object SingletonCode {

  private var counter = 0

  def create(): Int = {
    counter += 1
    counter
  }
}
