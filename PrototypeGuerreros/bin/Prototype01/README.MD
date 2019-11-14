Prototype
  Este patrón nos será útil si necesitamos crear y manipular copias de otros objetos:
  
  Cuando nos disponemos a clonar un objeto es importante tener en cuenta si guarda referencias de otros o no. En este punto hay que distinguir las siguientes formas de replicarlos:

    Copia superficial: el objeto clonado tendrá los mismos valores que el original, guardando también referencias a otros objetos que contenga (por lo que si son modificados desde el objeto original o desde alguno de sus clones el cambio afectará a todos ellos).
    
    Copia profunda: el objeto clonado tendrá los mismos valores que el original así como copias de los objetos que contenga el original (por lo que si son modificados por cualquiera de ellos, el resto no se verán afectados).

Explicacion:
  Al inicio del programa se crea una instancia de la clase GestorPrototype que a su vez se encargará de crear dos personajes de tipo Prototype (un Hechicero y un Guerrero), asignando un nombre y equipando con un arma a cada uno de ellos, guardando también referencias a ellos.

  La clase abstracta Enemigo implementa métodos comunes y define el método clonar() que deberan implementar las clases que hereden de ella (los personajes) para crear réplicas de sí mismos.

  Comprueba que al modificarse las propiedades (nombre y arma) de un clon el objeto original no se ve afectado (y viceversa).
  

Ya que estamos utilizando el lenguaje Java en los ejemplos sería más correcto hacer uso de la interface Cloneable y utilizar el método clone() para crear las réplicas (mediante copia superficial).