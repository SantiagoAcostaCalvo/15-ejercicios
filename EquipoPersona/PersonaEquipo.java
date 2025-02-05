package EquipoPersona;

public class PersonaEquipo {
    private String nombre;
    private String posicion;

    public PersonaEquipo(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getInfo() {
        return "Jugador: " + nombre + " | Posición: " + posicion;
    }
}
