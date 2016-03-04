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
public class persona {

    private int id;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private String estado_civil;
    
    public persona(int id, String nombre, Date fecha_nacimiento, String estado_civil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido=apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado_civil = estado_civil;
    }

    persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    

    public long obtenetEdad(){
        Date hoy=new Date();
        long day=(hoy.getTime()-this.fecha_nacimiento.getTime())/(100*60*60*24);
        return day/365;
    }
    
}
