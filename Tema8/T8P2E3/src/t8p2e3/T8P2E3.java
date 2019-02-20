/* [Xx ¡Bienvenidos al tren del mame! xX] */
package t8p2e3;

import Clases.*;
import Vistas.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
/**
 *
 * @author Jowii
 */
public class T8P2E3 {

    //Base de datos
    private static Jugador jug1;
    private static Equipo equ1;
    private static Division div;
    private static ArrayList<Division> listaDivisiones;
    private static ArrayList<Jugador> listaJugadores;
    
    //Ventana
    private static Ventana vMain;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crearBaseDatos();
        
        mostrarVentana();
    }
    
    public static void crearBaseDatos(){
        //Divisiones
        listaDivisiones = new ArrayList();
        div = new Division("Primera");        
        listaDivisiones.add(div);
        div = new Division("Segunda");
        listaDivisiones.add(div);
        div = new Division("SegundaB");
        listaDivisiones.add(div);
        System.out.println(listaDivisiones);
        
        //Equipos
        equ1 = new Equipo();
        listaJugadores = new ArrayList();
        jug1 = new Jugador("Juan", "Delantero", "10", equ1);  
        listaJugadores.add(jug1);
        jug1 = new Jugador("Pepe", "Defensa", "3", equ1);
        listaJugadores.add(jug1);
        jug1 = new Jugador("Jon", "Portero", "1", equ1);
        listaJugadores.add(jug1);
        equ1.setDivision(listaDivisiones.get(0));
        equ1.setEscudo("Blanco Morado");
        equ1.setListaJugadores(listaJugadores);
        equ1.setNombreEquipo("Real Madrid");
        System.out.println(equ1 + "\n" + listaJugadores);        
    }
    
    public static void crearEquipoJugador(String nombreEquipo, String escudo, Division division,
                                          ArrayList<Jugador> listaJugadoresVentana, String nombre, String puesto,
                                          String dorsal, Equipo equipo){
        equ1 = new Equipo();
        jug1 = new Jugador();
        listaJugadores = new ArrayList();
    }
    
    public static void llenarComboboxDivision(JComboBox cbDivision){
        for (int i = 0; i < listaDivisiones.size(); i++) {
            cbDivision.insertItemAt(listaDivisiones.get(i), i);
        }
    }
    
    public static void mostrarVentana(){
        vMain = new Ventana();
        vMain.setVisible(true);
    }
    
    public static void cerrarVentana(){
        vMain.dispose();
    }
    
    public static void cerrarPrograma(){
        System.exit(0);
    }
    
    
}
