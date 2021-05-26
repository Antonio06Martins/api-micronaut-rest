package com.antonio.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.RequestAttribute

@Controller("/hello")
class HelloController {

    @Get(consumes = [MediaType.TEXT_PLAIN])
    fun hello(): String {
        return "Hello World!"
    }
}