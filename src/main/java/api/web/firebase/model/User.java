package api.web.firebase.model;

public class User {
    
    private String usuario;
    private String password;
    private String privilegio = "USER";
    
    public User() {
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

    @Override
    public String toString() {
        return "User [password=" + password + ", privilegio=" + privilegio + ", usuario=" + usuario + "]";
    }

    


}
