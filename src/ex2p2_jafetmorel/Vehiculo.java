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
public class Vehiculo {
    private String vin, color;
    private Bateria b;
    private Carroceria c;
    private Interior i;
    private Sistema s;
    private Asientos a;

    public Vehiculo() {
    }

    public Vehiculo(String vin, String color, Bateria b, Carroceria c, Interior i, Sistema s, Asientos a) {
        this.vin = vin;
        this.color = color;
        this.b = b;
        this.c = c;
        this.i = i;
        this.s = s;
        this.a = a;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bateria getB() {
        return b;
    }

    public void setB(Bateria b) {
        this.b = b;
    }

    public Carroceria getC() {
        return c;
    }

    public void setC(Carroceria c) {
        this.c = c;
    }

    public Interior getI() {
        return i;
    }

    public void setI(Interior i) {
        this.i = i;
    }

    public Sistema getS() {
        return s;
    }

    public void setS(Sistema s) {
        this.s = s;
    }

    public Asientos getA() {
        return a;
    }

    public void setA(Asientos a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return vin;
    }
    
    
}
