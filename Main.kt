fun main(){
    var caso= readlnOrNull()
    while (caso != null){
       var (planta, habitacion, pRata, hRata)= caso.split(" ").map { it.toInt() }
       var casa = Array(planta){CharArray(habitacion)}
        caso= readlnOrNull()
    }
}



