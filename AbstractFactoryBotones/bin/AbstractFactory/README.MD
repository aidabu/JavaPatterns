Abstract Factory
  Este patrón resulta útil en casos en los que necesitemos crear familias de objetos relacionados o dependientes entre sí, sin especificar sus clases concretas. 


Explicacion:
  En el programa principal creamos instancias de la clase Cliente, que se encarga de obtener los componentes de la familia indicada y dibujarlos.
  
  La interface Componentes (la FabricaAbstracta) define los métodos que deberán tener las clases que la implementen (de tipo FabricaConcreta), mediante los cuales devolverán los componentes solicitados en cada caso.
  
  Asimismo las clases abstractas Boton y Lista (de tipo ProductoAbstracto) aparte de implementar métodos comunes, definen otro método que deberán implementar las clases que hereden de ellas (será en el que aplicaremos las diferencias entre los componentes de ambas familias).