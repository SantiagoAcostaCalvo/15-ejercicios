package HotelPersona;

public class PersonaHotel {
    private String nombre;
    private int diasReserva;

    public PersonaHotel(String nombre, int diasReserva) {
        this.nombre = nombre;
        this.diasReserva = diasReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiasReserva() {
        return diasReserva;
    }

    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }

    public String getInfo() {
        return "Huésped: " + nombre + " | Días de reserva: " + diasReserva;
    }
}

class ClienteVIP extends PersonaHotel {
    private String beneficios;

    public ClienteVIP(String nombre, int diasReserva, String beneficios) {
        super(nombre, diasReserva);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Beneficios: " + beneficios;
    }
}
