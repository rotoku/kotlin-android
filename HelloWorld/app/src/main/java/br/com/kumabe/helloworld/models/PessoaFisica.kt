package br.com.kumabe.helloworld.models;

import java.time.LocalDate

class PessoaFisica(
    codigo: Long,
    nome: String,
    email: String,
    dataCadastro: LocalDate,
    rg: String,
    cpf: String
) : Pessoa(codigo, nome, email, dataCadastro) {}
