/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 */
public class Datos 
{
        
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;


    public String getSintoma1() {
        return sintoma1;
    }

    public void setSintoma1(String sintoma1) {
        this.sintoma1 = sintoma1;
    }

    public String getSintoma2() {
        return sintoma2;
    }

    public void setSintoma2(String sintoma2) {
        this.sintoma2 = sintoma2;
    }

    public String getSintoma3() {
        return sintoma3;
    }

    public void setSintoma3(String sintoma3) {
        this.sintoma3 = sintoma3;
    }

    public String getSintoma4() {
        return sintoma4;
    }

    public void setSintoma4(String sintoma4) {
        this.sintoma4 = sintoma4;
    }

    public String getSintoma5() {
        return sintoma5;
    }

    public void setSintoma5(String sintoma5) {
        this.sintoma5 = sintoma5;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }
    
    private String sintoma1;
    private String sintoma2;
    private String sintoma3;
    private String sintoma4;
    private String sintoma5;



    
    private String sintomas[] = new String [5];

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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
