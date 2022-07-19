package api.web.firebase.model;

public class ProductoDTO {

    private String id;
    private String nombre;
    private String precio;
    private String fecha;


    
    public String getNombre() {
        return nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public ProductoDTO() {
    }

    
}
