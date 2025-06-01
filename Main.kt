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

}





