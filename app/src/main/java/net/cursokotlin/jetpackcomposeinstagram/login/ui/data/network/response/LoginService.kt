package net.cursokotlin.jetpackcomposeinstagram.login.ui.data.network.response

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.cursokotlin.jetpackcomposeinstagram.core.network.RetrofitHelper
import net.cursokotlin.jetpackcomposeinstagram.login.ui.data.network.iLoginClient

class LoginService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user:String, password:String):Boolean {
       return withContext(Dispatchers.IO) {
           val response = retrofit.create(iLoginClient::class.java).doLogin()
            response.body()?.success ?: false
        }
    }

}