/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesdelProyecto;

/**
 *
 * @author danie
 */
public class Persona {
    String nombre;
    String v1, v2, v3, tipo1, tipo2, tipo3;

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getTipo3() {
        return tipo3;
    }

    public void setTipo3(String tipo3) {
        this.tipo3 = tipo3;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public String getV3() {
        return v3;
    }

    public void setV3(String v3) {
        this.v3 = v3;
    }

    public Persona(String nombre, String v1, String v2, String v3, String tipo1, String tipo2, String tipo3) {
        this.nombre = nombre;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.tipo3 = tipo3;
    }

    

    
    

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
