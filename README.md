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

Altres classes d’aquest repositori:

`SharedVolatile`: Versió modificada de SharedUnsafe utilitzant volatile però que No soluciona el problema

## Part 2

Crea una classe `SharedAtomic.java` que:

* tingui el mateix comportament que `SharedUnsafe.java`.
* modifica la variable `x` perquè deixi de ser `int` i passi a ser `AtomicInteger`.
* adapta el codi de la classe `Adder` que sigui necessari.

Raona el valor de `x`.

---

## Part 3 - Homework

Una vegada vista la classe `SharedSync.java` a classe, fes la següent modificació:

1.  Crea una nova classe `Decrementer.java` similar a `Adder.java` però que en comptes de sumar, resti a cada volta de bucle.
2.  Assegurat que està tancada amb `synchronized`.
3.  Revisa / prova si has d’utilitzar el mateix objecte o un altre per sincronitzar-te entre classes.
4.  Afegeix un nou thread a `main()` que cridi aquesta nova classe.

El resultat de `x` hauria de ser 500.000? (500.000 + 500.000 - 500.000).