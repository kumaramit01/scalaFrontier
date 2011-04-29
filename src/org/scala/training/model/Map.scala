package org.scala.training.model

/**
 * Created by IntelliJ IDEA.
 * User: amitku
 * Date: 4/29/11
 * Time: 1:01 PM
 * To change this template use File | Settings | File Templates.
 */

case class Map(uid:Int,name:String,description:String,items:Set[Item]) extends Identity{


}