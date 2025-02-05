package Ejemplos;

import java.util.Scanner;

public class CalculadoraSumaScanner {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = S.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = S.nextDouble();

        double suma = num1 + num2;
        System.out.println("La suma es: " + suma);

        S.close();
    }
}
