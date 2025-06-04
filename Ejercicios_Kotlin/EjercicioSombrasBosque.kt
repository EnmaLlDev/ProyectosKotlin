package Ejercicios_Kotlin

fun main() {
    var caso= readln()
    while (caso != "0 0 0"){
        val (columnas, filas, arboles)= caso.split(" ").map { it.toInt() }
        val camping= MutableList(filas) { MutableList(columnas) {'X'} }
        var sombra=0
        val posicionArbol= readln().split(" ").map { it.toInt() }
        for (i in 0 until arboles*2 step 2){
            val column= posicionArbol[i] -1
            val fila= posicionArbol[i + 1] -1
            if (camping[fila][column] == 'S') sombra--
            camping[fila][column]='A'
            for (j in fila-1..fila+1){
                for (k in column-1..column+1){
                    if (j in camping.indices && k in camping[j].indices && camping[j][k]=='X'){
                        camping[j][k]='S'
                        sombra++
                    }
                }
            }
        }
        println(sombra)
        caso= readln()
    }
}

/*
fun main() {
    generateSequence { readln().split(" ").map { it.toInt() } }
        .takeWhile { it != listOf(0,0,0) }
        .forEach { (c, f, a) ->
            val posicionArbol = if (a > 0) {
                readln().split(" ").map { it.toInt() }
            } else emptyList()
            val arboles = posicionArbol.chunked(2).map { (col, fila) -> col - 1 to fila - 1 }

            var adyacentes = listOf<Pair<Int, Int>>()
            for ((col, fila) in arboles) {
                val vecinos = mutableListOf<Pair<Int, Int>>()
                for (newColum in -1..1) {
                    for (newFila in -1..1) {
                        if (newColum != 0 || newFila != 0) {
                            vecinos.add(Pair(col + newColum, fila + newFila))
                        }
                    }
                }
                adyacentes = adyacentes + vecinos
            }
            val sombra = adyacentes
                .filter { (col, fila) -> col in 0 until c && fila in 0 until f }
                .filter { pos -> pos !in arboles }
                .distinct()
                .count()
            println(sombra)
        }
}
 */