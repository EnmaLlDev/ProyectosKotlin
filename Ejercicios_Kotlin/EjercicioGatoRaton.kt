package Ejercicios_Kotlin
/*
fun main(){
    var caso= readlnOrNull()
    while (caso != null){
        var (planta, habitacion, pRata, hRata)= caso.split(" ").map { it.toInt() }
        var casa = Array(planta){CharArray(habitacion)}
        crearCasa(casa)
        rodearRata(casa, pRata - 1, hRata - 1)
        imprimirCasa(casa)
        caso= readlnOrNull()


    }
}

fun crearCasa(casa: Array<CharArray>) {
    for (planta in casa.indices){
        for (hab in casa[planta].indices){
            casa[planta][hab]='X'
        }
    }
}

fun imprimirCasa(casa: Array<CharArray>) {
    for (planta in casa.indices){
        for (hab in casa[planta].indices){
            print("[${casa[planta][hab]}]")
        }
        println()
    }
    println()
}

fun rodearRata(casa: Array<CharArray>, pRata: Int, hRata: Int) {
    casa[pRata][hRata]='R'
    for (planta in pRata-1..pRata+1){
        for (hab in hRata-1..hRata+1){
            if (planta >= 0 && planta < casa.size){
                if (hab >= 0 && hab < casa[planta].size){
                    if (casa[planta][hab] != 'R')
                        casa[planta][hab]='G'
                }
            }
        }
    }
}
 */
fun main(){
    generateSequence { readlnOrNull() }
        .takeWhile { it != null }
        .forEach { caso ->
            val (planta, habitaciones, pRata, hRata)=caso.split(" ").map { it.toInt() }
            val casa= crearCasa(planta, habitaciones)
            val casaConRataYGatos= rodearRata(casa, pRata-1, hRata-1)
            imprimirCasa(casaConRataYGatos)
            println()
        }
}

fun imprimirCasa(casa: Array<CharArray>) {
    for (planta in casa){
        for (hab in planta){
            print("[${hab}]")
        }
        println()
    }
}

fun rodearRata(casa: Array<CharArray>, pRata: Int, hRata: Int):Array<CharArray> {
    val nuevaCasa=casa.map { it.copyOf() }.toTypedArray()
    nuevaCasa[pRata][hRata]='R'
    for (planta in -1..1){
        for (hab in -1..1){
            val nuevaPlanta=pRata+planta
            val nuevaHab=hRata+hab
            if (nuevaPlanta in nuevaCasa.indices && nuevaHab in nuevaCasa[0].indices && (planta != 0 || hab != 0)){
                if (nuevaCasa[nuevaPlanta][nuevaHab] != 'R') nuevaCasa[nuevaPlanta][nuevaHab] = 'G'
            }
        }
    }
    return nuevaCasa
}

fun crearCasa(planta: Int, habitaciones: Int): Array<CharArray> =Array(planta){ CharArray(habitaciones) {'X'} }




