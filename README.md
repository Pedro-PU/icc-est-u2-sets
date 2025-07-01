
# Práctica Listas Enlanzadas

## 📌 Información General

- **Título:** Práctica Sets
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Pedro Pesántez
- **Fecha:** 01/07/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

- Se crea una clase llamada `Sets` que implementa diferentes tipos de colecciones `Set` en Java: `HashSet`, `LinkedHashSet` y `TreeSet`. Cada implementación muestra cómo estas estructuras manejan la unicidad y el orden de los elementos.

- La clase incluye métodos para construir y retornar cada tipo de `Set`, utilizando palabras duplicadas para observar sus comportamientos:
  - `HashSet`: no garantiza ningún orden de los elementos.
  - `LinkedHashSet`: mantiene el orden de inserción de los elementos.
  - `TreeSet`: ordena los elementos alfabéticamente.
  - `TreeSet` con `Comparator`: ordena las palabras por longitud, y en caso de empate, por orden alfabético (ascendente o descendente según el método).

- Se diseña una clase `App` que actúa como punto de entrada del programa, invocando cada uno de los métodos anteriores y mostrando los resultados por consola, permitiendo observar y comparar fácilmente el comportamiento de cada tipo de `Set`.


## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
--- HashSet ---
Elementos del HashSet (no se garantniza orden)
[Laptop, Pera, Celular, Manzana]
--- LinkedHashSet ---
Elementos del LinkedHashSet (respeta orden de insercion)
[Laptop, Manzana, Pera, Celular]
--- TreeSet ---
Elementos del TreeSet (orden alfabeticamente - in order -)
[Celular, Laptop, Manzana, Pera]
--- Comparator TreeSet ---
Elementos del TreeSet (orden por tamaño)
[Pera, Laptop, Celular, Celulas, Manzana]
--- Comparator TreeSet ---
Elementos del TreeSet (orden por tamaño descendente)
[Manzana, Celulas, Celular, Laptop, Pera]
```

---
![image](https://github.com/user-attachments/assets/ada768c6-2fe8-4a5c-94f8-0707393dc728)

