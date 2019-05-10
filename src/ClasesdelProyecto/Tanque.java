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
public class Tanque extends Vehiculos {
     int ataque=10, defensa=6, punteria=60;
    int tipoV=4;
    String tipoarma="Arma Basica Tanque";
    private String getNombre;
    /**
     * Constructor
     */
    public Tanque()
    {
        hp=50+((nivel-1)*50);
        pp = 5;
        experiencia = 0;
        ataque=10+((nivel-1)*2);
        defensa=6+((nivel-1)*1);
        punteria=60+((nivel-1)*(5/10));
        tipoV=4;
        arma=tipoarma;
    }
   public Tanque(int hp, int pp, int nivel, int xp, String nombre, String arma){
        //super(hp,pp,nivel,xp,nombre,arma);
        super(nombre);
        ataque=10;
        defensa=6;
        punteria=60;
    }
    public Tanque(String nombre){
        super(nombre);
        hp=50;
        pp = 5;
        nivel = 1;
        experiencia = 0;
        ataque=10;
        defensa=6;
        tipoV=4;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
    }

    public String getGetNombre() {
        return getNombre;
    }

    public void setGetNombre(String getNombre) {
        this.getNombre = getNombre;
    }

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

   

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public String getNombre() {
        return nombre;
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

    @Override
    String getVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int getTipoV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setAtaque(int ataque, int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setDefensa(int defensa, int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setPunteria(int punteria, int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
     }
    
    
    
    
     
    
    

