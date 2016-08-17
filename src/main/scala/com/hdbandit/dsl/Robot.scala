package com.hdbandit.dsl

import com.hdbandit.dsl.Speed._

object Robot {

  def newRobot(initialXposition: Int = 0, initialYposition: Int = 0): Robot = new Robot(initialXposition, initialYposition)

}


class Robot(initialXposition: Int, initialYposition: Int) {

  private var previousX = -1
  private var previousY = -1

  private var xPosition = initialXposition
  private var yPosition = initialYposition

  private var speed = 0.km_hour

  def at(s: Speed): Robot = {
    speed = Speed(s.value)
    this
  }

  def towards(coordinate: (Int, Int)): Robot = {
    previousX = xPosition
    previousY = yPosition

    xPosition = coordinate._1
    yPosition = coordinate._2

    println(s"Moving the robot from (x=$previousX, y=$previousY) to (x=$xPosition, y=$yPosition) with speed: $speed")

    this
  }

  def go(): Unit = {
    println(s"Moving the robot from (x=$previousX, y=$previousY) to (x=$xPosition, y=$yPosition) with speed: $speed")
  }

}
