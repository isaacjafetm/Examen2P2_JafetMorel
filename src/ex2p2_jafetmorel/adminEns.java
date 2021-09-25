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
public class adminEns {
    private ArrayList<Ensamblador> listaPersonas = new ArrayList();
    private File archivo = null;

    public adminEns(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Ensamblador> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Ensamblador> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }

    //extra mutador
    public void setPersona(Ensamblador p) {
        this.listaPersonas.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Ensamblador t : listaPersonas) {
                bw.write(t.getId()+";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getGenero() + ";");                
                bw.write(t.getEdad() + ";");
                bw.write(t.getCantidad() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersonas.add(new Ensamblador(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
