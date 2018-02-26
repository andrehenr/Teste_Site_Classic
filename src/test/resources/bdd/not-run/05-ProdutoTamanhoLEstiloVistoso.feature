Feature: 05 - Colocar produto de tamanho L e Estilo Vistoso no carrinho

Scenario Outline: Para realizar a comprar
	Given estou na pagina inicial do site
	When clico em Todos os Produtos
	And filtro por tamanho "<tamanho>"
	And filtro por estilo "<estilo>"
	And clico sobre o produto filtrado
	And seleciono o tamanho "<tamanho>"
	And seleciono a cor "<cor>"
	And seleciono quantidade "<quantidade>"
	And clico em Adicionar ao carrinho
	And verifico especificacoes da compra "<tamanho>" "<cor>" "<quantidade>"
	Then finalizo compra
	
Examples:
|tamanho|estilo |cor  |quantidade|
|L      |Vistoso|Bege |2         |