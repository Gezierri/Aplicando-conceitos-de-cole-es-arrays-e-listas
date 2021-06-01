fun main() {
    val joao = Funcionario("Joao", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 1400.0, "PJ")
    val maria = Funcionario("Maria", 1700.0, "CLT")

    val todos = setOf(joao, maria, pedro)
    val funcionario1 = setOf(joao, maria)
    val funcionario2 = setOf(pedro)

    println("==============================")
    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("==============================")
    val resultSubtract = funcionario1.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    println("==============================")
    val resultInterset = todos.intersect(funcionario2)
    resultInterset.forEach { println(it) }
}