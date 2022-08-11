package com.grjt.mercadolibre.data.model

import com.google.gson.annotations.SerializedName

class ValueStruct (
    @SerializedName("number"     )  var number   : Double?               = null,
    @SerializedName("unit"       )  var unit     : String?            = null
)