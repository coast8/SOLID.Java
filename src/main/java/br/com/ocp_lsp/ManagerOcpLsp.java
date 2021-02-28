package br.com.ocp_lsp;


/**
 * 
 *  OCP and LSP complement each other.
 *  the two principles must work together.
 *  
 * */
public class ManagerOcpLsp {
	
    public static void execute() {        
    	Authentication authentication = new AuthenticationLinkedin();
        User user = new User("fulano@email.com", "xxx@123");
        System.out.println("SHOW -> " + authentication.login(user));
    }

}
