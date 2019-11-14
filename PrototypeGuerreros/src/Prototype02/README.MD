Prototype
  Ya que estamos utilizando el lenguaje Java en los ejemplos sería más correcto hacer uso de la interface Cloneable y utilizar el método clone() para crear las réplicas (mediante copia superficial).
  

Explicacion:
  En este caso hemos eliminado el método clonar() de las clases Guerrero y Hechicero y lo hemos implementado en Enemigo (la clase abstracta de la que heredan), agregándole también la interface Cloneable.
  
  Definimos el método clonar() de la clase abstracta Enemigo con 'throws CloneNotSupportedException' para que devuelva también la Excepción CloneNotSupportedException arrojada por el método clone() (se producirá error si se intenta replicar con dicho método un objeto de una clase que no tenga implementada la interface Cloneable).
  
  En el método getClon() de GestorPrototype se solicita (dentro de un bloque 'try...catch' para capturar la excepción) un clon de un determinado objeto.

  
No es necesario implementar ningún método adicional al utilizar la interface Cloneable. 