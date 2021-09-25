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
public class Orden {
    private Vehiculo v;
    private Ensamblador e;

    public Orden() {
    }

    public Orden(Vehiculo v, Ensamblador e) {
        this.v = v;
        this.e = e;
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public Ensamblador getE() {
        return e;
    }

    public void setE(Ensamblador e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Orden{" + "v=" + v + ", e=" + e + '}';
    }
    
}
