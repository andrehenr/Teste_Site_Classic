Feature: 07 -  Filtrar produtos por preco e depois retirar todos os filtros

Scenario Outline: Para executar o filtro 
	Given estou na pagina inicial do site
	When clico em Todos os Produtos
	And filtro por preco "<preco>"
	And limpo todos os filtros
	Then verifico ausencia de filtros
	
Examples:
|preco            |
|R$25,00 - R$38,00|