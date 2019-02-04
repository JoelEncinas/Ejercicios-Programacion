/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;

import java.util.Date;

/**
 *
 * @author Jowii
 */
public class Hijo {
    private String nombre;
    private Date fecha;

    public Hijo(){
        
    }
    
    public Hijo(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
