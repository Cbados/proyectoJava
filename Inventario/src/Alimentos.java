
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbas
 */
public class Alimentos extends Producto{
    private String perecedero;
    ArrayList<Alimentos> listaAlimentos = new ArrayList();

    public ArrayList<Alimentos> getListaAlimentos() {
        return listaAlimentos;
    }

    public void setListaAlimentos(ArrayList<Alimentos> listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }

    public String getPerecedero() {
        return perecedero;
    }

    public void setPerecedero(String perecedero) {
        this.perecedero = perecedero;
    }

   
    @Override
    public String mostrarInformacion() {
    String informacion = super.mostrarInformacion();
    informacion += "\nPerecedero: " + perecedero;
    return informacion;
}

}
