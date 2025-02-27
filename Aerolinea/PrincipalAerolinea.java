package Aerolinea;

public class TiqueteAereo {
    private String pasajero;
    private String vuelo;
    private String asiento;
    private String destino;

    // Constructor
    public TiqueteAereo(String pasajero, String vuelo, String asiento, String destino) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.destino = destino;
    }

    // Getters y Setters
    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String mostrarMensaje() {
        return "Pasajero " + pasajero + " con vuelo " + vuelo +
                " y asiento " + asiento + " hacia " + destino +
                " ha comprado su tiquete exitosamente.";
    }
}
