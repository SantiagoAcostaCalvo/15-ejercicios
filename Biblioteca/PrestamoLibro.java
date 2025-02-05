package Biblioteca;

public class PrestamoLibro {
    public String titulo;
    public String autor;
    public String usuario;
    public String fechaDevolucion;
    public String mostrarMensaje() {
        return "El libro '" + titulo + "' de " + autor +
                " ha sido prestado a " + usuario +
                ". Fecha de devolución: " + fechaDevolucion;
    }
}
