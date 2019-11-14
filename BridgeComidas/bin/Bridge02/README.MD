Bridge
  Ahora con otro ejemplo en el que simulamos una cadena de elaboración y envasado de alimentos.


Explicacion:
  En este caso existen dos implementaciones comunes (Cocinar y Elaborar) que se utilizarán tanto en ElaborarLasagna como en ElaborarRavioli (el proceso a seguir es diferente en cada caso).

  En este punto te preguntarás: al tratarse de métodos comunes ¿por qué no implementarlos directamente en cada clase?. En este caso ciertamente no es necesario hacerlo de este modo, pero en ciertos casos al dividir así un objeto en dos partes evitamos que se produzcan determinadas jerarquías de clases que al extenderse (agregando una nueva clase, por ejemplo) perderían su lógica y no resultarían mantenibles (al crearse demasiada interdependencia entre ellas).