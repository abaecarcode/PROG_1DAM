package POO.SistemaNotificaciones;

public class NotificacionPromocional extends Notificacion {
    public NotificacionPromocional(String titulo, String mensaje) {
        super(titulo, mensaje, TipoNotificacion.PROMOCIONAL);
    }
}
