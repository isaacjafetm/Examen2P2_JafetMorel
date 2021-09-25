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
public class Carroceria extends Parte{
    private String tipo;
    private int capacidad;

    public Carroceria() {
        super();
    }

    public Carroceria(String tipo, int capacidad, int tiempo) {
        super(tiempo);
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Carroceria{" + "tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }
    
}
