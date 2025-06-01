Una de gatos y ratones

Una casa esta formada por plantas y habitaciones. La casa se representa por una matriz de caracteres. Cada fila de la matriz es una planta y cada habitación es una  celda  de dicha planta. Las habitaciones de representan con una 'X' excepto las habitaciones que contienen un gato que rodea a una rata que se representan por 'G' y la habitación que contienen una  rata que se representa por 'R'.  Sólo hay una rata en la casa y se entiende que un gato rodea a una rata si está en una habitación adyacente a la rata.  Las habitaciones están llenas de agujeros y la Rata pasa de una a otra así que los gatos de la casa deciden rodearla esperando taimadamente en las habitaciones adyacentes. Dependiendo de la ubicación de la rata pueden entrar en juego hasta 8 gatos para rodearla.

La casa más pequeña posible  consta de una única planta y una única habitación. Si la casa fuera de una única planta y una única habitación se considera automáticamente rodeada la rata, no son necesarios gatos.

Entrada: Una serie de casos. Cada caso es una única linea que contiene cuatro enteros que indican el número de plantas, número de habitaciones por planta y la planta y habitación donde se encuentra la rata.  Las plantas y habitaciones comienzan a numerarse desde 1.

Salida: para cada caso,  plano de la casa en la que se observa como los gatos rodean a la rata en las celdas adyacentes. Ten encuenta que puede haber hasta 8 celdas adyacentes y que solo se representan los gatos que están en las habitaciones adyacentes. Cada plano se separa del siguiente por una línea en blanco.  Cada habitación se imprime entre []


Entrada
4 5 4 5
4 5 1 1
3 3 2 2

Resultado
[X][X][X][X][X]
[X][X][X][X][X]
[X][X][X][G][G]
[X][X][X][G][R]

[R][G][X][X][X]
[G][G][X][X][X]
[X][X][X][X][X]
[X][X][X][X][X]

[G][G][G]
[G][R][G]
[G][G][G]

__________________________________________________________________________________________________________

Sombras en el camping
https://www.aceptaelreto.com/problem/statement.php?id=207

Se acerca el verano y los aficionados a la naturaleza pasarán buena parte de él en campings, disfrutando del aire libre.

Un requisito imprescindible en los meses de calor es colocar la tienda de campaña bajo la sombra de un buen árbol para poder pasar frescos las horas de siesta. Pero, dependiendo de la zona, eso no siempre es fácil. En los campings nuevos, el número de árboles es escaso, y también lo es por tanto el número de parcelas aptas para tiendas.





Figura 1: primer ejemplo de entrada destacando las zonas de sombra


Sabiendo que cada árbol proporciona sombra a las ocho parcelas adyacentes, ¿cuántas tiendas de campaña disfrutarán de sombra en un camping?

Entrada

El programa deberá procesar múltiples casos de prueba recibidos por la entrada estándar. Cada uno representa un camping formado por una cuadrícula de parcelas de igual tamaño en los que puede haber hueco para una tienda, o un árbol.

Cada caso de prueba comienza con dos números 1 ≤ c, f ≤ 50, indicando el número de columnas y de filas de la cuadrícula de parcelas. A continuación se indica el número a de árboles del camping.

Si hay árboles, en la siguiente línea aparece la posición de todos ellos, indicando para cada uno la columna (1…c) y la fila (1…f) que ocupan. En total, aparecerán 2×a números.

La entrada termina con una línea con tres ceros (camping con dimensiones nulas y sin árboles), que no debe procesarse.

Salida

Por cada caso de prueba el programa indicará, en una línea, el número de parcelas que disfrutarán de sombra.

Por ejemplo:

Entrada
7 7 8
7 2 3 3 4 3 4 4 3 5 4 5 1 7 2 7
0 0 0

Resultado
22
