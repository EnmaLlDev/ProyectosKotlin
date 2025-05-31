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

fun imprimirCasa(casa: Array<CharArray>) {
    TODO("Not yet implemented")
}

fun rodearRata(casa: Array<CharArray>, pRata: Int, hRata: Int) {

}

fun crearCasa(casa: Array<CharArray>) {
    TODO("Not yet implemented")
}



