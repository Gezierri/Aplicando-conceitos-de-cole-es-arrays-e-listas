package mutable_collections

import collections.Funcionario

fun main() {
    val joao = Funcionario("Joao", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 1400.0, "PJ")
    val maria = Funcionario("Maria", 1700.0, "CLT")

    val repository = Repository<Funcionario>()

    repository.create(joao.nome, joao)
    repository.create(pedro.nome, pedro)
    repository.create(maria.nome, maria)

    println("===========================================")
    println(repository.findById(joao.nome))

    println("===========================================")
    var funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {
        println(it)
    }

    println("===========================================")
    funcionarios.add(pedro)
    funcionarios.forEach {
        println(it)
    }

    println("===========================================")
    funcionarios.remove(joao)
    funcionarios.forEach {
        println(it)
    }
}
