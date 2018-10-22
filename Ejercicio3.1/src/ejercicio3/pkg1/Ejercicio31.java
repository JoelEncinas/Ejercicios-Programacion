package ejercicio3.pkg1;
import javax.swing.JOptionPane;

public class Ejercicio31 {
    
    public static void main(String[] args) {
        //contador vocales
        int numeroVocales = 0;
        
        //Entrada de datos
        String mensaje = JOptionPane.showInputDialog(null, "Escribe una frase");
        int longitud = mensaje.length();
        
        //bucle que recorre el mensaje
        for (int i = 0; i < longitud; i++) {
                char letraChar = mensaje.charAt(i);
                String letra = String.valueOf(letraChar);
                if ("a".equals(letra) || "e".equals(letra) || 
                    "i".equals(letra) || "o".equals(letra) ||
                    "u".equals(letra)) {
                    numeroVocales++;
                }
        }
        JOptionPane.showMessageDialog(null, "Tiene " + numeroVocales + " vocales.");
    }
}
