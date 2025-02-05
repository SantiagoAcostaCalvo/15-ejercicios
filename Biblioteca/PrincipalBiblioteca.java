package Biblioteca;

public class PrincipalBiblioteca {
    public static void main(String[] args) {
        PrestamoLibro prestamoLibro = new PrestamoLibro();
        prestamoLibro.titulo = "Cien años de soledad";
        prestamoLibro.autor = "Gabriel García Márquez";
        prestamoLibro.usuario = "María González";
        prestamoLibro.fechaDevolucion = "10/02/2025";
        System.out.println(prestamoLibro.mostrarMensaje());
    }

}
