Observer
  En este otro ejemplo mostramos una forma más recomendable de utilizar este patrón.


Explicacion:
  Al inicio del programa se crea el objeto que será observado así como tres observadores que se agregan a su lista.

  Se modifica por dos veces un valor del objeto observado.

  Cuando se produce un cambio en el observado (se asigna un nuevo valor al atributo nombre), en el mismo método setNombre() se llama al método notificarObservadores() (que a su vez llama al método observadoActualizado() que implementan los objetos observadores) para enviarles una notificación, junto con una referencia a sí mismo observado y el valor modificado.