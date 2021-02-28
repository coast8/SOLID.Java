package br.com.ocp_lsp;

public class AuthenticationFacebook implements Authentication {

    @Override
    public String login(User user) {
    	
        //autêntica o login com o Oauth Facebook.
        return "Authentication with Facebook success!";
    }
}
