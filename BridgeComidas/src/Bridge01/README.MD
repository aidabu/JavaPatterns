Bridge
  Según el libro de GoF este patrón de diseño permite desacoplar una abstracción de su implementación, de manera que ambas puedan variar de forma independiente.

  Supongamos que tenemos una clase abstracta en la que se define un método que deberá implementar cada clase que herede de ella: ¿cómo haríamos si una clase hija necesitase implementarlo de forma que realizase acciones diferentes dependiendo de determinadas circunstancias?.

  En dichos casos nos resultaría útil el patrón Bridge (puente) ya que 'desacopla una abstracción' (un método abstracto) al permitir indicar (durante la ejecución del programa) a una clase qué 'implementación' del mismo debe utilizar (qué acciones ha de realizar).


Explicacion:
  En el programa principal se crea una instancia de ElaborarAlimento (de tipo AbstraccionRefinada) indicándole la implementación que debe usar, para luego utilizarla a la hora de elaborar el producto.

  A continuación se cambia de implementación y se obtiene otro producto.

  Como puedes observar, la clase abstracta ElaborarAlimento (de tipo Abstraccion) aparte de definir un método que deberán implementar las que hereden de ella contiene una referencia a otra de tipo Implementador.
  
  En dicho método las clases hijas acceden al implementador (que puede ser cambiado en tiempo de ejecución), llamando al método definido en la interface IElaborar.