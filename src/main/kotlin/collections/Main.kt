package collections

fun main() {
    val values = intArrayOf(3, 7, 5, 9, 1)
    val nomes = arrayOf("Maria", "Pedro", "Andre")
    val salarios = doubleArrayOf(1000.0, 2000.0, 550.0)

    for (valor in values) {
        println(valor)
    }

    println("====================================")

    values.forEach {
        println(it)
    }

    println("====================================")

    for (index in values.indices) {
        println(values[index])
    }

    println("====================================")
    values.sort()
    for (valor in values) {
        println(valor)
    }

    println("====================================")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("====================================")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    for (salario in salarios){
        println(salario)
    }

    println("====================================")
    println("Buscar menor salário ${salarios.minOrNull()}")
    println("Buscar maior salário ${salarios.maxOrNull()}")
    println("Buscar média de salário ${String.format("%.2f", salarios.average())}")

    println("====================================")
    val salariosMaiorQue2000 = salarios.filter { it > 2000 }

    salariosMaiorQue2000.forEach {
        println(it)
    }

    println("====================================")
    println(salarios.count { it in 1500.0..2500.0 })

    println("====================================")
    println(salarios.find { it == 2200.00 })

    println("====================================")
    println(salarios.any { it == 605.00 })

}