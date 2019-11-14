Singleton
  Utilizaremos el patrón Singleton cuando por alguna razón necesitemos que exista sólo una instancia (un objeto) de una determinada Clase.

  Dicha clase se creará de forma que tenga una propiedad estática y un constructor privado, así como un método público estático que será el encargado de crear la instancia (cuando no exista) y guardar una referencia a la misma en la propiedad estática (devolviendo ésta).
 

Explicacion:
  Cada vez que se procesa el bucle for se realiza una llamada al método getInstancia() de la clase Coche, devolviéndose siempre una misma instancia (un sólo objeto) de dicha clase (que será creada la primera vez que se llame a dicho método).