/* [Xx ¡Bienvenidos al tren del mame! xX] */
package t8p2e2;

import Clases.*;
import Vistas.Multas;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Jowii
 */
public class T8P2E2 {

    private static ArrayList<Multa> listaMultas;
    private static ArrayList<Coche> listaCoches;
    private static Coche coche;
    private static Multa multa;
    private static Multas vMultas;  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de BD
        crearBaseDatos();            
        
        //Inicializacion programa
        mostrarVentana();
        
    }
    
    public static void crearRegistro(String matricula, String DNI, String marca, Multa multa){
        coche = new Coche(matricula, DNI, marca, multa);
        listaCoches.add(coche);
        System.out.println(listaCoches.toString());
    }
    
    private static void crearBaseDatos(){
        listaCoches = new ArrayList();
        listaMultas = new ArrayList();
        multa = new Multa("Exceso de velocidad");
        listaMultas.add(multa);
        multa = new Multa("Hablar por telefono");
        listaMultas.add(multa);
        multa = new Multa("No llevar cinto");
        listaMultas.add(multa);
        multa = new Multa("Tirar colilla en marcha");
        listaMultas.add(multa);
        
        
        coche = new Coche("123456A", "Tiguan", "72852094P", listaMultas.get(2));
        listaCoches.add(coche);
    }
    
    public static void llenarDepartamentos(JComboBox cbMultas)
    {
        // LLenar la combobox con el nombre de los departamentos
        for(int x = 0; x < listaMultas.size() ;x++)
            cbMultas.insertItemAt(listaMultas.get(x).getDescripcion(), x);
    }
    
    public static ArrayList<Multa> getListaMultas(){
        return listaMultas;
    }
    
    public static void mostrarVentana(){
        vMultas = new Multas();
        vMultas.setVisible(true);
    }
    
    public static void cerrarVentana(){
        vMultas.dispose();
    }
    
    public static void cerrarPrograma(){
        System.exit(0);
    }
}
