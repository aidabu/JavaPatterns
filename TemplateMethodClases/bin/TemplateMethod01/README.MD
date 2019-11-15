Template Method
  Este sencillo patrón resulta útil en casos en los que podamos implementar en una clase abstracta el código común que será usado por las clases que heredan de ella, permitiéndoles que implementen el comportamiento que varía mediante la reescritura (total o parcial) de determinados métodos.

  La diferencia con la forma común herencia y sobreescritura de los métodos abstractos estriba en que la clase abstracta contiene un método denominado 'plantilla' que hace llamadas a los que han de ser implementados por las clases que hereden de ella.


Explicacion:
  En ClaseAbstracta se define el método plantilla obtener(), desde el que se llama a dos métodos definidos como abstractos (que serán implementados por las subclases).
  
  En ClaseConcreta1 se implementan dichos métodos de forma que uno de ellos devuelve el número entero recibido como parámetro multiplicado por 100, y otro agregándole 10.

  En ClaseConcreta2 se implementan de modo que lo devuelven multiplicado por 1000 y agregándole 100, respectivamente.