package ejercicio3.pkg5;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio35 {

    public static void main(String[] args) {
        //Crear un programa que recoja una fecha introducida por el usuario
        //como 3 campos numericos(dd/mm/yyyy) y devuelva la fecha 100 dias
        //posterior mostrada con el formato: Viernes, 16 de noviembre de 2018.       /
        Date fecha = new Date();
        
        String formato = "EEEEE , dd 'de' MMMM 'de' yyyy.";
        DateFormat dateFormat = new SimpleDateFormat(formato);
        String fechaConFormato = dateFormat.format(fecha); 
        
        //Convertir 1ª letra en mayus
        String fechaActualCap = fechaConFormato.substring(0, 1).toUpperCase() + fechaConFormato.substring(1); 
        System.out.println(fechaActualCap);
    }
        
}
    

