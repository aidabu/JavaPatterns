Chain of Responsability
  Otra forma de implementar este patrón es creando un método en la clase abstracta que será utilizado para enviar la petición (en lugar de que lo haga cada ManejadorConcreto, como en el ejemplo anterior).


Explicacion:
  En la clase abstracta Manejador definimos el método procesar() en el que comprobamos si el valor recibido es válido: si lo es lo envía al método que lo procesa, y de lo contrario lo pasa al siguiente objeto en la cadena de responsabilidad (si lo hubiere).