package com.example.developermulticamp.data

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("multicamp/communities")
    suspend fun getmulticampCommunities():ArticlesResponse


}