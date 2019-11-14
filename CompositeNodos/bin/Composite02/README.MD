Composite
  Otro ejemplo en el que se recorre cada elemento del árbol y se muestra el nombre del nodo padre de cada uno de ellos.


Explicacion:
  En la clase abstracta Nodo se ha agregado la propiedad nodoPadre y los métodos necesarios para que los objetos de las clases que hereden de ésta guarden una referencia a su nodo padre en el momento de su instanciación.

  El método mostrarPadres() de la clase Carpeta es el encargado de recorrer el árbol para ir mostrando el nombre de cada elemento así como el de su nodo padre.


En en el diagrama UML del libro de GoF todos los métodos de la clase Compuesto se encuentran también en la clase abstracta de la que hereda, pero hemos dejado tan sólo operacion() dado que Hoja en principio no contiene otros hijos.