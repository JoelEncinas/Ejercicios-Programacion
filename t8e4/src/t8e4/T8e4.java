/* [Xx ¡Bienvenidos al tren del mame! xX] */
package t8e4;

import Clases.Productos;
import Vistas.VentanaMain;
import Vistas.VentanaCompras;
import Vistas.VentanaVentas;
import java.util.ArrayList;

/**
 *
 * @author Jowii
 */
public class T8e4 {
    
    private static VentanaMain v1;
    private static VentanaCompras v2;
    private static VentanaVentas v3;
    
    private static Productos p;
    private static ArrayList<Productos> listaProductos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listaProductos = new ArrayList<Productos>();
        mostrarVentana();
    }
    
    public static void generarAlmacen(){
        p = new Productos("Tornillo", 2, 3000);
        listaProductos.add(p);
        p = new Productos("Martillo", 25, 100);
        listaProductos.add(p);
        p = new Productos("Clavo", 1, 1000);
        listaProductos.add(p);
        p = new Productos("Mazo", 50, 100);
        listaProductos.add(p);
        p = new Productos("Taladro", 100, 70);
        listaProductos.add(p);
        p = new Productos("Ladrillo", 5, 350);
        listaProductos.add(p);
    }
    
    public static void compraProducto(String n, int p, int u){
        listaProductos.add(new Productos (n, p, u));
    }
    
    public static boolean comprobarProducto(String a){
        int x;
        for(x = 0;x < listaProductos.size() && listaProductos.get(x).getNombre().compareToIgnoreCase(a)!= 0; x++){}
        if (x == listaProductos.size())
            // producto no encontrado
            return false;
        
        // producto encontrado
        // Variable global p (producto)
        p = listaProductos.get(x);
        return true;
    }
    
    public static void mostrarVentana(){
        v1 = new VentanaMain();
        v1.setVisible(true);
    }
    
    public static void cambiarVentanaC(){
        v1.dispose();
        v2 = new VentanaCompras();
        v2.setVisible(true);
    }
    
    public static void cambiarVentanaV(){
        v1.dispose();
        v3 = new VentanaVentas();
        v3.setVisible(true);
    }
    
    public static void volverVentanaMainC(){
        v2.dispose();
        v1.setVisible(true);
    }
    
    public static void volverVentanaMainV(){
        v3.dispose();
        v1.setVisible(true);
    }
    
    public static void terminar(){
       v1.dispose();
       System.exit(0);
    }
    
}
