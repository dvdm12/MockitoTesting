package main.java.com.repository;

import java.util.Arrays;
import java.util.List;

import main.java.com.model.Usuario;

public class UsuarioRepository {
	
	public Usuario findUserByCredentials(String username, String password)  {
		
		return getAllUsers()
				.stream()
				.filter(user->user.getUsername().equals(username) 
						&& user.getPassword().equals(password))
				.findFirst()
				.orElseThrow(()->new NullPointerException("It has not found out an user"));
	}
	
	
	public List<Usuario> getAllUsers(){
		List<Usuario> usuarios = Arrays.asList(
	            new Usuario("johndoe", "P@ssw0rd123"),
	            new Usuario("janedoe", "Qwerty2024!"),
	            new Usuario("bobby123", "LetMeIn@2024"),
	            new Usuario("alice_w", "H0l@Alice!"),
	            new Usuario("bob_smith", "Smithy2024#"),
	            new Usuario("carol_j", "C@r0l_2024"),
	            new Usuario("david_21", "D@v1d_!23"),
	            new Usuario("eve99", "Eve$ecure98"),
	            new Usuario("frank_d", "Fr@nkD_1234"),
	            new Usuario("grace_hello", "Gr@c3_!2024"),
	            new Usuario("harry_p", "H@rryP4ss"),
	            new Usuario("iris_44", "Iris$44!2024"),
	            new Usuario("johnny_x", "J0hnnyX_!23"),
	            new Usuario("karen_m", "K@renM_2024"),
	            new Usuario("luke_sky", "Luk3!_Sky2024"),
	            new Usuario("mia_k", "M!aK_#2024"),
	            new Usuario("noah123", "Noah_1234!"),
	            new Usuario("olivia_s", "0l1vi@_2024"),
	            new Usuario("peter_c", "P3t3r_C0rrec7"),
	            new Usuario("quinn_b", "Quinn_B@2024"),
	            new Usuario("rachel_2024", "R@ch3l_2024"),
	            new Usuario("sammy_x", "S@mmY!_X"),
	            new Usuario("tina_01", "T1na_2024!"),
	            new Usuario("uma_s", "Um@S3cr3t"),
	            new Usuario("victor_j", "V1ct0r_J@2024"),
	            new Usuario("wendy_2", "W3ndy_@2024"),
	            new Usuario("xander_1", "X@nd3r!_2024"),
	            new Usuario("yara_2024", "Y@r@2024!"),
	            new Usuario("zachary_3", "Z@ch@rY_2024"),
	            new Usuario("amelia_m", "Am3l!@_2024"),
	            new Usuario("brandon_01", "Br@nd0n!_2024"),
	            new Usuario("cindy_22", "C!ndy_2024"),
	            new Usuario("derek_!23", "D3r3k!_2024"),
	            new Usuario("emily_a", "3m1ly_@2024"),
	            new Usuario("felix_33", "F3l1x_2024!"),
	            new Usuario("gwen_s", "Gw3n_S@2024"),
	            new Usuario("harry_5", "H@rry_5@2024"),
	            new Usuario("isabel_04", "1s@b3l_2024"),
	            new Usuario("jake_r", "J@k3_R_2024"),
	            new Usuario("katie_2", "K@ti3_2024!"),
	            new Usuario("leo_b", "L30_2024!"),
	            new Usuario("maggie_12", "M@gG13_2024"),
	            new Usuario("nina_03", "N1n@_2024"),
	            new Usuario("oliver_44", "0l1v3r_2024"),
	            new Usuario("paul_k", "P@ulK_2024"),
	            new Usuario("quincy_1", "Qu!ncY_2024")
	        );
		
		return usuarios;
	}
}
