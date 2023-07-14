package br.com.kumabe.helloworld.models

import java.time.LocalDate

open class Pessoa(     val codigo: Long,
                       val nome: String,
                       val email: String,
                       val dataCadastro: LocalDate
)