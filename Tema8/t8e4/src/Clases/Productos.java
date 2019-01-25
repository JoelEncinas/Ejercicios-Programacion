/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;

/**
 *
 * @author Jowii
 */
public class Productos {
    private String nombre;
    private int precio;
    private int unidades;

    public Productos() {}
    
    public Productos(String nombre, int precio, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto[" + "nombre: " + nombre + ", "
                + " precio: " + precio + ", " + ", unidades: " + unidades + ']';
    }

}
