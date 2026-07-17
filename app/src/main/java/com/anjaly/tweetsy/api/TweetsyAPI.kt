package com.anjaly.tweetsy.api

import com.anjaly.tweetsy.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {
    @GET("/v3/b/6a572061da38895dfe5f633d?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String): Response<List<TweetListItem>>

    @GET("/v3/b/6a572061da38895dfe5f633d?meta=false")
    @Headers("X-JSON-Path:$..category")
    suspend fun getCategories(): Response<List<String>>
}