/* [Xx ¡Bienvenidos al tren del mame! xX] */
package t8e2;

import Clases.Persona;
import java.util.ArrayList;
import Vistas.Ventana1;
import Vistas.Ventana2;

/** 
 *
 * @author Jowii
 */
public class T8e2 {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<Persona> personas = new ArrayList<Persona>();
    public static Ventana1 v1;
    public static Ventana2 v2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        v1 = new Ventana1();
        //aqui se agregan las personas
        
        v2 = new Ventana2();
    }
    
    public static void agregarPersona(Persona p){
        personas.add(p);
    }
    
    public static void cambioVentana(){
        v1.dispose();
        v2.setVisible(true);
    }
    
    public static void salir(){
        System.exit(0);
    }
    
}
