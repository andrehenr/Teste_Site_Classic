Feature: Alterar senha de um usuario

Scenario Outline: Para alterar a senha de um usuario
	Given estou na pagina inicial do site
	When clico no link Entrar
	And clico no link Não tem uma conta? Crie uma aqui
	And escolho o genero do usuario "<genero>"
	And preencho nome do usuario "<nome>"
	And preencho sobrenome do usuario "<sobrenome>"
	And preencho email do usuario "<email>"
	And preencho senha do usuario "<senha>"
	And preencho data nascimento do usuario "<data_nascimento>"
	And seleciono receber ofertas "<ofertas>"
	And seleciono receber noticias "<noticias>"
	And clico em Salvar
	Then valido usuario criado "<nome> <sobrenome>"
	And clico no link perfil
	And clico na opcao de Informacao
	And preencho senha do usuario "<senha>"
	And preencho nova senha do usuario "<nova_senha>"
	And clico em Salvar
	Then valido atualizacao realizada com sucesso
	
	
Examples:
|genero|nome |sobrenome |email             |senha       |data_nascimento|ofertas|noticias|nova_senha   |
|0     |Joao |Paulo     |teste@teste.com.br|TesteRSI2202|2000-03-15     |false  |true    |TesteRSI22202|