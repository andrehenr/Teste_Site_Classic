Feature: Realizar um novo cadastro

Scenario Outline: Para realizar o cadastro
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
	
Examples:
|genero|nome |sobrenome |email             |senha       |data_nascimento|ofertas|noticias|
|0     |Andre|Henrique  |teste@teste.com.br|TesteRSI2202|1999-12-31     |true   |true    |