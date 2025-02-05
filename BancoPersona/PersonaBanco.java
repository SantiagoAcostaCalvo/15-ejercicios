package BancoPersona;

public class PersonaBanco {
    private String nombre;
    private String identificacion;

    public PersonaBanco(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getInfo() {
        return "Cliente: " + nombre + " | ID: " + identificacion;
    }
}
