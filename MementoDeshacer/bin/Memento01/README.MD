Memento
  Este patrón de diseño es útil cuando manejamos un objeto que necesitaremos restaurar a estados anteriores (como por ejemplo cuando utilizamos la función de deshacer en un procesador de textos).


Explicacion:
  Al inicio del programa creamos un objeto de tipo Originator (que deseamos poder restaurar si se producen cambios) y otro de tipo Caretaker que utilizaremos a su vez para gestionar otro de tipo Memento (en el cual quedará registrado el estado anterior del primero de ellos, y que utilizaremos para restaurarlo).
  
  A continuación se muestran los datos iniciales del objeto de tipo Originator, y tras modificarlos se volverán a restaurar al estado inicial.