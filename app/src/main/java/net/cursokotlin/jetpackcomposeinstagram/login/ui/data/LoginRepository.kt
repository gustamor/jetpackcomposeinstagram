package net.cursokotlin.jetpackcomposeinstagram.login.ui.data

import net.cursokotlin.jetpackcomposeinstagram.login.ui.data.network.response.LoginService

class LoginRepository {

   private val api = LoginService()

    suspend fun doLogin(user:String, password:String): Boolean {
       return api.doLogin(user,password)
    }


}