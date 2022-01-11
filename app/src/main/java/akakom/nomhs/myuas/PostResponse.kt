package akakom.nomhs.myuas

import com.google.gson.annotations.SerializedName

class PostResponse (
    val id: Int,
    val title:String?,
    @SerializedName("body")
    val text:String?
    )
