package com.antonio.controller

import com.antonio.modelo.Curso
import com.antonio.modelo.Topico
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/topicos")
class TopicosController {

    @Get(consumes = [MediaType.TEXT_PLAIN])
    fun lista(): List<Topico> {
        val listaTopico = Topico("Duvida", "Duvida com Micronaut", Curso("Micronaut", "Programação"))
        return arrayListOf(listaTopico, listaTopico, listaTopico)
    }
}