package org.scala.training.model

/**
 * Created by IntelliJ IDEA.
 * User: amitku
 * Date: 4/29/11
 * Time: 1:02 PM
 * To change this template use File | Settings | File Templates.
 */

case class Item(name:String,description:String,weight:Option[Int],cost:Option[Int],operations:Option[List[Action]]) extends Identity{}