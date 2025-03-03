## Part 1: SharedUnsafe.java

Crea una classe `SharedUnsafe.java` que faci el següent:

* Declara una variable privada `int x` de classe amb valor 0.

El mètode `main`:

* Crea un thread `t1` que llença una instància de la classe `Adder`.
* Crea un thread `t2` que llença una instància de la classe `Adder`.
* Engega els threads.
* Espera que acabin els threads.
* Mostra el resultat de `x`.

La classe `Adder` que estigui dins la classe anterior i, per tant, pugui accedir a `x`, ha de fer:

* Un bucle de 0 a 500.000. Dins el bucle:
    * Incrementa `x` en 1.

Raona el valor de `x`.
