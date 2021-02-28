package br.com.srp;

import java.sql.Connection;
import java.util.Properties;

public class SingleResponsabilitySolution {

    private static class ConnectionDAO {

        private Properties connectionProps;
        private Connection conn;

        private static final String URL = "jdbc:mysql://localhost:3306/employee?useSSL=false";

        private ConnectionDAO(String username, String password) {
            connectionProps = new Properties();
            connectionProps.put("user", username);
            connectionProps.put("password", password);
        }

        private Connection createConnection() {
            //Cria conexão com o banco
            return null;
        }
    }
}
