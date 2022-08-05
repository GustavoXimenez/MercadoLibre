package com.grjt.mercadolibre.data.model

import com.google.gson.annotations.SerializedName

data class PricesModel (

    @SerializedName("id"                    ) var id                    : Int?          = null,
    @SerializedName("type"                  ) var type                  : String?       = null,
    @SerializedName("amount"                ) var amount                : Double?       = null,
    @SerializedName("regular_amount"        ) var regularAmount         : Double?       = null,
    @SerializedName("currency_id"           ) var currencyId            : String?       = null,
    @SerializedName("last_updated"          ) var lastUpdated           : String?       = null,
    @SerializedName("conditions"            ) var conditions            : Conditions?   = Conditions(),
    @SerializedName("exchange_rate_context" ) var exchangeRateContext   : String?       = null,
    @SerializedName("metadata"              ) var metadata              : Metadata?     = Metadata()

)