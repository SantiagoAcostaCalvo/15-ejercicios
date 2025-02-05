package EmpresaPersona;
public class PersonaEmpresa {
    private String nombre;
    private String cargo;

    public PersonaEmpresa(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public String getInfo() {
        return "Empleado: " + nombre + " | Cargo: " + cargo;
    }
}
