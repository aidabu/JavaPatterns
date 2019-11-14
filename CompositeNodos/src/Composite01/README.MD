Composite
  Este útil patrón permite crear y manejar estructuras de objetos en forma de árbol, en las que un objeto puede contener a otro(s).
  
  En este punto cabe aclarar que las estructuras de este tipo se componen de nodos (un objeto que a su vez contiene otros objetos) y Hojas (objetos que no contienen otros), y que ambos comparten una misma Interface que define métodos que deben implementar.


Explicacion:
  Los archivos son hojas (no contienen otros elementos) y las carpetas serían nodos (pueden contener archivos así como otras carpetas).
  
  Las clases Archivo y Carpeta heredan de la clase abstracta Nodo, que implementa los métodos comunes y define el método mostrar() que deberán implementar.
 
  Dicho método en la clase Archivo abre el archivo para mostrar su contenido, y en la clase Carpeta muestra su contenido de forma recursiva (si contiene otras carpetas mostrará también lo que contienen).

  Al ejecutar el programa se crea una carpeta principal y se le agregarán objetos de tipo Archivo así como otra subcarpeta que creamos posteriormente, y después mostramos su contenido.

  A continuación eliminamos la subcarpeta y volvemos a mostrar el contenido de la principal