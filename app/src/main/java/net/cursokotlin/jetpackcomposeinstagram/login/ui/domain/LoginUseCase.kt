package net.cursokotlin.jetpackcomposeinstagram.login.ui.domain

import net.cursokotlin.jetpackcomposeinstagram.login.ui.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user:String, password:String): Boolean {
        return repository.doLogin(user,password)
    }
}