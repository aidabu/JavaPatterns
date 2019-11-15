Mediator
  Una de las ventajas que ofrece la programación orientada a objetos (POO) es la posibilidad de reutilizar el código fuente, pero a medida que creamos objetos que se interrelacionan entre sí es menos probable que un objeto pueda funcionar sin la ayuda de otros.

  Para evitar esto podemos utilizar el patrón Mediator, en el que se define una clase que hará de mediadora encapsulando la comunicación entre los objetos, evitándose con ello la necesidad de que lo hagan directamente entre sí.


Explicacion:
  Al inicio del programa creamos el objeto de tipo Mediador encargado de dirigir la comunicación, y los de tipo Colega que participarán en la misma.

  A continuación se provoca un cambio en uno de los objetos de tipo Colega a través del método comunicar() (implementado en la clase abstracta de la que heredan).

  En dicho método se envían los datos (junto con una referencia al objeto modificado) al objeto de tipo Mediador para que a su vez los reenvíe a los demás objetos que participan en la comunicación (observa que no los envía también al objeto que sufrió el cambio).