/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;

/**
 *
 * @author Jowii
 */
public class Jugador {
    private String nombre;
    private String puesto;
    private String dorsal;
    private Equipo equipo;
    
    public Jugador(){}

    public Jugador(String nombre, String puesto, String dorsal, Equipo equipo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.dorsal = dorsal;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
