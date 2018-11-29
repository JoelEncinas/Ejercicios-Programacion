package t5e1;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class T5e1 {

    static ArrayList <Double> datos = new ArrayList();
    
    public static void main(String[] args) {
        /*Crea un arraylist para guardar valores de tipo real (Float o Double) que iremos
        introduciendo por teclado hasta finalizar (mientras quiera continuar).
        Posteriormente muestra un menu para que el usuario pueda realizar las
        siguientes operaciones. */
        
        //Pedimos datos
        pedirDatos();
        
        boolean flag = false; 
        
        //Funcionamiento opciones Menu
        while (!flag) {
            int opcion = opcionMenu();
            switch(opcion) {
                case 1: valoresMinMax();
                    break;
                case 2: buscarNumero();
                    break;
                case 3: buscarYBorrar();
                    break;
                case 4: convertirArray();
                    break;
                case 5: mostrarNumeroElementos();
                    break;
                case 6: insertarElementoFinal();
                    break;
                case 7: insertarElementoPosicion();
                    break;
                case 8: borrarElementoPosicion();
                    break;
                case 9: sumaYMedia();
                    break;
                case 10: flag = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "¡Debes introducir un numero valido!");
            }
        }
    } 
    
    //Almacenamos la opcion que nos pida el usuario y la devolvemos al main
    public static int opcionMenu() {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Introduce la opcion a la que quieras acceder [1-10] \n\n"
                + "1. Visualizar el valor maximo y el mınimo. \n"
                + "2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo has encontrado o no. \n"
                + "3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error. \n"
                + "4. Convertir el arrayList en un array. \n"
                + "5. Si no esta vacıo, mostrar el numero de elementos que contiene. \n"
                + "6. Insertar un nuevo elemento por el final. \n"
                + "7. Insertar un nuevo elemento en la posicion que te indique el usuario. \n"
                + "8. Borrar un elemento de una posicion concreta. \n"
                + "9. Calcular la suma y la media aritmetica de los valores contenidos. \n"
                + "10. Finalizar. \n\n"));
        return opcion;
    }
    
    //Metodo para introducir datos
    public static void pedirDatos() {
        String respuesta;
        do {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
            datos.add(num);
            respuesta = JOptionPane.showInputDialog("Deseas seguir introduciento datos? [s/n]");
        } while (!respuesta.equalsIgnoreCase("N"));
    }
    
    //Visualizar el valor maximo y el mınimo
    public static void valoresMinMax() {
        double min, max;
        max = datos.get(0);
        min = datos.get(0);
        for (int i = 0; i < datos.size(); i++) { 
            if (datos.get(i) < min) {
                min = datos.get(i);
            }
            else if (datos.get(i) > max) {
                max = datos.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "El nº mas grande es " + max + " y el nº mas pequeño es " + min);
    }

    //Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo has encontrado o no
    public static void buscarNumero() {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
        for (int i = 0; i < datos.size(); i++) {
            if (num == datos.get(i)) {
                JOptionPane.showMessageDialog(null, "¡Lo encontre! " + num);
            }
        }
    }
    
    //Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error
    public static void buscarYBorrar() {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
            for (int i = 0; i < datos.size(); i++) {
                if (num == datos.get(i)) {
                    datos.remove(i);
                }
            }
    }
    
    //Convertir el arrayList en un array.
    public static void convertirArray() {
        
    }
    
    //Si no esta vacıo, mostrar el numero de elementos que contiene
    public static void mostrarNumeroElementos() {
        while(!datos.isEmpty()){   
            JOptionPane.showMessageDialog(null, datos.size());
        }
    }
    
    //Insertar un nuevo elemento por el final
    public static void insertarElementoFinal() {
        
    }
    
    //Insertar un nuevo elemento en la posicion que te indique el usuario
    public static void insertarElementoPosicion() {
        
    }
    
    //Borrar un elemento de una posicion concreta
    public static void borrarElementoPosicion() {
        
    }
    
    //Calcular la suma y la media aritmetica de los valores contenidos
    public static void sumaYMedia() {
        
    }    
}
