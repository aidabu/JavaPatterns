Builder
  Este patrón puede ser utilizado cuando necesitemos crear objetos complejos compuestos de varias partes independientes.


Explicacion:
  En el programa principal creamos el objeto de tipo Director, así como los de tipo ConcreteBuilder que le iremos pasando a continuación como parámetro a través de su método construir() (con el fin de crear objetos Coche equipados de diferentes formas).
  
  Observa que en dicho método se llama a su vez a los diferentes métodos de la clase BuilderCoche, mediante los que se crea un nuevo objeto de tipo Coche y se componen las diferentes partes del mismo.
  
  Posteriormente se realiza una llamada al método getCoche() del objeto de tipo Director para obtener cada objeto de tipo Coche, y se muestran sus características.