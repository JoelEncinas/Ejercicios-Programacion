/*Becoming a software engineer living in Asia*/
package almacénproductos;

import Clases.Producto;
import Vistas.VentanaCompras;
import Vistas.VentanaMain;
import Vistas.VentanaVentas;
import java.util.ArrayList;


public class AlmacénProductos {
    
    public static ArrayList <Producto> listaProductos = new ArrayList();
    public static Producto prod; 
    public static VentanaMain v0;
    public static VentanaVentas v1;
    public static VentanaCompras v2;
    public static int posicionItem;
    
    public static void main(String[] args) {
        
        listaProductos.add(new Producto("Vagon", 1000, 4));
        listaProductos.add(new Producto("Ruedas", 100, 40));
        listaProductos.add(new Producto("Tornillos", 20, 2000));
        listaProductos.add(new Producto("Vias", 150, 104));

        v0 = new VentanaMain();
        v0.setVisible(true);

    }
    
    
    //Botones Ventana Main
    public static void abrirVentanaCompras(){
        v0.dispose();
        v2 = new VentanaCompras();
        v2.setVisible(true);
    }
    
    public static void abrirVentanaVentas(){
        v0.dispose();
        v1 = new VentanaVentas();
        v1.setVisible(true);
    }
    
    public static void salir(){
        v0.dispose();
        System.exit(0);
    }
    
    //Botones Ventana Compras
    public static void cerrarCompras(){
        v2.dispose();
        v0.setVisible(true);
    }
    public static void aceptarCompra(String producto, int unidades, int precio){
        boolean itemCheck = verificarItem(producto);
        if(itemCheck == true){
            listaProductos.get(posicionItem).comprar(unidades);
            System.out.println(listaProductos.get(posicionItem).getUnidades());
        }
        else{
            listaProductos.add(new Producto(producto, unidades, precio));
            System.out.println(listaProductos.get(listaProductos.size()-1).getNombre());
        }
        v2.limpiarVentana();
        
    
    }
    
    //Botones Ventana Ventas
    public static void cerrarVentas(){
        v1.dispose();
        v0.setVisible(true);
    }
    
    public static void aceptarVenta(String producto, int unidades){
        v1.limpiarVentana();
    }
    
    //Check if we have the item
    public static boolean verificarItem(String producto){
        int i;
        for(i = 0; i < listaProductos.size() && listaProductos.get(i).getNombre().compareToIgnoreCase(producto) != 0 ; i++){}
            if(i == listaProductos.size()){
                return false;
            }
            posicionItem = i;
            System.out.println(posicionItem);
            return true;
            
    
    }

}
