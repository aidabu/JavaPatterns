Flyweight
  Este patrón resulta tremendamente útil para evitar crear un gran número de objetos similares, mejorando con ello el rendimiento de la aplicación.

  No se trata de crear muchos objetos de forma dinámica, sino de crear sólo un objeto intermedio para cada entidad concreta.


Explicacion:
  La clase FabricaDeLineas guardará referencias a objetos ILineaLigera (los cuales son creados una sola vez por cada tipo de línea).
  
  Así según el ejemplo, cuando se desea dibujar una línea de color azul se crea un objeto ILineaLigera, pero cuando se quiere crear otra similar se accede al objeto ya almacenado en la lista (observa que para ello hace uso del patrón Singleton).

  De este modo si por ejemplo se desean crear mil líneas... no es necesario crear un objeto para cada una de ellas.