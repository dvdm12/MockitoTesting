package main.java.service;

import java.util.function.Predicate;

import main.java.model.Usuario;
import main.java.repository.UsuarioRepository;

public class AutenticacionService {
	private UsuarioRepository usuarioRepository;

	public AutenticacionService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public UsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	/**
	 * Authenticates a user based on the provided username and password.
	 * <p>
	 * This method uses a predicate to check if the user object retrieved from the repository is not null.
	 * It returns {@code true} if the user object is found (i.e., not null), indicating successful authentication.
	 * It returns {@code false} if the user object is null, indicating that the authentication failed.
	 * </p>
	 *
	 * @param username the username of the user to be authenticated
	 * @param password the password of the user to be authenticated
	 * @return {@code true} if the user with the provided username and password is found and not null;
	 *         {@code false} otherwise.
	 */
	public boolean authenticate(String username, String password) {
		Predicate<Usuario> isNotNull = obj-> obj!=null;
		return isNotNull.test(getUsuarioRepository()
				.findUserByCredentials(username, password));
	}
	
}
