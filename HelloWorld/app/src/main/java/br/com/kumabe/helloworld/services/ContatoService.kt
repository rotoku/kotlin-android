package br.com.kumabe.helloworld.services

import br.com.kumabe.helloworld.models.Contato

interface ContatoService {
    fun create(contato:Contato)

    fun retrieve(codigo:Long): Contato

    fun update(codigo:Long, contato:Contato)

    fun delete(codigo:Long)

    fun list(): Array<Contato>
}