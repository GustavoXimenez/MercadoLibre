package com.grjt.mercadolibre.data.model

import com.google.gson.annotations.SerializedName


data class Items (

  @SerializedName("site_id"                   ) var siteId                 : String?                     = null,
  @SerializedName("country_default_time_zone" ) var countryDefaultTimeZone : String?                     = null,
  @SerializedName("query"                     ) var query                  : String?                     = null,
  @SerializedName("paging"                    ) var paging                 : Paging?                     = Paging(),
  @SerializedName("results"                   ) var results                : ArrayList<Results>          = arrayListOf(),
  @SerializedName("sort"                      ) var sort                   : Sort?                       = Sort(),
  @SerializedName("available_sorts"           ) var availableSorts         : ArrayList<AvailableSorts>   = arrayListOf(),
  @SerializedName("filters"                   ) var filters                : ArrayList<Filters>          = arrayListOf(),
  @SerializedName("available_filters"         ) var availableFilters       : ArrayList<AvailableFilters> = arrayListOf()

)