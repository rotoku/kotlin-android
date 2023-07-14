# Hello World Android with Kotlin

## OOP
> OOP
```
```
## Herança
> Herança
```Pessoa.kt
package br.com.kumabe.helloworld.models

import java.time.LocalDate

open class Pessoa(     val codigo: Long,
                       val nome: String,
                       val email: String,
                       val dataCadastro: LocalDate
)

```

```PessoaFisica.kt
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

```

## Polimorfismo
> OOP
```
```
## Interface
> Interface
```
package br.com.kumabe.helloworld.services

import br.com.kumabe.helloworld.models.Contato

interface ContatoService {
    fun create(contato:Contato)

    fun retrieve(codigo:Long): Contato

    fun update(codigo:Long, contato:Contato)

    fun delete(codigo:Long)

    fun list(): Array<Contato>
}
```
## Pacotes
> Pacotes
```
package br.com.kumabe.helloworld.models

import java.time.LocalDate

data class Contato(
    val codigo : Long,
    val nome : String,
    val email : String,
    val dataNascimento : LocalDate,
)
```
## Composição
> Composição
```
```

## Ciclo de vida das activity
- onCreate
- onCreateOptionsMenu
- onOptionsItemSelected
- onSupportNavigateUp