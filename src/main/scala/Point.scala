package main.scala

import scala.math

class Point (var x: Int, var y: Int){
  def moveTo(newX: Int, newY: Int) = {x=newX; y=newY}
  def getDistanceTo(someX: Int, someY: Int): Double = {math.sqrt(math.pow(someX - x, 2) + math.pow(someY - y, 2))}
}

