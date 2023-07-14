package br.com.kumabe.helloworld

import br.com.kumabe.helloworld.models.Contato
import br.com.kumabe.helloworld.models.PessoaFisica
import java.time.LocalDate


class Main {

}


fun main(args: Array<String>){
    val rodrigo = Contato(1L, "Rodrigo Kumabe", "rodrigo.kumabe@gmail.com", LocalDate.of(1985,6,3))
    println("Hello World, " + rodrigo.nome)


    val laura = PessoaFisica(2L, "Laura Kumabe", "laura.kumabe@gmail.com", LocalDate.of(2015,11,12),"12.345.678-9","111.111.111-00")
    println("Hello World, " + laura.nome)
}