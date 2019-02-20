/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Jowii
 */
public class Equipo {
    private String nombreEquipo;
    private String escudo;
    private Division division;
    private ArrayList<Jugador> listaJugadores;
    
    public Equipo(){}

    public Equipo(String nombreEquipo, String escudo, Division division, ArrayList<Jugador> listaJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.escudo = escudo;
        this.division = division;
        this.listaJugadores = listaJugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return nombreEquipo;
    }

    
}
