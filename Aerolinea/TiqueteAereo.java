package Aerolinea;

public class TiqueteAereo {
    public String pasajero;
    public String vuelo;
    public String asiento;
    public String destino;

    public String mostrarMensaje() {
        return "Pasajero " + pasajero + " con vuelo " + vuelo +
                " y asiento " + asiento + " hacia " + destino +
                " ha comprado su tiquete exitosamente.";
    }
}
