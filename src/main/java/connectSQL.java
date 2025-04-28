import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectSQL {
    public Connection connectSQL(){
        String dbName = System.getenv("SQLDB_NAME");
        String user = System.getenv("SQLDB_USER");
        String password = System.getenv("SQLDB_PASSWORD");
        String url = "jdbc:sqlserver://localhost:1433;databaseName="+dbName+";encrypt=true;trustServerCertificate=true";

        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("\nConexão bem-sucedida");
            return connection;
        } catch (SQLException e){
            System.err.println("Erro ao conectar ao banco de dados");
            e.printStackTrace();
            return null;
        }
    }
}
