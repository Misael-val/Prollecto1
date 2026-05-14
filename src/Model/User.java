package Model;

public class User {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String password;

    public User(int id, String nombre,String apellido,String correo,String password,String telefono) 
    
    {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.password = password;
    this.telefono = telefono;
}

    
    
    
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
    	this.correo = correo;
    }
    public String getApellido() {
    	return apellido;
    }
    public void setApellido(String apellido) {
    	this.apellido = apellido;
    }
    public String getTelefono() {
    	return telefono;
    }
    public void setTelefono(String telefono) {
    	this.telefono = telefono;
    }
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}