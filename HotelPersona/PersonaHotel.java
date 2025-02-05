package HotelPersona;

public class PersonaHotel {
    private String nombre;
    private int diasReserva;

    public PersonaHotel(String nombre, int diasReserva) {
        this.nombre = nombre;
        this.diasReserva = diasReserva;
    }

    public String getInfo() {
        return "Huésped: " + nombre + " | Días de reserva: " + diasReserva;
    }
}
