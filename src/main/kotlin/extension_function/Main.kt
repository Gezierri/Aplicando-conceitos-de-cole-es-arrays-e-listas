package extension_function

import java.math.BigDecimal

fun main() {
    val salarios = arrayOf(
        "2000.0".toBigDecimal(),
        "1500.0".toBigDecimal(),
        "4000.0".toBigDecimal(),
        "2300.0".toBigDecimal()
    )

    println("========================")
    println(salarios.somatorio())

    println("========================")
    println(salarios.media())
}

fun Array<BigDecimal>.somatorio() = this.reduce{
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatorio() / this.size.toBigDecimal()
