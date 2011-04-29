package org.scala.training.model

/**
 * Created by IntelliJ IDEA.
 * User: amitku
 * Date: 4/29/11
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */

case class Key(locks:Set[Lock],name:String,cost:Int) extends Identity

///val myKey = Key[Lock](locks = )