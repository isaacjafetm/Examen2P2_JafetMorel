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
public class Bateria extends Parte{
    private int auton;
    private String mater;

    public Bateria() {
        super();
    }

    public Bateria(int auton, String mater, int tiempo) {
        super(tiempo);
        this.auton = auton;
        this.mater = mater;
    }

    public int getAuton() {
        return auton;
    }

    public void setAuton(int auton) {
        this.auton = auton;
    }

    public String getMater() {
        return mater;
    }

    public void setMater(String mater) {
        this.mater = mater;
    }

    @Override
    public String toString() {
        return "Bateria{" + "auton=" + auton + ", mater=" + mater + '}';
    }
    
}
