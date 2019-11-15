Visitor
  En los ejemplos anteriores hemos omitido la creación de una clase de tipo ObjetoEstructura para facilitar la comprensión de cómo funciona este patrón de diseño. Veamos ahora un ejemplo en el que sí la implementamos.

  En el siguiente programa tenemos una clase GrupoFacturas (de tipo ObjetoEstructura) en el que se guardan referencias a objetos Factura (que a su vez contienen otros de tipo Articulo). Al ejecutarlo se mostrarán las facturas que se hayan agregado junto con los artículos que contienen.


Explicacion:
  Al principio del programa creamos dos objetos de tipo Factura agregándoles los de tipo Articulo (de tipo IElemento ambos).

  A continuación creamos un objeto GrupoFacturas (de tipo ObjetoEstructura) y le agregamos cada objeto de tipo Factura creado.

  Observa que la clase GrupoFacturas implementa la interface IElemento, al igual que Factura y Articulo.

  Después se pasa el objeto de tipo Mostrar como parámetro al método accept() de GrupoFacturas, en el cual se recorrerán todas las facturas para enviar dicho objeto a cada una de ellas.

  En el método accept() de cada Factura se llama a su vez al método visit() de Mostrar (el VisitorConcreto) enviándole como parámetro el propio objeto Factura, y posteriormente cada uno de los objeto Articulo que contiene.

  En dicho método se mostrará el código de la factura por un lado, y la información de los artículos (nombre y unidades) por otro.