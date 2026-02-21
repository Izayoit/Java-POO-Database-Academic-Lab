package Modelo_mantenimiento;

public class usuario {
    private int iduser;
    private String Nombre;
    private String email;
    private String password;
    public usuario(){
        
    }
    
    public usuario(Object[] Registro){
        iduser = Integer.parseInt(Registro[0].toString());
        Nombre = Registro[1].toString();
        email = Registro[2].toString();
        password = Registro[3].toString();
    }
    
    public Object[] getRegistro(){
        return new Object[]{iduser,Nombre,email,password};
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

  
    
}
