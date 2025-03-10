## Componentes principales del ejercicio

* **Enumeraciones:**   
  * TipoServicio, TipoNotificacion
* **Interfaces**:
  * ServicioNotificacion (define los métodos que deben implementar los servicios de envío)
* **Clases base (superclases):**
  * Notificacion (clase base para los diferentes tipos de notificaciones con atributos comunes)
* **Subclases:**
  * NotificaciónUrgente, Informativa y Promocional
  * Usuario, Administrador y Cliente
* **Clase**

* **Manejador o gestor central:**
  *   GestorNotificaciones (coordina el envío de notificaciones y mantiene estadísticas)