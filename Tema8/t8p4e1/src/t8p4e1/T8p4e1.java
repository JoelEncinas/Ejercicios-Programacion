 /* [Xx ¡Bienvenidos al tren del mame! xX] */
package t8p4e1;

import Clases.*;
import Vistas.*;
import java.time.LocalDate;
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
    private static Empleado ee1, ee2;
    private static ArrayList<Empleado> listaEmpleados;
    private static Departamento departamento;
    private static ArrayList<Departamento> listaDepartamentos;
    private static Contrato c1;
    private static ArrayList<Contrato> listaContratos;

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
        crearDatosContrato();
        crearDatosEmpleado();
        
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
    
    public static void mostrarGestionModificacion(){
        vGestion = new Gestion();
        vGestion.setVisible(true);
        
    }
    
    public static void cerrarGestion(){
        vGestion.dispose();
    }
    
    public static void darAltaEmpleado(String DNI, String NSS, String nombre, 
                                       String direccion, String telefono,
                                       String sexo, String estadoCivil, 
                                       String contrato, String departamento,
                                       LocalDate fechaAlta, int nEmpleado){
        ee1 = new Empleado(DNI, NSS, nombre, direccion, telefono, sexo,
                           estadoCivil, contrato, departamento, fechaAlta,
                           nEmpleado);
        listaEmpleados.add(ee1);
        
        //Debug purposes
        System.out.println(ee1.toString());
    }
    
    //Metodos Personal
    public static void crearDatosPersonal() {
        ep1 = new Personal("", "");
    }
    
    //Metodos Departamento
    public static void crearDatosDepartamento(){
        listaDepartamentos = new ArrayList();
        departamento = new Departamento("Logistica");        
        listaDepartamentos.add(departamento);
        departamento = new Departamento("Personal");
        listaDepartamentos.add(departamento);
        departamento = new Departamento("Informatica");
        listaDepartamentos.add(departamento);
        departamento = new Departamento("Contabilidad");
        listaDepartamentos.add(departamento);
        
//        //Debug purposes
//        for (int i = 0; i < listaDepartamentos.size(); i++) {
//            System.out.println(listaDepartamentos.get(i).getNombreDepartamento());
//        }   
    }
    
    public static ArrayList getListaDepartamentos(){
        return listaDepartamentos;
    }
    
    
    //Metodos Contrato
    public static void crearDatosContrato(){
        listaContratos = new ArrayList();
        c1 = new Contrato("Indefinido");
        listaContratos.add(c1);
        c1 = new Contrato("Temporal");
        listaContratos.add(c1);
        c1 = new Contrato("Relevo");
        listaContratos.add(c1);
        c1 = new Contrato("Practicas");
        listaContratos.add(c1);
        c1 = new Contrato("Parcial");
        listaContratos.add(c1);
             
//        //Debug purposes
//        for (int i = 0; i < listaContratos.size(); i++) {
//            System.out.println(listaContratos.get(i).getTipo());
//        } 
    }
    
    public static ArrayList getListaContratos(){
        return listaContratos;
    }
    
    //Metodos Empleado
    public static void crearDatosEmpleado(){
        LocalDate dateNow = LocalDate.now();
        listaEmpleados = new ArrayList();
        ee2 = new Empleado("7283920", "9283", "jowi", "/C Mame", "667182839", "h",
                           "s", "Indefinido", "Contabilidad", dateNow,
                           23);
        listaEmpleados.add(ee2);
        ee2 = new Empleado("7283920", "9283", "juan", "/C Mame", "667182839", "h",
                           "s", "Parcial", "Informatica", dateNow,
                           10);
        listaEmpleados.add(ee2);
        ee2 = new Empleado("7283920", "9283", "pepe", "/C Mame", "667182839", "h",
                           "s", "Temporal", "Logistica", dateNow,
                           82);
        listaEmpleados.add(ee2);
    }
    
    public static ArrayList getListaEmpleados(){
        return listaEmpleados;
    }
    
    //Salir programa
    public static void cerrarPrograma(){
        System.exit(0);
    }
}
