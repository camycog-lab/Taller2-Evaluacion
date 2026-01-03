\# Proyecto de Automatización de Pruebas (CI/CD)



Este proyecto implementa un flujo de Integración Continua (CI) para una calculadora básica, incluyendo pruebas unitarias, BDD y de performance.



\## 1. Estructura del Proyecto

\- \*\*src/main/java\*\*: Código fuente de la aplicación (Calculadora).

\- \*\*src/test/java\*\*: Pruebas Unitarias (JUnit 5) y Step Definitions (Cucumber).

\- \*\*src/test/resources\*\*: Archivos .feature (Gherkin) para BDD.



\## 2. Tecnologías

\- Java 17

\- Maven 3.9

\- JUnit 5

\- Cucumber (BDD)

\- PowerShell (Script de Performance)



\## 3. Ejecución de Pruebas

Para ejecutar la suite completa de pruebas (Unitarias + BDD), utiliza el comando:

mvn test



\## 4. Pipeline de CI

El proyecto está configurado con GitHub Actions/Jenkins para ejecutar automáticamente:

1\. Compilación del código.

2\. Ejecución de pruebas unitarias.

3\. Generación de reportes de prueba.



\## 5. Performance

Se incluye un script `performance\_test.ps1` que mide la latencia de respuesta ante peticiones HTTP simuladas.

