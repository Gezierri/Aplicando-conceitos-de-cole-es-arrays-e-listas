package collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipo: String,
) {
    override fun toString(): String {
        return "collections.Funcionario(nome='$nome', salario=$salario, tipo='$tipo')"
    }
}
