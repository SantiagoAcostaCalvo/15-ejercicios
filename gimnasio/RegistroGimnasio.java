package gimnasio;

public class RegistroGimnasio {
    private String nombre;
    private String membresia;
    private String fechaIngreso;
    private String entrenador;

    public RegistroGimnasio(String nombre, String membresia, String fechaIngreso, String entrenador) {
        this.nombre = nombre;
        this.membresia = membresia;
        this.fechaIngreso = fechaIngreso;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String mostrarMensaje() {
        return "El usuario " + nombre + " con membresía " + membresia +
                " ingresó al gimnasio el " + fechaIngreso +
                " y ha sido asignado al entrenador " + entrenador + ".";
    }
}

class PrincipalGimnasio {
    public static void main(String[] args) {
        RegistroGimnasio registro = new RegistroGimnasio("Pedro Ramírez", "Premium", "28/01/2025", "Carlos Pérez");
        System.out.println(registro.mostrarMensaje());
    }
}
