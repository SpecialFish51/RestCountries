package com.example.restcountries.app.data.api

sealed class NetworkResult<T>(
    val data: T? = null,
    val message: String? = null
) {

    class Success<T>(data: T) : NetworkResult<T>(data)

    class Error<T>(message: String, data: T? = null) : NetworkResult<T>(data, message)

    class Loading<T> : NetworkResult<T>()

    class Empty<T> : NetworkResult<T>()

    class NotFound<T>(message: String?) : NetworkResult<T>(message = message)
}