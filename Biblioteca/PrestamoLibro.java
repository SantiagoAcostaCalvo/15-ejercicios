package Biblioteca;

public class PrestamoLibro {
    private String titulo;
    private String autor;
    private String usuario;
    private String fechaDevolucion;

    // Constructor
    public PrestamoLibro(String titulo, String autor, String usuario, String fechaDevolucion) {
        this.titulo = titulo;
        this.autor = autor;
        this.usuario = usuario;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String mostrarMensaje() {
        return "El libro '" + titulo + "' de " + autor +
                " ha sido prestado a " + usuario +
                ". Fecha de devolución: " + fechaDevolucion;
    }
}

class PrestamoDigital extends PrestamoLibro {
    private String formato;

    public PrestamoDigital(String titulo, String autor, String usuario, String fechaDevolucion, String formato) {
        super(titulo, autor, usuario, fechaDevolucion);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String mostrarMensaje() {
        return super.mostrarMensaje() + " Formato: " + formato;
    }
}
