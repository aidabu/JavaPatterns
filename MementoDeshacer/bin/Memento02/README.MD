Memento
  Basándonos en este ejemplo, en la clase Caretaker también podríamos haber definido una lista en la que ir guardando una instancia de Memento por cada modificación que se realizase en el objeto de tipo Originator, para de dicho modo implementar la funcionalidad de restaurar los últimos cambios de uno en uno.

  Ahora veamos un último ejemplo en que utilizamos este patrón para guardar y recuperar marcadores a las páginas de un libro.


Explicacion:
  Al iniciarse el programa se crea tanto una instancia de la clase Libro como otra de GestorMarcadores, que guardará una lista en la que se almacenarán las referencias a los marcadores.

  Cada marcador es creado utilizando el método guardarMarcador() de un objeto Libro, quedando almacenado el número de página en un objeto de tipo Memento, el cual será posteriormente guardado en una lista mediante el método addPosicionMarcador() de GestorMarcador().

  El uso del método irPagina() es méramente ilustrativo, no siendo necesario para el correcto funcionamiento del ejemplo.