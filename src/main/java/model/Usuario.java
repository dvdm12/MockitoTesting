package main.java.model;

public class Usuario {
	private String username,password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	

}
