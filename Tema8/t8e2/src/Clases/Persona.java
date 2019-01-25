/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;

/**
 *
 * @author Jowii
 */
public class Persona {
    
    private String nom;
    private String ape;
    private String dni;

    //Constructor vacio
    public Persona() {
    }
    
    //Constructor
    public Persona(String nom, String ape, String dni) {
        this.nom = nom;
        this.ape = ape;
        this.dni = dni;
    }
    
    //Getters & Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //Sobrecarga metodo
    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", ape=" + ape + ", dni=" + dni + '}';
    }
    
    
}
