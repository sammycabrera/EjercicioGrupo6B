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
class Cargo {
    private String ID_Cargo;
    
    /**
     * Descripcion del cargo
     */
    private String descripcion;

    public Cargo() {
    }

    public Cargo(String ID_Cargo, String descripcion) {
        this.ID_Cargo = ID_Cargo;
        this.descripcion = descripcion;
    }

    public String getID_Cargo() {
        return ID_Cargo;
    }

    public void setID_Cargo(String ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
