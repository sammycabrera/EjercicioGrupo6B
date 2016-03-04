/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapppoo;

/**
 *
 * @author APRENDIZ
 */
public class Empleado extends Persona{
    private String ARP;
    
    /**
     * Atributo Entidad prestadora de salud
     */
    private String EPS;
    
    /**
     * Cargo del empleado
     */
    private Cargo cargo;

    public Empleado() {
    }

    public Empleado(String ARP, String EPS, Cargo cargo) {
        this.ARP = ARP;
        this.EPS = EPS;
        this.cargo = cargo;
    }

    public String getARP() {
        return ARP;
    }

    public void setARP(String ARP) {
        this.ARP = ARP;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "ARP=" + ARP + ", EPS=" + EPS + ", cargo=" + cargo + "nombre="+ getNombre()+"apellido="+ getApellido()+"estado civil"+getEstado_civil()+ +'}';
    }
    
    
    
}
