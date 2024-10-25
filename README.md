# TPFinal-IndrudccionAJava-3F

**Autor:** Quispe, Gerardo Fabián

___
## Trabajo Final Integrador de Introducción a Java - 3F

### Crear un programa:
La policía de Tres de Febrero necesita un sistema para administrar las armas de sus
policías.

#### Requerimientos:
* Un arma sólo puede corresponder a un polícia y los datos que se necesitan del
  polícia son: el nombre, el apellido y su legajo.
* Utilizar un constructor que permita asignar todos los atributos al momento de
  necesitar crear un objeto.
* Las armas además de tener asociado a un polícia, poseen **la cantidad de
  municiones que puede soportar, alcance aproximado en metros, marca, calibre y
  el estado (“NUEVA”, “EN MANTENIMIENTO”, “EN USO”).**
* Existen dos variantes de armas: armas cortas y largas.
* Ambas tienen todas las características que nombramos anteriormente pero
  también cada una tiene características particulares.
* En las **armas cortas** es importante saber **si es o no automática**.
* Mientras que en las **armas largas** es importante saber si tiene el sello del
  **RENAR**, una **descripción justificando su uso** y **el nivel del arma** siendo los
  posibles del **1 al 5**.

#### El sistema debe contar con las siguientes *funcionalidades*:
* De cualquier arma se debe poder saber si está en condiciones para poder
  ser usada por un policía en un enfrentamiento. Para que pueda estar en
  condiciones debe estar en estado “EN USO” y ser un calibre >=9.
* En el caso de las armas largas debe ser posible compararlas. Un arma
  larga es mayor a otra si tiene mayor nivel.
* Es importante contar con alguna funcionalidad en las armas cortas para
  saber si se las puede disparar a más de 200m.

