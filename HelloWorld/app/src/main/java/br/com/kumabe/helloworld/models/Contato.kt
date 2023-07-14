package br.com.kumabe.helloworld.models

import java.time.LocalDate

data class Contato(
    val codigo : Long,
    val nome : String,
    val email : String,
    val dataNascimento : LocalDate,
)