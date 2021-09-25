/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2p2_jafetmorel;

/**
 *
 * @author 24661
 */
public class Sistema extends Parte{
    private int pantallas;
    private boolean visor;
    private int ancho;

    public Sistema() {
        super();
    }

    
    public Sistema(int pantallas, boolean visor, int ancho, int tiempo) {
        super(tiempo);
        this.pantallas = pantallas;
        this.visor = visor;
        this.ancho = ancho;
    }

    public int getPantallas() {
        return pantallas;
    }

    public void setPantallas(int pantallas) {
        this.pantallas = pantallas;
    }

    public boolean isVisor() {
        return visor;
    }

    public void setVisor(boolean visor) {
        this.visor = visor;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Sistema{" + "pantallas=" + pantallas + ", visor=" + visor + ", ancho=" + ancho + '}';
    }
    
}
