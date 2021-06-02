package collections

fun main() {
    val joao = Funcionario("Joao", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 1400.0, "PJ")
    val maria = Funcionario("Maria", 1700.0, "CLT")

    val funcionario = listOf(joao, pedro, maria)

    println("=============================")
    funcionario.forEach {
        println(it)
    }

    println("=============================")
    println(funcionario.find { it.nome == "Maria" })

    println("=============================")
    funcionario
        .sortedBy { it.nome }
        .forEach { println(it) }

    println("=============================")
    funcionario
        .groupBy { it.tipo }
        .forEach { println(it) }
}
