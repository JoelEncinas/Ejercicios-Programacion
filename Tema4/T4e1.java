package t4e1;

import javax.swing.JOptionPane;

public class T4e1 {

    public static void main(String[] args) {
        
        double [] arrayNumeros = new double[10];
        
        arrayNumeros[0] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero:"));
        double numMax = arrayNumeros[0];
        double numMin = arrayNumeros[0];
        
        for (int i = 1; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero:")); 
            if (arrayNumeros[i] > numMax) {
                numMax = arrayNumeros[i];
            }
            else if(arrayNumeros[i] < numMin){
                numMin = arrayNumeros[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El numero maximo es " + numMax + " y el numero minimo es " + numMin); 
    }
}
