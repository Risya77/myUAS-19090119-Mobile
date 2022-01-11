package akakom.nomhs.myuas


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import java.lang.reflect.Parameter
import java.util.*

interface Api {
    @GET("https://jsonplaceholder.typicode.com/")
    fun getPosts(
        @Query("userId")userId:Int,
        @Query("Id")id:Int): Call<ArrayList<PostResponse>>

    @GET("post")
    fun getpost(
        @QueryMap parameters:HashMap<String,String>
    ):Call<ArrayList<PostResponse>>


}