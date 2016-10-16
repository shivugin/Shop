package com.shop


import org.specs2.mutable.Specification

/**
  * To test Online Store Shopping Cart functionality
  *
  * @author Created by Shiva on 16/10/2016.
  */
class ShoppingCartITest extends Specification {

  "An Apple Price should be 0.60" in {
    ShoppingCart.getPrice("apple") must be equalTo 0.60
  }

  "An Orange price should be 0.25" in {
    ShoppingCart.getPrice("orange") must be equalTo 0.25
  }

  "Item's Price which doesn't exist in the store should be 0" in {
    ShoppingCart.getPrice("None") must be equalTo 0
  }

  "ShoppingCart.getPrice should work in case-insensitive manner" in {
    ShoppingCart.getPrice("APPLE") must be equalTo 0.60
    ShoppingCart.getPrice("ORANGE") must be equalTo 0.25
  }
}
