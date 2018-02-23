Feature: Filtrar por tamanho e composicao e depois retirar o filtro de tamanho

Scenario Outline: Para realizar a tarefa
	Given estou na pagina inicial do site
	When clico em Todos os Produtos
	And filtro por tamanho "<tamanho>"
	And filtro por composicao "<composicao>"
	And retirar filtro "<filtro>"
	Then verifico quantidade de filtros "<quantidade_filtros>"
	
Examples:
|tamanho|composicao|filtro |quantidade_filtros|
|S      |Algodão   |Tamanho|1                 |