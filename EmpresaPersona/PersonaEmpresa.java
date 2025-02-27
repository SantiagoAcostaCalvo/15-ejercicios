package EmpresaPersona;

public class PersonaEmpresa {
    private String nombre;
    private String cargo;

    public PersonaEmpresa(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getInfo() {
        return "Empleado: " + nombre + " | Cargo: " + cargo;
    }
}

class Gerente extends PersonaEmpresa {
    private double salario;

    public Gerente(String nombre, String cargo, double salario) {
        super(nombre, cargo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Salario: " + salario;
    }
}
