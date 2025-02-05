package Ejemplos;

import java.util.Scanner;

public class RegistroProductosScanner {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String producto = S.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = S.nextDouble();

        System.out.print("Ingrese la cantidad en stock: ");
        int cantidad = S.nextInt();

        System.out.println("\nProducto registrado:");
        System.out.println("Producto: " + producto);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidad);

        S.close();
    }
}