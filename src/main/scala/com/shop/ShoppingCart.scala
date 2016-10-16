package com.shop

import scala.math.BigDecimal.RoundingMode

/**
  * Created by Shiva on 16/10/2016.
  */
object ShoppingCart {

  // Each Item price.
  private val itemsPriceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25))

  def getPrice(item: String): Double = {
    itemsPriceList.getOrElse(item toLowerCase, 0)
  }

  def price(item: String): Option[Double] = itemsPriceList.get(item toLowerCase)

  /**
    * To perform checkout operation with list of selected items
    * @param items A list of items
    * @return      Total cost
    */
  def checkout(items: Array[String]): Double = {

     return null;

  }


}
