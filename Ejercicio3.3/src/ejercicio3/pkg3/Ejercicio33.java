package ejercicio3.pkg3;
import javax.swing.JOptionPane;

public class Ejercicio33 {

    public static void main(String[] args) {
        //contador vocales
        int contadorLetra = 0;
        
        //Entrada de datos
        String mensaje = JOptionPane.showInputDialog(null, "Escribe una frase");
        int longitud = mensaje.length();
        String letra = JOptionPane.showInputDialog(null, "Escribe una letra que este en la frase");
        
        //bucle que recorre el mensaje
        for (int i = 0; i < longitud; i++) {
                char letraDelMensaje = mensaje.charAt(i);
                String letraString = String.valueOf(letraDelMensaje);
                if (letra.equalsIgnoreCase(letraString)) {
                    contadorLetra++;
                }
        }
        letra = letra.toUpperCase();
        JOptionPane.showMessageDialog(null, "Tiene la letra " + "\"" + letra + "\" " + contadorLetra + " veces");
    }
    
}
