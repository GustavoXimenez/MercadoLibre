package com.grjt.mercadolibre.data.model

import com.google.gson.annotations.SerializedName


data class Metadata (

    @SerializedName("promotion_id"  ) var promotionId   : String?   = null,
    @SerializedName("promotion_type") var promotionType : String?   = null,

)