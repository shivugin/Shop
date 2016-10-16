package com.shop

/**
  * To define online application offers
  * Created by Shiva on 16/10/2016.
  */
object Offers {

  /**
    * Offer for Items : Bye one and get one
    *
    * @param noOfItems     Number of item selected
    * @param oneItemPrice  Each item price
    * @return
    */
  def buyOneGetOneOffer(noOfItems: Int, oneItemPrice: Double): Double = ((noOfItems / 2) + (noOfItems % 2)) * oneItemPrice




}