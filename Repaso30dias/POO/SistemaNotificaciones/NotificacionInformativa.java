package POO.SistemaNotificaciones;

public class NotificacionInformativa extends Notificacion {
    public NotificacionInformativa(String titulo, String mensaje) {
        super(titulo, mensaje, TipoNotificacion.INFORMATIVA);
    }
}
