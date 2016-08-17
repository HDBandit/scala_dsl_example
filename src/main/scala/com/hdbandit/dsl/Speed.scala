package com.hdbandit.dsl

object Speed {

  implicit def Int2Speed(value: Int): Speed = new Speed(value)

}

case class Speed(value: Int) {

  def km_hour: Speed = this

  def milles_hour: Speed = this

  def meters_second: Speed = this

}
