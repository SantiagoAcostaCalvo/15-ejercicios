package gimnasio;

public class PrincipalGimnasio {
    public static void main(String[] args) {
        RegistroGimnasio registroGimnasio = new RegistroGimnasio();
        registroGimnasio.nombre = "Pedro Ramírez";
        registroGimnasio.membresia = "Premium";
        registroGimnasio.fechaIngreso = "28/01/2025";
        registroGimnasio.entrenador = "Carlos Pérez";
        System.out.println(registroGimnasio.mostrarMensaje());
    }
}
