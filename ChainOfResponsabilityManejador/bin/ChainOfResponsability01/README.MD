Chain of Responsability
  Este patrón puede resultarnos útil en casos en los que un objeto emisor de una petición desconozca qué objeto(s) podrá(n) atender a la misma.


Explicacion:
  En la clase abstracta Manejador definimos el método comprobar() que deberán implementar las clases a partir de las cuales crearemos los objetos de dicho tipo.

  En dicho método se realizará la comprobación necesaria en cada caso para verificar si el objeto actual debe procesar la petición. En caso contrario, se pasará la misma al siguiente objeto de la cadena.

  En dicha clase definimos también los métodos 'set' y 'get' para establecer y obtener el siguiente objeto al que el actual deberá pasar la petición que ha recibido.
  
  En el programa principal se crean los objetos que formarán parte de la cadena de responsabilidad, utilizando el método setSiguiente() para indicar a cada uno de ellos cuál es el siguiente en la misma.