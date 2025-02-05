package citas;

public class PrincipalCita {
    public static void main(String[] args) {
        Citas citas = new Citas();
        citas.nombre = "doctor mejia";
        citas.hora = "12:00";
        citas.consultorio = "201";
        citas.descripcion = "terapeuta";
        System.out.println(citas.mostrarMensaje());
    }
}
