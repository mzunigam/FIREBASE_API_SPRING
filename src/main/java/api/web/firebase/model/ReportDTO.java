package api.web.firebase.model;

public class ReportDTO {
    private String id;
    private String piloto;
    private String placabus;
    private String detalle;
    private String ubicacion;
    private String hora;
    private String sistema;
    private String velocidad;
    
    public ReportDTO() {
    }

    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    public String getPlacabus() {
        return placabus;
    }
    public void setPlacabus(String placabus) {
        this.placabus = placabus;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getSistema() {
        return sistema;
    }
    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    public String getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}
