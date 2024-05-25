# Calculadora TDD
Este repositorio contiene el código para el ejercicio 1 de la actividad grupal de la asignatura de Ingeniería del Software Avanzada. Correspondiente al curso 2023-2024 Grupo 4 de UNIR.

## Descripción de la actividad
El objetivo del proyecto es desarrollar una calculadora empleando la técnica TDD (Test Driven Development).

Para ello, tendremos un ciclo de tres pasos para cada una de las operaciones que permite la calculadora (suma, resta, multiplicación, división y raíz cuadrada por métodos de aproximación):
- Rojo: al crear primero la prueba, no tendremos un código que pueda pasar el test, por tanto el test dará error.
- Verde: una vez desarrollada la prueba, crearemos el código necesario para pasar esa prueba.
- Refactor: refactorizaremos el código, eliminando duplicidades etc. (si es necesario)

## Ejecución de los test
Para lanzar los test, ejecutar el comando:
```
sbt test
```

## Probar la aplicación
Para probar la aplicación, ejecutar el comando:
```
sbt run
```