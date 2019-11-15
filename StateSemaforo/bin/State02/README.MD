State
  En este otro ejemplo realizamos una modificación en el anterior de modo que cada objeto de tipo EstadoSemaforo contenga una referencia al objeto que lo utiliza.


Explicacion:
  En este caso a la hora de cambiar el estado de un objeto de tipo Semaforo, a la instancia de estado que le pasamos como parámetro le agregamos una referencia a dicho objeto, quedando registrada en la propiedad objSemaforo de ésta, de forma que en caso necesario pueda acceder a su contenedor.


Este patrón de diseño es parecido al patrón Strategy, en el que se crea un objeto indicando el comportamiento que deberá tener, pero sin la posibilidad de ser modificado posteriormente.