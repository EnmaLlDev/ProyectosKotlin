fun main(){
    var caso= readlnOrNull()!!.split(" ")
    while (caso != null){
        //var (planta, habitacion, pRata, hRata)= caso.split(" ").map { it.toInt() }
        var planta= caso[0].toInt()
        var habitacion=caso[1].toInt()
        var pRata=caso[2].toInt()
        var hRata=caso[3].toInt()
        var casa = Array(planta){CharArray(habitacion)}
        crearCasa(casa)
        rodearRata(casa, pRata - 1, hRata - 1)
        imprimirCasa(casa)
        caso= readlnOrNull()!!.split(" ")
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





