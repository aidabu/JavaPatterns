Observer
  En este último ejemplo, cuando se produce un cambio en el observado éste envía una notificación a los observadores (que en este caso al ser instanciados guardan una referencia a él) los cuales se encargarán de consultarle directamente para averiguar la modificación producida.


Explicacion:
  Se crea el objeto que será observado junto con tres observadores del anterior, a los que les pasa como parámetro una referencia de dicho objeto.
  
  Se modifica un valor del objeto observado.
  
  Cuando se produce un cambio en el objeto observado (se asigna un nuevo valor al atributo numero), en el mismo método setNumero() se llama al método notificarObservadores() implementado en la clase abstracta de la que hereda (la cual a su vez llama al método observadoActualizado() que implementan los objetos observadores, en el que cada uno de ellos se encargará de consultar al observado para comprobar los cambios producidos).


Para usar este patrón en Java podemos utilizar la clase abstracta Observable y la interface Observer que se encuentran ya implementadas.
El patrón de diseño Observer es parecido al patrón Mediator, si bien en él una clase central encapsula y dirige la comunicación generada entre los demás objetos.