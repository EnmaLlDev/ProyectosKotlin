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
    var caso= readlnOrNull()
    while (caso != null){
        val (planta, habitacion, pRata, hRata)= caso.split(" ").map { it.toInt() }
        val casa= Array(planta){CharArray(habitacion)}
        iniciarCasa(casa)
        rodearRata(casa, pRata -1, hRata -1)
        dibujarCasa(casa)
        caso= readlnOrNull()
    }
}

fun dibujarCasa(casa: Array<CharArray>) {
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
    for (planta in pRata -1..pRata+1){
        for (hab in hRata -1..hRata+1){
            if (planta>=0 && planta<casa.size && hab>=0 && hab<casa[planta].size){
                if (casa[planta][hab] != 'R'){
                    casa[planta][hab]='G'
                }
            }
        }
    }
}

fun iniciarCasa(casa: Array<CharArray>) {
    for (planta in casa.indices){
        for (hab in casa[planta].indices){
            casa[planta][hab]='X'
        }
    }
}


