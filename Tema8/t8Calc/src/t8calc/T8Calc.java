/* [Xx ¡Bienvenidos al tren del mame! xX] */
package t8calc;
import Vistas.Ventana;

/**
 *
 * @author Jowii
 */
public class T8Calc {

    public static Ventana v;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        setVentana();
    }
    
    public static void setVentana(){
        v = new Ventana();
        v.setVisible(true);
    }
    
    public static void salir(){
        v.dispose();
        System.exit(0);
    }
    
    /*OPERACIONES*/
    public static int sumar(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }
    
    public static int restar(int n1, int n2){
        int resultado = n1 - n2;
        return resultado;
    }
    
    public static int multiplicar(int n1, int n2){
        int resultado = n1 * n2;
        return resultado;
    }
    
    public static int dividir(int n1, int n2){
        int resultado = n1 / n2;
        return resultado;
    }
    
}
