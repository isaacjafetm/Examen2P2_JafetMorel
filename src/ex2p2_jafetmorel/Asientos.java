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
public class Asientos extends Parte{
    private String material;
    private boolean elec, masaje;

    public Asientos() {
        super();
    }

    public Asientos(String material, boolean elec, boolean masaje, int tiempo) {
        super(tiempo);
        this.material = material;
        this.elec = elec;
        this.masaje = masaje;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isElec() {
        return elec;
    }

    public void setElec(boolean elec) {
        this.elec = elec;
    }

    public boolean isMasaje() {
        return masaje;
    }

    public void setMasaje(boolean masaje) {
        this.masaje = masaje;
    }

    @Override
    public String toString() {
        return "Asientos{" + "material=" + material + ", elec=" + elec + ", masaje=" + masaje + '}';
    }
    
}
