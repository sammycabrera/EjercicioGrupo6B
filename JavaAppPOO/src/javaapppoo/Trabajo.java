/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapppoo;

import java.util.Date;

/**
 *
 * @author APRENDIZ
 */
public class Trabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
        persona persona1= new persona();
        persona1.setId(1);
        persona1.setNombre("leandro");
        persona1.setApellido("meza");
        Date fecha_nacimiento = new Date("02/02/1987");
        persona1.setFecha_nacimiento(fecha_nacimiento);
        persona1.setEstado_civil("CASADO");
    }
    
    
}
