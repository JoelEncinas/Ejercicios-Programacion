package t4e2;

import javax.swing.JOptionPane;

public class T4e2 {

    public static void main(String[] args) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
        "julio", "agosto", "septiembre", "novimebre", "diciembre"};
        
        String mes = JOptionPane.showInputDialog("Teclea el mes:");
      
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].compareToIgnoreCase(mes) == 0) {
                JOptionPane.showMessageDialog(null, "Oleeeeeeee");
            }
        }
    }
}
