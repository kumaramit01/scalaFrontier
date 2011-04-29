package org.scala.training.model

import collection.mutable.Set;

/**
 * Created by IntelliJ IDEA.
 * User: amitku
 * Date: 4/29/11
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */

case class Character(name:String, description:String,armor:Option[Armor],weapon: Option[Weapon],health:Int=100){
 val items:Set[Item]  = null

}


object Test{


  def main(args: Array[String]) {

    val larry = new Character("Larry","A sample character",None,None,150)
    println(larry)

  }


}