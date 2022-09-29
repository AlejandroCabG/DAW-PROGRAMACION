### Ejercicio Tabla de 20 números aleatorios

En primer lugar he definido dos variables **i** y **j** para definir las filas y columnas, respectivamente, junto a un
array de 4 filas y 5 posiciones.
Para poder crear las filas he hecho un bucle for que fuera incrementandolos hasta que su valor sea 4, y dentro de este 
bucle for, otro bucle for, para crear las columnas en este caso 5. Una vez hechas las filas y las columnas he pasado a
definir que el **_array[i][j] = (int) (Math.random() * 9) + 0_** de esta manera usando la clase Math.random genera valores 
aleatorios de 0 a 9.
Con estos valores creo hago la suma de las filas por cada fila y columna y lo guardo en sumaFila. 
Una vez ya tengo la suma de las filas, paso a calcular la suma de las columnas y para ello repito el mismo proceso que antes:
defino una variable para sumar las columnas **_sumaCol_** y otra para la suma total de las filas y las columnas **_sumaTotal_**
Vuelvo a hacer un bucle for para las filas y uno para las columnas con la suma de las columnas, y fuera del bulce 
la suma total.
