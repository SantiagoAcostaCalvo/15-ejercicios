package Aerolinea;

public class PrincipalAerolinea {
    public static void main(String[] args) {
        TiqueteAereo tiquete = new TiqueteAereo();
        tiquete.pasajero = "Carlos López";
        tiquete.vuelo = "AV123";
        tiquete.asiento = "14B";
        tiquete.destino = "Miami";
        System.out.println(tiquete.mostrarMensaje());
    }
}
