/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesdelProyecto;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author danie
 */
abstract public class Vehiculos extends JButton{
    //ATRIBUTOS de vehículos
     int hp, pp, nivel, experiencia;
    int ataque, defensa, punteria;
    String nombre, arma, tipoarma = "Arma Basica";
    ImageIcon tanque = new ImageIcon("src/ImagenesD/tanquepequeño.jpg");
        Icon iconoTanque = new ImageIcon(tanque.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        
        ImageIcon avion = new ImageIcon("src/ImagenesD/tanquepequeño.jpg");

    public ImageIcon getTanque() {
        return tanque;
    }

    public void setTanque(ImageIcon tanque) {
        this.tanque = tanque;
    }

    public Icon getIconoTanque() {
        return iconoTanque;
    }

    public void setIconoTanque(Icon iconoTanque) {
        this.iconoTanque = iconoTanque;
    }

    public ImageIcon getAvion() {
        return avion;
    }

    public void setAvion(ImageIcon avion) {
        this.avion = avion;
    }

    public Icon getIconoAvion() {
        return iconoAvion;
    }

    public void setIconoAvion(Icon iconoAvion) {
        this.iconoAvion = iconoAvion;
    }
        Icon iconoAvion = new ImageIcon(avion.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
    
    /**
     * Constructor
     * @param hp
     * @param pp
     * @param nivel
     * @param experiencia
     * @param nombre
     * @param arma 
     */
        
        
     public Vehiculos(int hp, int pp, int nivel, int experiencia, String nombre, String arma) {
        this();
        this.nombre = nombre;
        arma = tipoarma;
    }
     /**
      * Constructor
      */
    public Vehiculos(){
        hp=50;
        pp = 5;
        nivel = 1;
        experiencia = 0;
    }
    public Vehiculos(String nombre) {
        this();
        this.nombre = nombre;
        arma = tipoarma;
    }
    public Vehiculos(int nivel) {
        this.nivel=nivel;
    }
   /**
     * Retorna Vehiculo
     * @return
     */
    abstract String getVehiculo();
    /**
     * Retorna TipoV
     * @return
     */
    abstract int getTipoV();
    /**
     * Retorna ataque
     * @return
     */
    abstract int getAtaque();
    /**
     * Retorna defensa
     * @return
     */
    abstract int getDefensa();
    /**
     * Retorna punteria
     * @return
     */
    abstract int getPunteria();
    /**
     * Retorna nickname
     * @return
     */
    abstract String getNombre();


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

   

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }



    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

 
    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
    }
    
     /**
     * Establece el ataque
     * @param ataque,nivel
     */
    abstract void setAtaque(int ataque, int nivel);
    /**
     * Establece el defensa
     * @param defensa,nivel
     */
    abstract void setDefensa(int defensa, int nivel);
    /**
     * Establece el punteria
     * @param punteria,nivel
     */
    abstract void setPunteria(int punteria,int nivel);

    
    
}
