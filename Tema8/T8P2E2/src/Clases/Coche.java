/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;

/**
 *
 * @author Jowii
 */
public class Coche {
    private String matricula;
    private String marca;
    private String DNI;
    private Multa multa;

    public Coche(){}
    
    public Coche(String matricula, String marca, String DNI, Multa multa) {
        this.matricula = matricula;
        this.marca = marca;
        this.DNI = DNI;
        this.multa = multa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", marca=" + marca + ", DNI=" + DNI + ", multa=" + multa + '}' + "\n";
    }

}
