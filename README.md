# TrabalhoWEB2

## Descrição do Projeto
<p>Segundo trabalho da disciplina de Desenvolvimento Web. Adaptar o código do projeto "Editora" acrescentando o processo de login (através do uso do serviço Amazon Cognito) e interface do usuário para os demais chamadas da API com o uso de Thymeleaf.</p>

### Features

- [x] Login usando cognito
- [x] Listar todos os artigos
- [x] Cadastrar artigos 
- [x] Editar artigos
- [x] Remover artigos 
- [x] Excluir todos os artigos

### Instruções de acesso

<p>Acessar o link: http://localhost:8080/secauth<br>
Utilizar o email = vaknakaydu@vusra.com<br>
Utilizar a senha = Teste_123<br>
</p>

### Descrições

<p>-http://localhost:8080/secauth/artigos -> Direciona para a lista de artigos. A tabela de artigos possuí os dados dos artigos, é possível editar ou remover um artigo individualmente utilizando os botões da tabela. Para excluir todos os artigos ou cadastrar novos, deve-se utilizar os botões abaixo da tabela.<br>
-http://localhost:8080/secauth/artigos/novo -> Direciona para o formulário de artigos, utilizado tanto para o cadastro quanto para a edição de artigos.<br> 
-http://localhost:8080/secauth/artigos/{id} -> Utilizado para a edição de artigos.<br> 
-http://localhost:8080/secauth/artigos/excluir/{id} -> Exclusão de um artigo por ID.<br>
-http://localhost:8080/secauth/artigos/excluirtodos -> Exclusão de todos os artigos.
</p>

### Autores
<p>Eliézer da Silva Vaz<br>
Luciano Folmer Gasparello
</p>

