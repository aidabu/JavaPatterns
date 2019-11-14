Proxy
  Este patrón se basa en proporcionar un objeto que haga de intermediario (proxy) de otro, para controlar el acceso a él.

  Existen diferentes tipos de proxy:

    Proxy remoto: proporciona un representante local de un objeto situado en otro espacios de direcciones (en otro dispositivo conectado en red).
    Proxy virtual: usados para crear objetos costosos sólo cuando se soliciten.
    Proxy de protección: permiten controlar el acceso a un objeto cuando es accesible o no, dependiendo de determinados permisos.
    Referencia inteligente: un sustito de un puntero, que realiza operaciones adicionales en el momento de accederse al objeto.


Explicacion:
  Al inicio del programa cargamos un Documento y transcurridos unos segundos simulamos que el usuario hace scroll en el mismo.
  
  La clase Documento guarda una referencia a ImageProxy, instanciándose al cargar el documento con el nombre de la imagen que corresponda.
  
  La clase ImagenProxy guarda una referencia de ImagenReal, devolviendo ésta cuando lo solicite el documento.


Para usar este patrón en lenguaje Java podemos utilizar la interface InvocationHandler.