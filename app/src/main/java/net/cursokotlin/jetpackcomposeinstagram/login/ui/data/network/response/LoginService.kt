package net.cursokotlin.jetpackcomposeinstagram.login.ui.data.network.response

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.cursokotlin.jetpackcomposeinstagram.core.network.RetrofitHelper
import net.cursokotlin.jetpackcomposeinstagram.login.ui.data.network.LoginClient

class LoginService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user:String, password:String):Boolean {
       return withContext(Dispatchers.IO) {
           val response = retrofit.create(LoginClient::class.java).doLogin(user,password)
            response.body()?.success ?: false
        }
    }

}