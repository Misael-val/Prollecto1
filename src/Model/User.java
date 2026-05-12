package Model;


public class User {

    private int id;
    private String username;
    private String nombreCompleto;

    public User(int id, String username, String nombreCompleto) {

        this.setId(id);
        this.setUsername(username);
        this.setNombreCompleto(nombreCompleto);
    }

    
    
    
    
    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
}


    
  