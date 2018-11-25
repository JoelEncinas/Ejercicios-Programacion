package t4e8;
import java.util.*;
import javax.swing.JOptionPane;

public class T4e8 {

    public static void main(String[] args) {
        /* Crear una matriz de dos dimensiones de 10 x 10. Pediremos que
        introduzcan el numero de fila y el de columna que vamos a utilizar
        y el valor que quieren almacenar. Una vez introducidos los datos. Se
        escribira la suma correspondientes a las filas de la matriz. */
        
        int[][] variables = new int[10][10];

        // Llena el array
        for (int[] row: variables) {
            Arrays.fill(row, 0);
        }
            
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(variables[i]));
        }
        
        //        String var1 = JOptionPane.showInputDialog("Introduce el nº de fila:");
        //        String var2 = JOptionPane.showInputDialog("Introduce el valor para esa fila:");
        //        String var3 = JOptionPane.showInputDialog("Introduce el nº de columna:");
        //        String var4 = JOptionPane.showInputDialog("Introduce el valor para esa columna:");
        
        
        
    }
    
}