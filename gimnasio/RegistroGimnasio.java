package gimnasio;

public class RegistroGimnasio {
    public String nombre;
    public String membresia;
    public String fechaIngreso;
    public String entrenador;
    public String mostrarMensaje() {
        return "El usuario " + nombre + " con membresía " + membresia +
                " ingresó al gimnasio el " + fechaIngreso +
                " y ha sido asignado al entrenador " + entrenador + ".";
    }
}
