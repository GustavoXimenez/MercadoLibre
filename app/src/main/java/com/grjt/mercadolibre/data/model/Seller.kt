package com.grjt.mercadolibre.data.model

import com.google.gson.annotations.SerializedName


data class Seller (

  @SerializedName("id"                 ) var id               : Int?              = null,
  @SerializedName("permalink"          ) var permalink        : String?           = null,
  @SerializedName("registration_date"  ) var registrationDate : String?           = null,
  @SerializedName("car_dealer"         ) var carDealer        : Boolean?          = null,
  @SerializedName("real_estate_agency" ) var realEstateAgency : Boolean?          = null,
  @SerializedName("tags"               ) var tags             : ArrayList<String> = arrayListOf(),
  @SerializedName("eshop"              ) var eshop            : Eshop?            = Eshop(),
  @SerializedName("seller_reputation"  ) var sellerReputation : SellerReputation? = SellerReputation()

)