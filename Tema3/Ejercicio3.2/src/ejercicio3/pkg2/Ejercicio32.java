package ejercicio3.pkg2;
import javax.swing.JOptionPane;

public class Ejercicio32 {

    public static void main(String[] args) {
        //variables
        String mensajeInvertido = "";

        //entrada de datos
        String mensaje = JOptionPane.showInputDialog(null, "Escribe tu mensaje: ");
        int longitud = mensaje.length();
        
        //bucle que recorre e invierte el mensaje.
        //es un for que decrece a 0 desde el nº de letras
        //que tenga el mensaje
        for (int i = longitud-1; i >= 0; i--) {
            mensajeInvertido = mensajeInvertido + mensaje.charAt(i);
        }
        
        JOptionPane.showMessageDialog(null, "Mensaje invertido: " + mensajeInvertido);
    }
    
}
