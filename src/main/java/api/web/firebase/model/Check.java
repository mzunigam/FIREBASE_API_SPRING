package api.web.firebase.model;

public class Check {

    private String piloto;
    private String placabus;
    private String gas_antes;
    private String gas_despues;
    private String estado;
    private String salon;
    private String observacion;
    
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

    public String getGas_antes() {
        return gas_antes;
    }

    public void setGas_antes(String gas_antes) {
        this.gas_antes = gas_antes;
    }

    public String getGas_despues() {
        return gas_despues;
    }

    public void setGas_despues(String gas_despues) {
        this.gas_despues = gas_despues;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Check() {
    }
}
