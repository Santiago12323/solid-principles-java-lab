# SOLID Principles Java Lab

## Información General

Este repositorio corresponde al laboratorio práctico de **Principios SOLID** desarrollado en **Java**, cuyo objetivo es refactorizar código que viola los principios de diseño orientado a objetos y aplicar buenas prácticas de ingeniería de software.

El laboratorio fue realizado utilizando **GitHub Codespaces** como entorno de desarrollo, con **Java 17**, **Maven** y **JUnit 5** para pruebas unitarias.

---

## Datos del Estudiante

- **Nombre:** Santiago Coronado Pinzón  
- **Materia:** ARCN  
- **Docente:** Iván Darío Sánchez Fonseca  
- **Universidad:** Escuela de ingenieros 

---

## Tecnologías Utilizadas

- Java 17  
- Maven  
- JUnit 5  
- GitHub  
- GitHub Codespaces  

---

## Prueba de codeSpace

<img width="1636" height="1033" alt="image" src="https://github.com/user-attachments/assets/43af6dd2-309d-4e7a-8795-953d5de2fff7" />

---


## Objetivo del Laboratorio

Aplicar los **principios SOLID** mediante la refactorización de código que presenta problemas de diseño, logrando un sistema más:

- Mantenible  
- Escalable  
- Flexible  
- Fácil de probar  
- Alineado con buenas prácticas de POO  

---

## Estructura del Proyecto

```text
solid-principles-java-lab/
├── src/
│   ├── main/java/com/example/solid/
│   │   ├── srp/  (Single Responsibility Principle)
│   │   ├── ocp/  (Open/Closed Principle)
│   │   ├── lsp/  (Liskov Substitution Principle)
│   │   ├── isp/  (Interface Segregation Principle)
│   │   ├── dip/  (Dependency Inversion Principle)
│   ├── test/java/com/example/solid/
├── pom.xml
├── README.md
```

## Principios SOLID Aplicados

### 1. Single Responsibility Principle (SRP)

**Una clase debe tener una única responsabilidad.**

- Se separó la lógica de negocio, la impresión y la persistencia en clases independientes.
- Beneficio: cambios aislados y mayor mantenibilidad.

**Patrón relacionado:** Separation of Concerns

---

### 2. Open/Closed Principle (OCP)

**Las entidades deben estar abiertas para extensión pero cerradas para modificación.**

- Se eliminó el uso de condicionales (`if/else`) y se implementó el patrón Strategy.
- Permite agregar nuevos tipos de descuento sin modificar código existente.

**Patrón relacionado:** Strategy

---

### 3. Liskov Substitution Principle (LSP)

**Las clases derivadas deben poder sustituir a sus clases base sin alterar el comportamiento esperado.**

- Se evitó que subclases lancen excepciones inesperadas.
- Se separaron responsabilidades mediante interfaces específicas.
- Resultado: sustitución segura entre implementaciones.

---

### 4. Interface Segregation Principle (ISP)

**Los clientes no deben depender de interfaces que no utilizan.**

- Se dividieron interfaces grandes en interfaces más pequeñas y específicas.
- Ninguna clase implementa métodos que no necesita.
- Beneficio: código más limpio y desacoplado.

---

### 5. Dependency Inversion Principle (DIP)

**Los módulos de alto nivel no deben depender de módulos de bajo nivel, ambos deben depender de abstracciones.**

- Se creó una interfaz `Database` y se inyectó la dependencia.
- Se eliminó el acoplamiento directo a implementaciones concretas.

**Patrón relacionado:** Dependency Injection

---

## Pruebas Unitarias (JUnit 5)

El proyecto incluye **pruebas unitarias** desarrolladas con **JUnit 5**, las cuales permiten validar el correcto funcionamiento del código refactorizado y comprobar que los principios SOLID han sido aplicados correctamente.

Las pruebas se encuentran en la ruta:

```text
src/test/java/com/example/solid/
```
### Pruebas por Principio SOLID

#### Single Responsibility Principle (SRP)

- Se valida que la clase encargada de la lógica de negocio calcule correctamente el total de la factura.
- No se prueban responsabilidades externas como impresión o persistencia, garantizando el cumplimiento del SRP.

---

#### Open/Closed Principle (OCP)

- Se valida que el cálculo de descuentos funcione correctamente para diferentes estrategias.
- Se comprueba que es posible extender el sistema sin modificar el código existente.

---

#### Liskov Substitution Principle (LSP)

- Se valida que las diferentes implementaciones puedan sustituirse sin romper el comportamiento esperado.
- No se presentan excepciones inesperadas al usar clases derivadas.

---

#### Interface Segregation Principle (ISP)

- Se comprueba que las clases solo implementan los métodos que realmente necesitan.
- Se evita la implementación de métodos innecesarios.

---

#### Dependency Inversion Principle (DIP)

- Se valida que el procesamiento de pedidos dependa de una abstracción y no de una implementación concreta.
- Se comprueba la correcta inyección de dependencias.

