package org.scala.training.model

/**
 * Created by IntelliJ IDEA.
 * User: amitku
 * Date: 4/29/11
 * Time: 3:31 PM
 */

case class Inventory(items:List[Item]){



  def addItem(item:Item) {
      Inventory(item :: items)
  }


  def removeItem(item:Item){
    Inventory(items.filterNot(
    _.name == item.name
    )
   )
  }


}