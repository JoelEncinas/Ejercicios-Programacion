/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;


/**
 *
 * @author Jowii
 */
public class Multa {
    private String descripcion;
    
    public Multa(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
    
}
