package ejercicio3.pkg4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

public class Ejercicio34 {

    //Crea un programa que calcule la diferencia en dias entre
    //dos fechas dadas por el usuario como cadenas con el
    //formato dd/mm/yy.
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        
        //Date fechaActual = new Date();
        //System.out.println(fechaActual);
        
        String fecha1 = JOptionPane.showInputDialog("Teclea la primera fecha (dd-mm-yy)");
        String fecha2 = JOptionPane.showInputDialog("Teclea la segunda fecha (dd-mm-yy)");
        Date fechaConFormato = formatter.parse(fecha1);
        Date fechaConFormato2 = formatter.parse(fecha2);
        double fechaEnMilisegundos1 = fechaConFormato.getTime();
        double fechaEnMilisegundos2 = fechaConFormato2.getTime();
        double tiempoEntreFechas = 0;
        
        if (fechaEnMilisegundos1 > fechaEnMilisegundos2) {
            tiempoEntreFechas = fechaEnMilisegundos1 - fechaEnMilisegundos2;
        }
        else {
            tiempoEntreFechas = fechaEnMilisegundos2 - fechaEnMilisegundos1;
        }
        
        tiempoEntreFechas = (tiempoEntreFechas/8.64E7);
        System.out.println(String.format("Hay " + "%.0f" + " dias de diferencia", tiempoEntreFechas));
       
    }
    
}
