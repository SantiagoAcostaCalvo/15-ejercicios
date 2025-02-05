package BiliotecaPersona;

public class PrincipalBiblioteca {
    public static void main(String[] args) {
        Persona p = new Persona("María", "González");
        PrestamoLibro prestamoLibro = new PrestamoLibro("Cien años de soledad", "Gabriel García Márquez", p, "10/02/2025");

        System.out.println(prestamoLibro.mostrarMensaje());
    }
}