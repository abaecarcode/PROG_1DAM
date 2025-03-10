package POO;

/**
* Ejercicio de Programación Orientada a Objetos en Java:
* Sistema de Notificaciones
*
* INSTRUCCIONES:
* A partir del metodo main proporcionado, identifica e implementa
* todas las clases e interfaces necesarias para que el programa funcione.
*
* Aspectos a considerar:
* - Principios de POO (Herencia, Polimorfismo, Encapsulamiento, Abstracción)
* - Uso correcto de modificadores de acceso
* - Implementación adecuada de interfaces
* - Manejo básico de colecciones
    */

```java



public class SistemaNotificaciones {
public static void main(String[] args) {
// Crear gestor de notificaciones
GestorNotificaciones gestor = new GestorNotificaciones();

        // Crear diferentes tipos de servicios de notificación
        ServicioNotificacion emailService = new ServicioEmail("smtp.empresa.com", 587);
        ServicioNotificacion smsService = new ServicioSMS("API_KEY_123456");
        ServicioNotificacion pushService = new ServicioPush("FirebaseConfig");

        // Registrar servicios en el gestor
        gestor.registrarServicio(emailService);
        gestor.registrarServicio(smsService);
        gestor.registrarServicio(pushService);

        // Crear diferentes tipos de notificaciones
        Notificacion notificacionUrgente = new NotificacionUrgente("¡Alerta de seguridad!",
                "Se ha detectado un acceso no autorizado.");

        Notificacion notificacionInformativa = new NotificacionInformativa("Actualización de sistema",
                "El sistema se actualizará esta noche.");

        Notificacion notificacionPromocional = new NotificacionPromocional("Oferta especial",
                "50% de descuento en productos seleccionados.");

        // Crear destinatarios
        Destinatario usuario1 = new Usuario("Juan Pérez", "juan@ejemplo.com", "+34612345678");
        Destinatario usuario2 = new Administrador("Admin", "admin@empresa.com", "+34687654321");
        Destinatario usuario3 = new Cliente("María López", "maria@ejemplo.com", "+34698765432", "Premium");

        // Enviar notificaciones a través de diferentes servicios
        gestor.enviarNotificacion(notificacionUrgente, usuario1, TipoServicio.TODOS);
        gestor.enviarNotificacion(notificacionInformativa, usuario2, TipoServicio.EMAIL);
        gestor.enviarNotificacion(notificacionPromocional, usuario3, TipoServicio.SMS);

        // Mostrar estadísticas
        gestor.mostrarEstadisticas();

        // Filtrar notificaciones por tipo
        gestor.mostrarHistorial(TipoNotificacion.URGENTE);
    }
}
```