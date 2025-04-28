public class main {
    public static void main(String[] args) throws Exception{
        int id  = 3;
        String nome = "Aline";
        String novoNome = "Aline Modificado";
        String tabela = "pessoa";

        dateBaseDAO dados = new dateBaseDAO();

        //Testando o CRUD
        dados.insertDAO(tabela, id, nome);
        dados.readDAO(tabela);
        dados.updateDAO(id, novoNome);
        dados.readDAO(tabela);
        dados.deleteDAO(id);
        dados.readDAO(tabela);
    }
}
