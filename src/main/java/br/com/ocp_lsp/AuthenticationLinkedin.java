package br.com.ocp_lsp;

public class AuthenticationLinkedin implements Authentication {

    @Override
    public String login(User user) {
    	
        //autêntica o login com o Oauth Linkedin.
        return "Authentication with Linkedin success!";
    }

}
