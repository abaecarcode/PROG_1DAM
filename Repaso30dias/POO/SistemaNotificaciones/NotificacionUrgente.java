package POO.SistemaNotificaciones;

public class NotificacionUrgente extends Notificacion {

    public NotificacionUrgente(String titulo, String mensaje) {
        super(titulo, mensaje, TipoNotificacion.URGENTE);
    }
}
