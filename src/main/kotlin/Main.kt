fun main() {
    println("Bitte gib den eine Zahl (Basis) an")
    var basis = readLine()?.toInt()
    println("Bitte gib eine Zahl (Exponent) an")
    var exponent = readLine()?.toInt()
    if (basis != null) {
        if (exponent != null) {
            println("Das Ergebnis lautet ${potenz(basis.toInt(), exponent.toInt())}")
        }
    }
}

fun potenz(basis: Int, exponent: Int): Int {
    var ergebnis = 1
    for (i in 1..exponent) {
        ergebnis *= basis
    }
    return ergebnis
}