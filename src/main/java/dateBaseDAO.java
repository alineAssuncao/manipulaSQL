import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dateBaseDAO {
    //CRUD

    //[C]Função para criar (INSERT)
    public void insertDAO(String tabela, int id, String nome){
        String insert = "INSERT into " + tabela + "(id, nome) VALUES (?, ?)";
        try(Connection connection = new connectSQL().connectSQL();
            PreparedStatement stmt = connection.prepareStatement(insert)){
            stmt.setInt(1, id);
            stmt.setString(2, nome);
            stmt.executeUpdate();
            System.out.println("Populando dados: ");
            System.out.println(tabela + " criada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao popular os dados da tabela: " + tabela + ".");
            e.printStackTrace();
        }
    }

    //[R]Função para consultar (SELECT)
    public void readDAO(String tabela) throws SQLException {
        String sql = "SELECT id, nome FROM pessoa";
        try(Connection connection = new connectSQL().connectSQL();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

            System.out.println("Listando tabela " + tabela + ": ");
            // Exibindo os resultados da consulta
            while (rs.next()) {
                // Exemplo: suponha que a tabela tenha colunas "id" e "nome"
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }
        } catch (SQLException e){
            System.err.println("Erro ao realizar a consulta");
            e.printStackTrace();
        }
    }

    //[U]Função para editar (UPDATE)
    public void updateDAO(int id, String novoNome){
        String sql = "UPDATE pessoa SET nome = ? WHERE id = ?";
        try (Connection connection = new connectSQL().connectSQL();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, novoNome);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Pessoa atualizada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao editar pessoa.");
            e.printStackTrace();
        }
    }

    //[D]Função para excluir (DELETE)
    public void deleteDAO(int id){
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try (Connection connection = new connectSQL().connectSQL();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Pessoa excluída com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir pessoa.");
            e.printStackTrace();
        }
    }
}
