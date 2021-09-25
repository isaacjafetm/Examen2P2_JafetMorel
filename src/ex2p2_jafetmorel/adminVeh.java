/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2p2_jafetmorel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 24661
 */
public class adminVeh {
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList();
    private File archivo = null;

    public adminVeh(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaPersonas(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        return "listaVehiculos=" + listaVehiculos;
    }

    //extra mutador
    public void setVehiculo(Vehiculo p) {
        this.listaVehiculos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Vehiculo t : listaVehiculos) {
                bw.write(t.getVin()+";");
                bw.write(t.getColor() + ";");
                bw.write(t.getB().getAuton() + ";"+t.getB().getMater() + ";"+t.getB().getTiempo() + ";");                
                bw.write(t.getC().getTipo() + ";"+t.getC().getCapacidad() + ";"+t.getC().getTiempo() + ";");
                bw.write(t.getI().getMaterial() + ";"+t.getI().getVolante() + ";"+t.getI().getBotones() + ";"+t.getI().getTiempo() + ";");
                bw.write(t.getS().getPantallas()+";"+t.getS().isVisor()+";"+t.getS().getAncho()+";"+t.getS().getTiempo()+";");
                bw.write(t.getA().getMaterial()+";"+t.getA().isElec()+";"+t.getA().isMasaje()+";"+t.getA().getTiempo()+";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaVehiculos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaVehiculos.add(new Vehiculo(sc.next(),sc.next(),new Bateria(sc.nextInt(),sc.next(),sc.nextInt()), new Carroceria(sc.next(),sc.nextInt(),sc.nextInt()), new Interior(sc.next(),sc.next(),sc.nextInt(),sc.nextInt()), new Sistema(sc.nextInt(),sc.next().equalsIgnoreCase("true"),sc.nextInt(),sc.nextInt()), new Asientos(sc.next(),sc.next().equalsIgnoreCase("true"),sc.next().equalsIgnoreCase("true"),sc.nextInt())));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
