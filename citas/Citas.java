package citas;

public class Citas {
    public String nombre;
    public String descripcion;
    public String consultorio;
    public String hora;
    public String mostrarMensaje(){
        return nombre+" "+consultorio+" "+hora+"su cita ha sido registrada";
    }
}
