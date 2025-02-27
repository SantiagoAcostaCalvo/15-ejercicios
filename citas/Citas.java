package citas;

public class Citas {
    private String nombre;
    private String descripcion;
    private String consultorio;
    private String hora;

    public Citas(String nombre, String descripcion, String consultorio, String hora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.consultorio = consultorio;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String mostrarMensaje() {
        return nombre + " " + consultorio + " " + hora + " su cita ha sido registrada";
    }
}

class CitaEspecialista extends Citas {
    private String especialidad;

    public CitaEspecialista(String nombre, String descripcion, String consultorio, String hora, String especialidad) {
        super(nombre, descripcion, consultorio, hora);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarMensaje() {
        return super.mostrarMensaje() + " con el especialista en " + especialidad;
    }
}
