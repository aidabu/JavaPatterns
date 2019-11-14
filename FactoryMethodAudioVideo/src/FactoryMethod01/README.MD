Factory Method
  Podemos utilizar este patrón cuando definamos una clase a partir de la que se crearán objetos pero sin saber de qué tipo son, siendo otras subclases las encargadas de decidirlo.


Explicacion:
  Creamos dos clases de tipo IArchivo así como la clase abstracta en la que se define el método de fabricación, y otra que hereda de ella y lo implementa.
  
  En el programa principal se crea una instancia de la clase que implementa el método de fabricación, el cual usaremos para crear y devolver los distintos tipos de objetos.