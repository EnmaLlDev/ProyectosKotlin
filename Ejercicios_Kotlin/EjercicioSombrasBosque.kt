package Ejercicios_Kotlin

fun main() {
    generateSequence { readln().split(" ").map { it.toInt() } }
        .takeWhile { it != listOf(0, 0, 0) }
        .forEach { (c, f, a) ->
            val posiciones = if (a > 0) readln().split(" ").map { it.toInt() } else emptyList()

            val arboles = posiciones.chunked(2).map { (col, fila) -> col - 1 to fila - 1 }

            val sombra = arboles
                .flatMap { (col, fila) ->
                    (-1..1).flatMap { dc ->
                        (-1..1)
                            .filter { dr -> !(dc == 0 && dr == 0) }
                            .map { dr -> (col + dc) to (fila + dr) }
                    }
                }
                .filter { (col, fila) -> col in 0 until c && fila in 0 until f }
                .filter { pos -> pos !in arboles }
                .distinct()
                .count()
            println(sombra)
        }
}