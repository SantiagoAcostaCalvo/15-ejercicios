package EquipoPersona;

public class PrincipalPersonaEquipo {
    public static void main(String[] args) {
        PersonaEquipo p = new PersonaEquipo("Lionel Messi", "Delantero");
        System.out.println(p.getInfo());

        Entrenador e = new Entrenador("Pep Guardiola", "Director Técnico", 20);
        System.out.println(e.getInfo());
    }
}
