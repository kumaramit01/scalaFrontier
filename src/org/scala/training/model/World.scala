package org.scala.training.model

/**
 * Created by IntelliJ IDEA.
 * User: amitku
 * Date: 4/30/11
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */

case class World(player:Player,inventory:Inventory,characters:List[Character],maps:List[Map])



object Main{


  def main(args: Array[String]) {

    val knifeArmor = Armor(description = "Protects from knife",name = "Knife Protect",weight=10,power=100,cost=100)
    val bulletArmor = Armor(description = "Protects from Bullets",name = "Bullet Protect",weight=15,power=100,cost=300)
    val superArmor = Armor(description = "Protects from all Weapons",name = "All Protect",weight=20,power=100,cost=500)


    val WeaponNames = ("Knife", 50) :: ("Gun", 100) :: ("Sword",75):: ("Fire",175)::("Water",175)::Nil
    val Weapons: List[Weapon] = WeaponNames.map { tuple =>
      val (name, cost) = tuple
      Weapon(name, name, power = 100, powerMax = 100, cost = cost)
    }


    val liftAction:Action =  Action("lift","Lift objects",2)
    val throwAction:Action =  Action("throw","throw objects",3)
    val rideAction:Action =  Action("ride","ride the horse",1)
    val fallAction:Action =  Action("fall","fall down",2)
    val protectAction:Action =  Action("protect","protect meek",5)
    val donateAction:Action =  Action("donate","help others",2)
    val ignoreAction:Action =  Action("ignore","ignore others",20)
    val payAction:Action =  Action("pay","buy things or pay penance",5)
    val helpAction:Action =  Action("help","help others",5)



    val itemNames:List[(String,Option[Int],Option[Int],Option[List[Action]])]=
                    ("Boulder",Some(10000), None,        Some(List(liftAction,throwAction)))::
                    ("Horse",  Some(1000),  Some(-1000), Some(List(rideAction)))::
                    ("Goat",   Some(100),   Some(-100),  None)::
                    ("Moat",   None,        None,        Some(List(protectAction)))::
                    ("Money",  None,        Some(1000),  Some(List(donateAction,payAction)))::
                    ("Pity",   None,        Some(-100),  Some(List(ignoreAction,helpAction)))::
                    ("Penance",None,        Some(-200),  Some(List(payAction)))::
                    ("Water",None,        Some(-200),  Some(List(payAction)))::
                    Nil



    val Items: List[Item] = itemNames.map{ tuple =>
        val (name,weight,cost,op) = tuple
        Item(name,name,weight,cost,op)

    }
    val inventory:Inventory = Inventory(Items)
    val map1 = Map(name="Mountain", Items.filter(_.name=="Boulder"), List("Heaven"))
    val map2 = Map(name="Lake",Items.filter(_.name=="Water"), List("Heaven"))
    val map3 = Map(name="Burning Lake",Items.filter(_.name=="Penance"), List("Hell"))
    val map4 = Map(name="Hell",Items.filter(_.name=="Penance"), Nil  )
    val map5 = Map(name="Heaven",Items.filterNot(_.name=="Penance"), Nil )



    val shrek = new Character("Shrek","Green but kind monster",Some(knifeArmor),Some(Weapons))
    val bane = new Character("Slithering Bane","Brings Destruction Everywhere",Some(knifeArmor),Some(Weapons));

    val characterList= List(shrek,bane)

    println("What is your name ?")
    val playerName:String = readLine
    println("Welcome "+ playerName+"!");
    println("Who do you want to be ?")

    // display the list of characters

    for(i<-0 until characterList.length ){
      println(i+ ") "+ characterList(i).name +" : " + characterList(i).description)
    }

    val player:Player = Player(playerName)
    val myWorld:World = World(player,inventory,characterList,List(map1,map2,map3,map4,map5))



  }


}