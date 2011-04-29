package org.scala.training.model

/**
 * Created by IntelliJ IDEA.
 * User: amitku
 * Date: 4/29/11
 * Time: 10:18 AM
 * To change this template use File | Settings | File Templates.
 */

case class Potion(color:String,scale:Int,scaleMax:Int=100,cost:Option[Int]) extends Identity{}