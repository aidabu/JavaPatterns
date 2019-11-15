Command
  Este patrón resulta útil en escenarios en los que se han de enviar peticiones a otros objetos sin saber qué operación se ha de realizar, y ni tan siquiera quién es el receptor de dicha petición.

  Dicho de otro modo: tenemos varios objetos que realizan acciones similares de forma diferente, y queremos que se procese la adecuada dependiendo del objeto solicitado.

  El Invocador no sabe quién es el Receptor ni la acción que se realizará, tan sólo invoca un Comando que ejecuta la acción adecuada.


Explicacion:
  Al inicio del programa creamos una instancia de la clase Menu (Invocador en el diagrama) junto con otra de Receptor, y después tres elementos de menú (que implementan IMenuItem) a los cuales pasamos la referencia del Receptor.
  
  A continuación agregamos las opciones al Menu (en el cual quedarán registradas para su posterior acceso).
  
  Finalmente ejecutamos cada una de las opciones del menú.