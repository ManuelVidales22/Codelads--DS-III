# Codelab Clean Architecture en Microservicios Spring Boot

## 1. Propósito principal de Clean Architecture
**Separar las preocupaciones** del sistema en capas independientes manteniendo:
- La lógica de negocio (dominio) libre de dependencias externas
- Capacidad de evolucionar componentes técnicos sin afectar el core del negocio
- Código más testeable y mantenible

## 2. Beneficios para microservicios Spring Boot
✔ **Independencia tecnológica**  
✔ **Core de negocio estable**  
✔ **Pruebas unitarias más limpias**  
✔ **Onboarding más rápido**  
✔ **Adaptabilidad a cambios**  

## 3. Capas principales y responsabilidades
| Capa            | Responsabilidad Clave                     | Ejemplo Spring Boot         |
|-----------------|------------------------------------------|----------------------------|
| **Dominio**     | Entidades y reglas de negocio puras       | `Producto.java` (con reglas)|
| **Aplicación**  | Casos de uso y orquestación               | `CrearProductoUseCase.java`|
| **Infraestructura**| Implementaciones técnicas              | `ProductoRepositoryJPA.java`|
| **Presentación**| Puntos de entrada (API/Eventos)           | `ProductoController.java`   |

## 4. Razones para desacoplar lógica de negocio

🔹 **Cumple el principio SOLID de inversión de dependencias**  
🔹 **Permite cambiar infraestructura sin modificar dominio**  
🔹 **Facilita testing con mocks/stubs**  
🔹 **Evita contaminación tecnológica en reglas de negocio**  

## 5. Rol de la capa de aplicación
**Funciones clave**:
- Transforma datos entre capas (DTO ↔ Entidad)
- Gestiona transacciones
- Orquesta flujos complejos
- Valida reglas de aplicación (no de negocio)

**Contenido típico**:
```java
// Ejemplo: Aplicación de descuento
public class AplicarDescuentoUseCase {
    public Factura ejecutar(Factura factura, Descuento descuento) {
        // Orquesta dominio e infraestructura
        dominio.validar(factura);
        infraestructura.aplicar(descuento);
        return dominio.recalcular(factura);
    }
}

## 6. Diferencia entre UseCase y Service en Clean Architecture
Un UseCase encapsula una única operación específica de negocio, mientras que un Service tradicional agrupa múltiples operaciones relacionadas. Los UseCases son más granulares y adecuados para proyectos complejos.

## 7. Repositories como interfaces en el dominio
Se recomienda definirlos como interfaces para mantener el dominio puro de implementaciones técnicas, permitir múltiples adaptadores de infraestructura y facilitar el testing mediante mocks.

## 8. Implementación de UseCase en Spring Boot
Se implementa como un servicio Spring (@Service) que recibe sus dependencias por constructor y expone un método "ejecutar". Esto mejora la modularidad, testabilidad y trazabilidad del código.

## 9. Problemas sin Clean Architecture
Pueden surgir alto acoplamiento, dificultad para testear, evolución costosa del sistema, anemia de dominio y mayor deuda técnica al mezclar capas.

## 10. Escalabilidad y mantenibilidad
Clean Architecture facilita la escalabilidad mediante componentes desacoplados y la mantenibilidad mediante cambios localizados, menor deuda técnica y flujos de debugging más predecibles.