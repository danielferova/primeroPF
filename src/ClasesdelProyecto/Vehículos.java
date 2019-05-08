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
public class Vehículos {
    //ATRIBUTOS de vehículos
     protected int hp, pp, nivel, experiencia;
    int ataque, defensa,punteria;
    protected String nombre, arma, tipoarma="Arma Basica";
    /**
     * Constructor
     * @param hp
     * @param pp
     * @param nivel
     * @param experiencia
     * @param nombre
     * @param arma 
     */
     public Vehículos(int hp, int pp, int nivel, int experiencia, String nombre, String arma) {
        this();
        this.nombre = nombre;
        arma = tipoarma;
    }
     /**
      * Constructor
      */
    public Vehículos(){
        hp=50;
        pp = 5;
        nivel = 1;
        experiencia = 0;
    }
}
