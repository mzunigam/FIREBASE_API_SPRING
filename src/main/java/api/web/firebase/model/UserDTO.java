package api.web.firebase.model;

public class UserDTO {
    private String id;
    private String usuario;
    private String password;
    private String privilegio = "USER";
    
    public UserDTO() {
    }
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPrivilegio() {
        return privilegio;
    }
    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    

}
