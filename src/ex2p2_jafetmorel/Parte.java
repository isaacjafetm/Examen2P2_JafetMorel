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
public class Parte {
    private int tiempo;

    public Parte() {
    }

    public Parte(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Parte{" + "tiempo=" + tiempo + '}';
    }
    
}
