Feature: 03 - Compar Produto Printed Chiffon Dress

Scenario Outline: Para realiza a compra
	Given estou na pagina inicial do site
	When clico no link Entrar
	And realizo login "<email>" "<senha>"
	And preencho campo pesquisa no catalogo "<roupa>"
	And clico no botao de pesquisa
	And seleciono o vestido Chiffon
	And seleciono o tamanho "<tamanho>"
	And seleciono a cor "<cor>"
	And seleciono quantidade "<quantidade>"
	And clico em Adicionar ao carrinho
	And verifico especificacoes da compra "<tamanho>" "<cor>" "<quantidade>"
	Then finalizo compra
	
Examples:
|email              |senha      |roupa               |tamanho|cor	 |quantidade|
|and.teste@gmail.com|4187810420*|Printed Chifon Dress|S      |Amarelo|3         |
	
