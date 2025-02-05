package Ejemplos;

import java.util.Scanner;

public class CajeroAutomaticoScanner {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double saldo = 1000.0;  // Saldo inicial

        System.out.println("Saldo actual: $" + saldo);
        System.out.print("Ingrese la cantidad a retirar: ");
        double retiro = S.nextDouble();

        if (retiro > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= retiro;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        }

        S.close();
    }
}