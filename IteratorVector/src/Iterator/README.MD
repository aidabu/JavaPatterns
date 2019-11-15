Iterator
  Según el libro de GoF, podemos utilizarlo cuando necesitemos recorrer secuencialmente los objetos de un elemento agregado sin exponer su representación interna.

  Así pues, este patrón de diseño nos resultará útil para acceder a los elementos de un array o colección de objetos contenida en otro objeto.


Explicacion:
  Al inicio del programa creamos un objeto de tipo AgregadoConcreto (que contiene el vector que deseamos recorrer) para luego obtener una instancia de IteradorConcreto (en la que se encuentran definidos los métodos que utilizaremos para ello).
  
  A continuación nos situamos en el primer elemento del vector, nos desplazamos dos posiciones más adelante y volvemos al primero para finalmente recorrerlo por completo mientras mostramos los elementos en cada una de sus posiciones.
  
  Observa que cada vez que se llama al método siguiente() de IteradorConcreto devuelve realmente el valor en la posición actual y luego incrementa el índice de la posición actual (las posiciones comienzan desde cero).


En lenguaje Java disponemos también de las interfaces Iterable e Iterator que podemos implementar en nuestras clases en lugar de las anteriormente mencionadas, con lo que sería posible que fueran utilizadas por otras librerías y programas.