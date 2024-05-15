package Classes;
        
import static org.junit.Assert.*;
import  org.junit.Test;
import static org.junit.Assert.*;

public class TesteLoginScreen {

	@Test
	public void testSuccessfulLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.login("john", "password123"));
	}

	@Test
	public void testFailedLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertFalse(loginScreen.login("john", "wrongpassword"));
	}

	@Test
	public void testAddUser() {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.addUser("testuser", "testpassword");
		assertTrue(loginScreen.login("testuser", "testpassword"));
	}
}



