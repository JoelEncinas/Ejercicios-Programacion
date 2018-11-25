package t4e7;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class T4e7 {

    public static void main(String[] args) {
        
        /*  En este ejercicio el usuario nos va a proporcionar a traves del teclado
        el numero de unidades que se venden de los distintos productos con los que
        trabaja una empresa.
        Esta empresa trabaja con diez productos distintos cuyos codigos son:
        10, 23, 30, 47, 55, 65,135,256, 526, 663. El usuario cada vez que se 
        hace una venta, nos proporcionara el codigo del producto (hay que
        comprobar que es valido) y el numero de unidades vendidas de ese
        producto. Al final del dıa, es decir, cuando el usuario nos diga que no
        desea continuar, nosotros tenemos que visualizar el numero total de
        unidades vendidas de cada producto y el codigo del producto, todo
        ello ordenado de menor a mayor por numero de unidades vendidas. */
            
        int [] codProductos = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
        int [] cantidadProductos = new int [10];
        
        boolean flag;              
        Arrays.fill(cantidadProductos, 0); 
        
        
        do {
            flag = false;

            do {
                flag = false;
                String codProducto = JOptionPane.showInputDialog("Introduce el codigo del producto");
                for (int i = 0; i < codProductos.length; i++) {
                    if (!codProducto.equals(codProductos[i])) {
                        flag = true;
                    }    
                }                
            } while (flag == true);

            String continuar = JOptionPane.showInputDialog("Quieres continuar? (s/n)");
            if (continuar.equalsIgnoreCase("s")) {
                flag = true;
            }
        } while (flag == true);
        
    }
    
}
