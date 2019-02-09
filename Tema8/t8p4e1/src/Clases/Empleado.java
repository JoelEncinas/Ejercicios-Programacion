/* [Xx ¡Bienvenidos al tren del mame! xX] */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author Jowii
 */
public class Empleado {
    private String DNI;
    private String NSS;
    private String nombre;
    private String direccion;
    private String telefono;
    private String sexo;
    private String estadoCivil;
    private String contrato;
    private String departamento;
    private LocalDate fechaAlta;
    private int numEmpleado;

    public Empleado(){        
    }

    public Empleado(String DNI, String NSS, String nombre, String direccion, String telefono, String sexo, String estadoCivil, String contrato, String departamento, LocalDate fechaAlta, int numEmpleado) {
        this.DNI = DNI;
        this.NSS = NSS;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.contrato = contrato;
        this.departamento = departamento;
        this.fechaAlta = fechaAlta;
        this.numEmpleado = numEmpleado;
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

}
