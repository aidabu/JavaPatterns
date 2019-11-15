State
  Este patrón resulta útil cuando necesitamos que un objeto se comporte de forma diferente dependiendo del estado interno en el que se encuentre en cada momento.

  Según el siguiente diagrama en UML podemos apreciar que el objeto cuyo estado es susceptible de cambiar (Contexto) contendrá una referencia a otro objeto que define los distintos tipos de estado en que se puede encontrar.


Explicacion:
  Al inicio del programa se crea un objeto de tipo Semaforo (que al ser instanciado quedará por defecto en EstadoVerde) y mostramos el aviso visual correspondiente. Posteriormente cambiamos otras dos veces su estado.
  
  De este modo se mostrará un aviso u otro dependiendo dependiendo del estado de Semaforo en un momento dado.
  
  Observa que en la propiedad estado_actual de Semaforo queda registrado el estado del mismo en todo momento.