package Ejemplos;

import java.util.Scanner;

public class EncuentaSatisfaccionScanner {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("¿Cómo calificaría nuestro servicio? (1-5)");
        int calificacion = S.nextInt();
        S.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Déjenos un comentario:");
        String comentario = S.nextLine();

        System.out.println("\nGracias por su opinión!");
        System.out.println("Calificación: " + calificacion);
        System.out.println("Comentario: " + comentario);

        S.close();
    }
}