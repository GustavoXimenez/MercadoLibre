package com.grjt.mercadolibre.data.model

import com.google.gson.annotations.SerializedName


data class Results (

  @SerializedName("id"                  ) var id                 : String?               = null,
  @SerializedName("site_id"             ) var siteId             : String?               = null,
  @SerializedName("title"               ) var title              : String?               = null,
  @SerializedName("seller"              ) var seller             : Seller?               = Seller(),
  @SerializedName("price"               ) var price              : Double?                  = null,
  @SerializedName("prices"              ) var prices             : Prices?               = Prices(),
  @SerializedName("sale_price"          ) var salePrice          : String?               = null,
  @SerializedName("currency_id"         ) var currencyId         : String?               = null,
  @SerializedName("available_quantity"  ) var availableQuantity  : Int?                  = null,
  @SerializedName("sold_quantity"       ) var soldQuantity       : Int?                  = null,
  @SerializedName("buying_mode"         ) var buyingMode         : String?               = null,
  @SerializedName("listing_type_id"     ) var listingTypeId      : String?               = null,
  @SerializedName("stop_time"           ) var stopTime           : String?               = null,
  @SerializedName("condition"           ) var condition          : String?               = null,
  @SerializedName("permalink"           ) var permalink          : String?               = null,
  @SerializedName("thumbnail"           ) var thumbnail          : String?               = null,
  @SerializedName("thumbnail_id"        ) var thumbnailId        : String?               = null,
  @SerializedName("accepts_mercadopago" ) var acceptsMercadopago : Boolean?              = null,
  @SerializedName("installments"        ) var installments       : Installments?         = Installments(),
  @SerializedName("address"             ) var address            : Address?              = Address(),
  @SerializedName("shipping"            ) var shipping           : Shipping?             = Shipping(),
  @SerializedName("seller_address"      ) var sellerAddress      : SellerAddress?        = SellerAddress(),
  @SerializedName("attributes"          ) var attributes         : ArrayList<Attributes> = arrayListOf(),
  @SerializedName("original_price"      ) var originalPrice      : String?               = null,
  @SerializedName("category_id"         ) var categoryId         : String?               = null,
  @SerializedName("official_store_id"   ) var officialStoreId    : String?               = null,
  @SerializedName("domain_id"           ) var domainId           : String?               = null,
  @SerializedName("catalog_product_id"  ) var catalogProductId   : String?               = null,
  @SerializedName("tags"                ) var tags               : ArrayList<String>     = arrayListOf(),
  @SerializedName("order_backend"       ) var orderBackend       : Int?                  = null,
  @SerializedName("use_thumbnail_id"    ) var useThumbnailId     : Boolean?              = null,
  @SerializedName("offer_score"         ) var offerScore         : String?               = null,
  @SerializedName("offer_share"         ) var offerShare         : String?               = null,
  @SerializedName("match_score"         ) var matchScore         : String?               = null,
  @SerializedName("winner_item_id"      ) var winnerItemId       : String?               = null,
  @SerializedName("melicoin"            ) var melicoin           : String?               = null,
  @SerializedName("discounts"           ) var discounts          : String?               = null

)