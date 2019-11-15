Visitor
  Veamos a continuación otro ejemplo algo más completo, en el que creamos un nueva clase de tipo IVisitor llamada EquiparConjuro que se encargará de conceder conjuros únicamente a los elementos de tipo Mago.


Explicacion:
  En este caso deseamos que los objetos Guerrero puedan ser equipados con armas pero no con conjuros, los cuales sólo podrán equipados por objetos Mago.

  Para ello definimos una condición en el método accept() de la clase Guerrero de modo que sólo admita objetos que sean específicamente de la clase EquiparArma, llamando luego a su método visit().

  Por otro lado, el método visit() de la clase EquiparConjuro se utiliza para equipar con un conjuro diferente a los objetos de tipo Mago dependiendo de su nivel de magia.