## Componentes principales del ejercicio

* **Enumeraciones:**   
  * `TipoServicio`, `TipoNotificacion`
* **Interfaces**:
  * `ServicioNotificacion` (define los métodos que deben implementar los servicios de envío)
  * `Destinatario`
* **Clases abstracta (superclase):**
  * `Notificacion` (clase base para los diferentes tipos de notificaciones con atributos comunes)
* **Tipos de noticicaciones:**
  * `NotificaciónUrgente`, `Informativa` y `Promocional`
* **Clase base Destinatarios**
  * Implementa la interfaz `Destinatario` en la clase base `DestinarioBase`
* **Tipos de destinatarios**
  * `Usuario`
  * `Administrador`
  * `Cliente`
* **Clase base para servicios**
  *   `ServicioNotificacionBase` , que implementa la interfaz `ServicioNotificacion` que tiene funcionalidad común
* **Tipos de servicios**
  * `ServicioEmail`
  * `ServicioSMS`
  * `ServicioPush`
* **Gestor central**
  * `GestorNotificaciones` que coordina el envío de notificaciones y mantiene estadísticas