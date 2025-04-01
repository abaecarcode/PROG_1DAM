package POO.SistemaNotificaciones;

public abstract class Notificacion {
    private String titulo;
    private String mensaje;
    private TipoNotificacion tipo;

    public Notificacion(String titulo, String mensaje, TipoNotificacion tipo) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public TipoNotificacion getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Notificacion{" +
                "titulo='" + titulo + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
