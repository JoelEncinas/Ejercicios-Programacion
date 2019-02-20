/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;

/**
 *
 * @author Jowii
 */
public class Division {
    private String descripcion;

    public Division(String descripcion) {
        this.descripcion = descripcion;
    }

    public Division(){}
    
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
