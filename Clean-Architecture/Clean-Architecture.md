# Codelab ADD + Clean Architecture

## 1. ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?

ADD es un método sistemático para diseñar arquitecturas de software basado en **atributos de calidad** (rendimiento, seguridad, escalabilidad). Su propósito es garantizar que la arquitectura satisfaga requisitos no funcionales críticos desde las primeras etapas del diseño.

## 2. ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?

ADD define **qué** se debe lograr (atributos de calidad), mientras que Clean Architecture establece **cómo** organizar el código para implementarlo. ADD guía las decisiones arquitectónicas y Clean Architecture provee la estructura modular para ejecutarlas.

## 3. ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?
 
1. Identificar requisitos y atributos de calidad.  
2. Seleccionar tácticas arquitectónicas (ej: caching para rendimiento).  
3. Definir módulos e interacciones entre componentes.  
4. Validar y refinar el diseño.  

## 4. ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?

Se identifican mediante:  
- Requisitos del negocio.  
- Necesidades de stakeholders.  
- Restricciones técnicas.  
Son importantes porque determinan **tácticas arquitectónicas** (ej: alta disponibilidad → redundancia de servidores).

## 5. ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?

Porque:  
- los atributos de calidad definidos por ADD mediante capas desacopladas.  
- Facilita cambios tecnológicos sin afectar el dominio (ej: migrar de SQL a NoSQL).  
- Mantiene el foco en los casos de uso del negocio.  

## 6. ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?
 
- **Dominio:** Contiene entidades y reglas de negocio (priorizadas por ADD).  
- **Aplicación:** Implementa casos de uso que satisfacen atributos de calidad.  
- **Infraestructura:** Adapta tecnologías externas (ej: bases de datos) a las necesidades definidas en ADD.  

## 7. ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?

ADD traduce requisitos del negocio (ej: "sistema debe soportar 10K usuarios") en **tácticas concretas** (balanceo de carga, autoescalado), asegurando alineación técnica y estratégica.

## 8. ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?

- **ADD** define cómo garantizar escalabilidad/rendimiento en cada microservicio.  
- **Clean Architecture** evita acoplamiento entre servicios.  
- Ejemplo: Puedes escalar independientemente un módulo de pagos (ADD) sin afectar su lógica interna (Clean Architecture).  

## 9. ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?
 Mediante:  
- Pruebas de carga/rendimiento.  
- Revisiones de arquitectura.  
- Monitoreo continuo (ej: latencia, uptime).  
- Iteraciones para ajustar tácticas (ej: agregar CDN si no se cumple el rendimiento).  

## 10. ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?

- **Herramientas:** Prometheus (monitoreo), JMeter (pruebas de carga), SonarQube (calidad de código).  
- **Metodologías:** ATAM (evaluación de arquitectura), DDD (para alinear dominio y capas).  