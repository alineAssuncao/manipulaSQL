# ManipulaSQL
*by Aline Assunção `[Jornada Tech]`*

## Capítulo 1 - Java + CRUD SQL 

**ManipulaSQL** é um projeto em Java para manipulação de banco de dados SQL Server com operações de **CRUD** (Create, Read, Update, Delete). Ele foi desenvolvido seguindo boas práticas de segurança para proteger informações sensíveis, utilizando variáveis de ambiente para configurar credenciais de acesso.

## 💡 Funcionalidades

- Conexão ao SQL Server com variáveis de ambiente para maior segurança.
- Operações de **CRUD** em uma tabela de exemplo  com nome `pessoa`:
  - **Create**: Criação de novos registros.
  - **Read**: Leitura e listagem de registros.
  - **Update**: Atualização de registros existentes.
  - **Delete**: Exclusão de registros.

## ⚙️ Configuração

### Pré-requisitos

- **Java 8+**: Certifique-se de que o JDK está instalado e configurado no seu sistema.
- **SQL Server**: O banco de dados deve estar configurado e acessível.
- **Driver JDBC do SQL Server**: Adicionado como dependência no projeto.
- **Maven** (opcional): Para gerenciar dependências.

### Configuração das Variáveis de Ambiente

Antes de executar o projeto, configure as seguintes variáveis de ambiente:

| Variável         | Descrição                                | Exemplo              |
|-------------------|------------------------------------------|----------------------|
| `DB_USER`         | Nome do usuário do banco de dados        | `sa`                |
| `DB_PASSWORD`     | Senha do banco de dados                 | `SuaSenhaSegura`    |
| `DB_NAME`         | Nome do banco de dados                  | `manipulaSQL`       |
| `DB_URL`          | URL de conexão com o banco (opcional)   | `jdbc:sqlserver://localhost:1433` |

No terminal, você pode configurar as variáveis assim:

#### Windows (PowerShell):
```powershell
$env:DB_USER="sa"
$env:DB_PASSWORD="SuaSenhaSegura"
$env:DB_NAME="manipulaSQL"
```

#### Linux/MacOS:
```
export DB_USER="sa"
export DB_PASSWORD="SuaSenhaSegura"
export DB_NAME="manipulaSQL"
```

### Configuração no IDE

Caso esteja utilizando IntelliJ IDEA ou Eclipse, configure as variáveis de ambiente no ambiente de execução do projeto.

## 🚀 Como Executar
1. Clone o repositório:
   ```
   git clone https://github.com/alineAssuncao/manipulaSQL.git
   cd manipulaSQL
   ```
2. Compile o projeto:
   ```
   javac -d bin src/*.java
   ```
3. Execute o programa:
   ```
   java -cp bin main
   ```

## 🗂️ Estrutura do Projeto
```
manipulaSQL/
│
├── src/
│   ├── connectSQL.java          # Gerencia a conexão com o SQL Server
│   ├── dataBaseDAO.java         # Implementa as operações CRUD
│   └── main.java                # Ponto de entrada para testes
│
├── README.md                    # Documentação do projeto
└── pom.xml                      # Configuração do Maven (se aplicável)
```

## 🔒 Boas Práticas de Segurança
Este projeto foi desenvolvido seguindo as melhores práticas:
- Informações sensíveis (como credenciais) são configuradas através de variáveis de ambiente, evitando vazamento acidental no repositório.
- Uso do `PreparedStatement` para prevenir vulnerabilidades de injeção de SQL.

## 🤝 Contribuição
Contribuições são bem-vindas! Para contribuir:
1. Faça um fork do projeto.
2. Crie uma branch para sua feature:
```
git checkout -b minha-feature
```
3. Commit suas alterações:
```
git commit -m "Adiciona minha nova feature"
```
4. Faça um push da branch:
```
git push origin minha-feature
```
5. Abra um Pull Request no repositório oficial.

## 🛠️ Tecnologias Utilizadas
- Java 8+
- SQL Server
- JDBC
- Maven (opcional)

## 📜 Licença
Este projeto é licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais informações.

## 🌟 Agradecimento Especial 🌟
Quero expressar minha profunda gratidão a todos que tornaram possível a construção deste conteúdo.

✨ À comunidade: Obrigada pelo suporte contínuo, pelas ideias compartilhadas, pela inspiração e por todos os momentos de aprendizado coletivo.

✨ Às pessoas próximas a mim: Obrigada por cada palavra de encorajamento, cada troca de conhecimento e pelo apoio inabalável durante todo o processo.

Este projeto é fruto de colaboração, dedicação e paixão. Sou extremamente grata por cada contribuição, grande ou pequena, que fez toda a diferença. 🌻












