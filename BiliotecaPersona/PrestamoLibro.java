package BiliotecaPersona;

public class PrestamoLibro {
    public String titulo;
    public String autor;
    public Persona usuario;
    public String fechaDevolucion;

    public PrestamoLibro(String titulo, String autor, Persona usuario, String fechaDevolucion) {
        this.titulo = titulo;
        this.autor = autor;
        this.usuario = usuario;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String mostrarMensaje() {
        return "El libro '" + titulo + "' de " + autor +
                " ha sido prestado a " + usuario.getNombreCompleto() +
                ". Fecha de devolución: " + fechaDevolucion;
    }
}
