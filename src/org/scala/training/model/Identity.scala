package org.scala.training.model

/**
 * Created by IntelliJ IDEA.
 * User: amitku
 * Date: 4/29/11
 * Time: 10:37 AM
 * To change this template use File | Settings | File Templates.
 */

trait Identity{
 val uid: java.util.UUID = java.util.UUID.randomUUID
 val name: String
 val description:String
}