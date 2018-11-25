package t4e6;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class T4e6 {

    public static void main(String[] args) {
        /* Control de las falta de asistencia de los alumnos. Se dispone de los partes
        de faltas de los alumnos en el mes de noviembre y se pretende contabilizar
        el total de faltas de cada alumno. Se teclearan los partes diarios
        introduciendo la fecha, el codigo del alumno y el numero de faltas de
        ese dıa.
        Cada vez que el usuario nos introduzca datos, le preguntaremos si
        desea continuar.
        Supondremos a efectos practicos un maximo de 5 alumnos en clase.
        Cogeremos los 5 primeros codigos distintos que introduzcan como
        correctos, no admitiremos ninguno mas.*/
        
        boolean flag;
        int contador = 0;
        String codigo;
        String [][] listaFaltas = new String [5][5];
        int [] diasMes = new int [30];
        String mensaje = "";
        
        for (int i = 0; i < 30; i++) {
            diasMes[i] = i +1;
        }
        
        do {
            flag = false;
            int fecha = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia:"));
            diasMes [0] = fecha; 
             
            codigo = JOptionPane.showInputDialog("Introduce el codigo del alumno:");
            contador++;           

            String nFaltas = JOptionPane.showInputDialog("Introduce el nº de faltas:");
            
            String continuar = JOptionPane.showInputDialog("Quieres continuar? (s/n)");
            if (continuar.equalsIgnoreCase("s")) {
                flag = true;
            }
                      
        } while (flag == true);
       
        for (int i = 0; i < 5; i++) {
            mensaje = mensaje + "El alumno " + " ha faltado " + "\n";             
        }
        
        System.out.println(mensaje);
    }
    
}
