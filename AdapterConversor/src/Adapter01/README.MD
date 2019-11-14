Adapter
  Este patrón permite que trabajen juntas clases con interfaces incompatibles.

  Para ello, un objeto adaptador reenvía al otro objeto los datos que recibe (a través de los métodos que implementa, definidos en una clase abstracta o interface) tras manipularlos en caso necesario.
 

Explicacion:
  La clase CajaEuros contiene los métodos necesarios para ingresar y sacar fondos en euros.
  
  Creamos una interface que define los métodos que implementará el objeto de tipo Adaptador, mediante los cuales éste redirigirá la comunicación hacia el objeto que gestiona la caja en euros (realizando previamente la conversión de pesetas a euros).
  
  Al inicio del programa se crea un objeto de tipo Adaptador, realizándose unos ingresos en pesetas y obteniendo luego el saldo en euros.