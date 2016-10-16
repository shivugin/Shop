package com.shop

import org.specs2.mutable.Specification

/**
  * To test Store Offers functionality
  *
  * @author Shiva
  */
class OffersITest extends Specification {

  "On Buy One Get One offer: When one item cost is 0.60, then 2 items cost should be 0.60" in {
    Offers.buyOneGetOneOffer(2, 0.60) must be equalTo 0.60
  }

  "On Buy One Get One offer: When one item cost is 0.60, then 3 items cost should be 1.20" in {
    Offers.buyOneGetOneOffer(3, 0.60) must be equalTo 1.20
  }

  

}

