/* [Xx ¡Bienvenidos al tren del mame! xX] */
package t8p4e1;

import Clases.Personal;
import Vistas.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jowii
 */
public class T8p4e1 {
    /* BASE DE DATOS */
    //Ventanas
    private static Login vLogin;
    private static Main vMain;
    
    //Clases
    private static Personal ep1;

    //Variables
    private static int contador = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear empleado personal
        crearDatosPersonal();
        
        //Intro login
        mostrarLogin();
    }
    
    //Metodos login
    public static void mostrarLogin(){
        vLogin = new Login();
        vLogin.setVisible(true);
    }
    
    public static void cerrarLogin(){
        vLogin.dispose();
    }
    
    public static void comprobarUsuario(String user, String pass){
        //Al tercer intento fallido se sale el programa
        if (contador == 2) {
            JOptionPane.showMessageDialog(vLogin, "Login incorrecto");
            cerrarPrograma();
        }
        
        if (user.equals(ep1.getUser()) && pass.equals(ep1.getPass())) {
            cerrarLogin();
            mostrarMain();            
        }        
        else {
            contador++;
        }
    }
    
    //Metodos Personal
    public static void crearDatosPersonal() {
        ep1 = new Personal("juan", "123");
    }
    
    //Metodos Ventana main
    public static void mostrarMain(){
        vMain = new Main();
        vMain.setVisible(true);
    }
    
    public static void cerrarMain(){
        vMain.dispose();
    }
    
    //Salir programa
    public static void cerrarPrograma(){
        System.exit(0);
    }
}
