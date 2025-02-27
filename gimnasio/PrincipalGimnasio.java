package gimnasio;

class RegistroGimnasio {
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
        return "Cliente: " + nombre + " | Membresía: " + membresia + " | Fecha de ingreso: " + fechaIngreso + " | Entrenador: " + entrenador;
    }
}

class RegistroVIP extends RegistroGimnasio {
    private String beneficios;

    public RegistroVIP(String nombre, String membresia, String fechaIngreso, String entrenador, String beneficios) {
        super(nombre, membresia, fechaIngreso, entrenador);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String mostrarMensaje() {
        return super.mostrarMensaje() + " | Beneficios: " + beneficios;
    }
}

public class PrincipalGimnasio {
    public static void main(String[] args) {
        RegistroGimnasio registroGimnasio = new RegistroGimnasio("Pedro Ramírez", "Premium", "28/01/2025", "Carlos Pérez");
        System.out.println(registroGimnasio.mostrarMensaje());

        RegistroVIP registroVIP = new RegistroVIP("Laura Gómez", "VIP", "15/02/2025", "Ana Torres", "Acceso a spa y entrenamiento personalizado");
        System.out.println(registroVIP.mostrarMensaje());
    }
}
