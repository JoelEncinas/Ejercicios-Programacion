/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Jowii
 */
public class SocioFamiliar {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private ArrayList<Hijo> hijos;

    public SocioFamiliar(){
        
    }
    
    public SocioFamiliar(String nombre, String apellidos, String telefono, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Hijo> hijos) {
        this.hijos = hijos;
    }
    
    
}
