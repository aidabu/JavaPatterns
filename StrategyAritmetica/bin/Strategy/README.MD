Strategy
  Podemos hacer uso de este patrón para crear un objeto que pueda comportarse de formas diferentes (lo cual se definirá en el momento de su instanciación o creación).


Explicacion:
  Se crea la interface IAritmetica, en la que definimos el método que deberán contener las clases que la implementen.

  La clase OperacionAritmetica contiene una referencia a un objeto de tipo IAritmetica, para así poder utilizarlo cuando sea necesario.

  Al inicio del programa creamos tres instancias de OperacionAritmetica, indicando el comportamiento que deberá tener cada una de ellas.

  A continuación se realizan las operaciones y se muestra el resultado.


Este patrón de diseño es parecido al patrón State (en el que un objeto puede cambiar su estado interno durante la ejecución del programa pudiendo comportarse de forma diferente entonces), mientras que con Strategy se crean varios objetos de un mismo tipo pero pudiendo tener distintos comportamientos cada uno de ellos.