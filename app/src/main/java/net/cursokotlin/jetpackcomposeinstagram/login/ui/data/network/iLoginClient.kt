package net.cursokotlin.jetpackcomposeinstagram.login.ui.data.network

import net.cursokotlin.jetpackcomposeinstagram.login.ui.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface iLoginClient {
    @GET("/v3/f78c9d33-28b1-4f81-9cf1-6d6ff78fa014")
    suspend fun doLogin(): Response<LoginResponse>

}