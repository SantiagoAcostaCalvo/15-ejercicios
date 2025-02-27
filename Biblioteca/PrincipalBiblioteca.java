package Biblioteca;

public class PrincipalBiblioteca {
    public static void main(String[] args) {
        PrestamoLibro prestamoLibro = new PrestamoLibro("Cien años de soledad", "Gabriel García Márquez", "María González", "10/02/2025");
        System.out.println(prestamoLibro.mostrarMensaje());

        PrestamoDigital prestamoDigital = new PrestamoDigital("1984", "George Orwell", "Carlos Pérez", "15/03/2025", "PDF");
        System.out.println(prestamoDigital.mostrarMensaje());
    }
}
