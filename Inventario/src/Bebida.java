
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbas
 */
public class Bebida extends Producto {
    private int volumen;
    ArrayList<Bebida> listaBebidas = new ArrayList();

    public ArrayList<Bebida> getListaBebidas() {
        return listaBebidas;
    }

    public void setListaBebidas(ArrayList<Bebida> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    @Override
    public String mostrarInformacion() {
    String informacion = super.mostrarInformacion();
    informacion += "\nVolumen: " + volumen;
    return informacion;
}
}
