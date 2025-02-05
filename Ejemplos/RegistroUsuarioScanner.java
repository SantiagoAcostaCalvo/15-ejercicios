package Ejemplos;

import java.util.Scanner;

public class RegistroUsuarioScanner {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);  // Creamos el Scanner para leer desde la consola

        System.out.print("Ingrese su nombre: ");
        String nombre = S.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = S.nextInt();
        S.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese su correo: ");
        String correo = S.nextLine();

        System.out.println("\nRegistro exitoso:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);

        S.close(); // Cerramos el Scanner
    }
}
