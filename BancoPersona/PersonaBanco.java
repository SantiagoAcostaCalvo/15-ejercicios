package BancoPersona;

public class PersonaBanco {
    private String nombre;
    private String identificacion;

    public PersonaBanco(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getInfo() {
        return "Cliente: " + nombre + " | ID: " + identificacion;
    }
}

class ClienteBanco extends PersonaBanco {
    private double saldo;

    public ClienteBanco(String nombre, String identificacion, double saldo) {
        super(nombre, identificacion);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Saldo: " + saldo;
    }
}
