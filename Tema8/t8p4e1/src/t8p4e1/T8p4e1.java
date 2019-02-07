/* [Xx ¡Bienvenidos al tren del mame! xX] */
package t8p4e1;

import Clases.*;
import Vistas.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Jowii
 */
public class T8p4e1 {
    /* ------------------------------ */
    /* BASE DE DATOS */
    //Ventanas
    private static Login vLogin;
    private static Main vMain;
    private static Gestion vGestion;
    
    //Clases
    private static Personal ep1;
    private static Empleado ee1;
    private static Departamento departamento;
    private static ArrayList<Departamento> listaDepartamentos;

    //Variables
    private static int contador = 0;
    
    /* ------------------------------ */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializar base de datos
        crearDatosPersonal();
        crearDatosDepartamento();
        
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
            vLogin.limpiarCampos();
            contador++;
        }
    }
    
    //Metodos Ventana main
    public static void mostrarMain(){
        vMain = new Main();
        vMain.setVisible(true);
    }
    
    public static void cerrarMain(){
        vMain.dispose();
    }
    
    //Metodos Ventana Gestion
    public static void mostrarGestion(){
        vGestion = new Gestion();
        vGestion.setVisible(true);
    }
    
    public static void cerrarGestion(){
        vGestion.dispose();
    }
    
    //Metodos Personal
    public static void crearDatosPersonal() {
        ep1 = new Personal("a", "a");
    }
    
    //Metodos Departamento
    public static void crearDatosDepartamento(){
        listaDepartamentos = new ArrayList<>();
        departamento = new Departamento("Logistica");        
        listaDepartamentos.add(departamento);
        departamento = new Departamento("Personal");
        listaDepartamentos.add(departamento);
        departamento = new Departamento("Informatica");
        listaDepartamentos.add(departamento);
        departamento = new Departamento("Contabilidad");
        listaDepartamentos.add(departamento);
        
        //Debug purposes
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            System.out.println(listaDepartamentos.get(i).getNombreDepartamento());
        }
        
    }
    
    //Metodos Contrato
    
    
    //Metodos Empleado
    public static void crearDatosEmpleado(){
        
    }
    
    //Salir programa
    public static void cerrarPrograma(){
        System.exit(0);
    }
}
