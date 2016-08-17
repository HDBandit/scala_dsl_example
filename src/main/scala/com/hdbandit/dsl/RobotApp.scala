package com.hdbandit.dsl

import Robot._
import Speed._

object RobotApp {

  def main(args: Array[String]): Unit = {

    // scala style

    val robot = newRobot(0, 0)
    robot at 30.km_hour towards (20, 15) go

    // java style
    /*
    Robot robot = Robot.newRobot(0, 0);
    robot.at(new Speed(30).km_hour()).towards(20, 20).go();
    */

  }

}
