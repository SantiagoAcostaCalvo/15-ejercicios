package Ejemplos;

import java.util.Scanner;
import java.time.Year;

public class AnoNacimiento {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = S.nextInt();  // Captura la edad como entero

        int anoActual = Year.now().getValue();
        int anoNacimiento = anoActual - edad;

        System.out.println("Su año de nacimiento es: " + anoNacimiento);
        S.close();
    }
}
