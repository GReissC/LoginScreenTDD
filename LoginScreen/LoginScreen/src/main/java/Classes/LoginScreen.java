package Classes;


// Importe das bibliotecas utilizadas
import java.util.HashMap;
import java.util.Map;

public class LoginScreen {

	// Declarar uma variável de membro privada para armazenar nomes de usuário e
	// senhas
	private Map<String, String> userDatabase = new HashMap<>();

    //Construtor para a classe LoginScreen
   //Este método é chamado automaticamente quando um novo objeto LoginScreen é criado
	public LoginScreen() {
		// Adicionar alguns usuários predefinidos ao banco de dados de usuários durante a inicialização

		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}

	/**
	 * Este método tenta entrar em um usuário com base no seu nome de usuário e senha.
	 * @param username de usuário O nome do usuário que tenta fazer login (String)
	 * @param password A senha introduzida pelo usuário (String)
	 * @return verdadeiro se o login for bem-sucedido, falso caso contrário (boolean)
	 */
	public boolean login(String username, String password) {
		// Verifique se o nome de usuário existe no banco de dados de usuários
		if (userDatabase.containsKey(username)) {
			// Se o nome de usuário existir, recuperar a senha armazenada para esse usuário
			String storedPassword = userDatabase.get(username);
			// Compare a senha armazenada com a palavra-passe fornecida
			if (storedPassword.equals(password)) {
				// Se as senhas correspondem, devolva true indicando um login bem-sucedido
				return true;
			}
		}
		// Se o nome de usuário não for encontrado ou as senhas não correspondem, devolva falso
		// indicando um login falhado
		return false;
	}
}