package citas;

public class PrincipalCita {
    public static void main(String[] args) {
        Citas citas = new Citas("doctor mejia", "terapeuta", "201", "12:00");
        System.out.println(citas.mostrarMensaje());

        CitaEspecialista citaEspecialista = new CitaEspecialista("doctora Pérez", "consulta de cardiología", "305", "14:30", "Cardiología");
        System.out.println(citaEspecialista.mostrarMensaje());
    }
}
