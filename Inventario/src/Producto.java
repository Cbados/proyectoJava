



public class Producto {
    private String nombre;
    private int id;
    private String fechaVen;
    private int cantidadStock;
    private double precio;
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public String mostrarInformacion() {
        String informacion = "";
        informacion += "Nombre: " + nombre;
        informacion += "\nId: " + id;
        informacion += "\nFecha de Vencimiento: " + fechaVen;
        informacion += "\nCantidad Stock: " + cantidadStock;
        return informacion;
       
    }
}
