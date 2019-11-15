Mediator
  Otro ejemplo de implementación de este patrón de diseño.


Explicacion:
  En el programa principal creamos el objeto de tipo Mediador y los de tipo Componente que participarán en la misma (observa que en este caso no es necesario crear la interface de IMediador ya que como se indica en el libro de GoF: 'no es necesario cuando los colegas sólo trabajan con un mediador').
  
  En dicha clase centralizadora se implementan diferentes métodos para procesar acciones dependiendo del componente que haya sido modificado en cada caso (el botón sobre el que se haga clic).

  A continuación se simulan clics en los diferentes botones, causando que varíe el contenido mostrado por el componente CuadroTexto.


El patrón de diseño Mediator es parecido al patrón Observer (en el que se define una dependencia de tipo 'uno a muchos' entre objetos de forma que cuando el que es observado cambia lo notifica al resto), sin embargo en el primero una clase central encapsula y dirige la comunicación generada entre los demás objetos.