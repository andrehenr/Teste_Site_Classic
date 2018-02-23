Feature: Colocar no carrinho produto da cor Verde

Scenario Outline: Para colocar os produtos da cor verde
	Given estou na pagina inicial do site
	When clico em Todos os Produtos
	And filtro a cor "<cor>"
	And seleciono o produto que aparece
	And seleciono o tamanho do vestido "<tamanho>"
	And seleciono a cor do vestido "<cor>"
	And seleciono quantidade "<quantidade>"
	And clico em Adicionar ao carrinho
	And verifico especificacoes da compra "<tamanho>" "<cor>" "<quantidade>"
	Then finalizo compra
	
Examples:
|cor  |tamanho |quantidade|
|Verde|L       |2         |