Visitor
  Según el libro de GoF este patrón permite añadir funcionalidades a una clase sin tener que modificarla, siendo usado para manejar algoritmos, relaciones y responsabilidades entre objetos.

  Así pues, nos resultará útil cuando necesitemos realizar operaciones distintas y no relacionadas sobre una estructura de objetos, aunque si lo utilizamos y luego tenemos que modificar alguna de las clases implicadas, hemos de tener en cuenta que se produce cierto nivel de acoplamiento entre ellas.

  Veamos un ejemplo en el que simulando un juego equipamos con un arma a personajes de tipo Guerrero y con otra diferente a los que son de tipo Mago.


Explicacion:
  Al inicio del programa creamos una lista y la rellenamos con objetos de tipo IPersonaje.

  A continuación pasamos dicha lista al método visit() del objeto de tipo IVisitor, en el cual la recorreremos llamando al método accept() de cada objeto de tipo IPersonaje encontrado.
  
  Observa que el método aceptar() en los objetos de tipo IPersonaje no hace otra cosa que redirigir hacia el método visit() de los objetos de tipo IVisitor, en el cual se realizan las operaciones necesarias sobre el elemento del que se trate en cada caso.