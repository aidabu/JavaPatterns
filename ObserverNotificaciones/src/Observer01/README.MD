Observer
  El patrón Observer puede ser utilizado cuando hay objetos que dependen de otro, necesitando ser notificados en caso de que se produzca algún cambio en él.

  Se utilizarán los métodos agregarObservador() y quitarObservador() de la clase abstracta UnObservado para registrar en una lista qué objetos de tipo UnObservador deberán ser notificados o dejar de serlo cuando se produzca algún cambio en él (en tal caso recorrerá dicha lista para enviar una notificación a cada uno de ellos).

  El mensaje será enviado a UnObservador (que implementa la interface IObservador) utilizando su método observadoActualizado().

  Veamos a continuación un ejemplo sencillo en lenguaje Java en el cual cuando se produce un cambio en el observado éste envía una notificación a los observadores, que simplemente mostrarán un mensaje al recibirla.


Explicacion:
  Al inicio del programa se crea el objeto que será observado así como tres objetos observadores del anterior, que se agregan a la lista del observado.
  
  Cuando se produce un cambio en el observado (cuando se le agrega un nuevo observador) éste envía una notificación a los observadores (sin pasar ningún tipo de parámetro en este ejemplo).