package br.com.ocp_lsp;

public class AuthenticationDatabase implements Authentication {
    
	@Override
    public String login(User user) {

        return "Authentication with Database success!";
    }
}
