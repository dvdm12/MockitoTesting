package main.java.com.test;



import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import main.java.com.model.Usuario;
import main.java.com.repository.UsuarioRepository;
import main.java.com.service.AutenticacionService;



class AutenticacionServiceTest {

	
	
	private UsuarioRepository repoMock;
    private AutenticacionService autenticacionService;

    @BeforeEach
    void setUp() {
        
        repoMock = Mockito.mock(UsuarioRepository.class);
        
        List<Usuario> userList = Arrays.asList(
                new Usuario("dvd", "dvd"),
                new Usuario("santiago", "1bg_029*")
        );
        
        when(repoMock.getAllUsers()).thenReturn(userList);
        
        when(repoMock.findUserByCredentials("dvd", "dvd")).thenReturn(userList.get(0));
        

        autenticacionService = new AutenticacionService(repoMock);
    }
    
    

    @DisplayName("let's try authentication service")
    @Test
    void testAuthenticateTrue() {
        Boolean result = autenticacionService.authenticate("dvd", "dvd");
        assertEquals(true, result);
    }
    
    @DisplayName("let's try authentication service")
    @Test
    void testAuthenticateFalse() {
        Boolean result = autenticacionService.authenticate("1234", "dvd");
        assertFalse(result);
    }
    

    @DisplayName("let's find out an exception in code")
    @Test
    void testAuthenticateException() {
        assertThrows(NullPointerException.class, () -> {
            autenticacionService.authenticate(null, null);
        });
    }
	

}


