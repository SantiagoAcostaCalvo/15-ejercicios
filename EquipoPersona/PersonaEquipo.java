package EquipoPersona;

public class PersonaEquipo {
    private String nombre;
    private String posicion;

    public PersonaEquipo(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getInfo() {
        return "Jugador: " + nombre + " | Posición: " + posicion;
    }
}

class Entrenador extends PersonaEquipo {
    private int experiencia;

    public Entrenador(String nombre, String posicion, int experiencia) {
        super(nombre, posicion);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Años de experiencia: " + experiencia;
    }
}
