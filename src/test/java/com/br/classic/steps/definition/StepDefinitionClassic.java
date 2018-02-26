package com.br.classic.steps.definition;

import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;

import com.br.classic.steps.business.StepBusinessClassic;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionClassic {

	@Steps
	StepBusinessClassic stepB;

	@Given("^estou na pagina inicial do site$")
	public void paginaIncialDoSite() {
		stepB.openHome("http://10.1.10.133:8080/br/");
	}

	@When("^clico no link Entrar$")
	public void clicoLinkEntrar() {
		stepB.clicarNoLinkEntrar();
	}

	@When("^clico no link Não tem uma conta\\? Crie uma aqui$")
	public void clicoLinkPaginaCriarConta() {
		stepB.clicarNoLinkPaginaCriarConta();
	}

	@When("^escolho o genero do usuario \"([^\"]*)\"$")
	public void escolhoGeneroUsuario(Integer genero) {
		stepB.escolherGeneroUsuario(genero);
	}

	@When("^preencho nome do usuario \"([^\"]*)\"$")
	public void preenchoNomeUsuario(String nome) {
		stepB.preencherNomeUsuario(nome);
	}

	@When("^preencho sobrenome do usuario \"([^\"]*)\"$")
	public void preenchoSobrenomeUsuario(String sobrenome) {
		stepB.preencherSobrenomeUsuario(sobrenome);
	}

	@When("^preencho email do usuario \"([^\"]*)\"$")
	public void preenchoEmailUsuario(String email) {
		stepB.preencherEmailUsuario(email);
	}

	@When("^preencho data nascimento do usuario \"([^\"]*)\"$")
	public void preenchoDataNascimentoUsuario(String dataNascimento) {
		stepB.preencherDataNascimentoUsuario(dataNascimento);
	}

	@When("^seleciono receber ofertas \"([^\"]*)\"$")
	public void selecionoReceberOfertas(boolean receberOfertas) {
		stepB.selecionarReceberOfertas(receberOfertas);
	}

	@When("^seleciono receber noticias \"([^\"]*)\"$")
	public void selecionoReceberNoticias(boolean receberNoticias) {
		stepB.selecionarReceberNoticias(receberNoticias);
	}

	@When("^preencho senha do usuario \"([^\"]*)\"$")
	public void preencherSenhaUsuario(String senha) {
		stepB.preencherSenhaUsuario(senha);
	}

	@When("^clico em Salvar$")
	public void clicarEmSalvar() {
		stepB.clicarEmSalvar();
	}

	@Then("^valido usuario criado \"([^\"]*)\"$")
	public void validoUsuarioCriado(String nomeCompleto) {
		Assert.assertTrue(stepB.validarUsuario(nomeCompleto));
	}

	@When("^clico no link perfil$")
	public void clicoLinkPerfil() {
		stepB.clicarLinkPerfil();
	}

	@When("^clico na opcao de Informacao$")
	public void clicoNaOpcaoInformacao() {
		stepB.clicarOpcaoInformacao();
	}

	@When("^preencho nova senha do usuario \"([^\"]*)\"$")
	public void preencherNovaSenha(String novaSenha) {
		stepB.preencherNovaSenha(novaSenha);
	}

	@Then("^valido atualizacao realizada com sucesso$")
	public void validarAtualizacaoRealizada() {
		Assert.assertTrue(stepB.validarInformacoesAtualizadas());
	}
	
	@When("^realizo login \"([^\"]*)\" \"([^\"]*)\"$")
	public void realizoLogin(String email, String senha) {
		stepB.realizarLogin(email,senha);
	}
	
	@When("^preencho campo pesquisa no catalogo \"([^\"]*)\"$")
	public void preenchoCampoPesquisa(String roupaPesquisada) {
		stepB.preencherCampoPesquisa(roupaPesquisada);
	}

	@When("^clico no botao de pesquisa$")
	public void clicoBotaoPesquisa(){
		stepB.clicarBotaoPesquisa();
	}
	
	@When("^seleciono o vestido Chiffon$")
	public void selecionoVestidoChiffon() {
		stepB.selecionarVestidoChiffon();
	}

	@When("^seleciono o tamanho \"([^\"]*)\"$")
	public void selecionoTamanhoVestido(String tamanho){
		stepB.selecionarTamanho(tamanho);
	}

	@When("^seleciono a cor \"([^\"]*)\"$")
	public void selecionoCorvestido(String cor){
		stepB.selecionarCor(cor);
	}
	
	@When("^seleciono quantidade \"([^\"]*)\"$")
	public void selecionoQuantidade(int qtd) {
		stepB.selecionarQuantidade(qtd);
	}

	@When("^clico em Adicionar ao carrinho$")
	public void clicoEmAdicionarCarrinho(){
		stepB.clicarAddCarrinho();
	}
	
	@When("^verifico especificacoes da compra \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void verificoEspecificacoesCompra(String tamanho, String cor, Integer quantidade){
	    Assert.assertTrue(stepB.verificarEspecificacoesCompra(tamanho,cor,quantidade));
	}

	@Then("^finalizo compra$")
	public void finalizoCompra(){
		stepB.finalizarCompra();
	}
	
	@When("^clico em Todos os Produtos$")
	public void clicoTodosProdutos(){
		stepB.clicarLinkTodosProdutos();
	}

	@When("^filtro a cor \"([^\"]*)\"$")
	public void filtroPorCor(String cor){
		stepB.filtrarPorCor(cor);
	}

	@When("^seleciono o produto que aparece$")
	public void seleciono_o_produto_que_aparece(){
		stepB.selecionarVestidoChiffon();
	}
	
	@When("^filtro por tamanho \"([^\"]*)\"$")
	public void filtroTamanho(String tamanho){
		stepB.filtrarPorTamanho(tamanho);
	}

	@When("^filtro por estilo \"([^\"]*)\"$")
	public void filtroEstilo(String estilo){
		stepB.filtrarPorEstilo(estilo);
	}

	@When("^clico sobre o produto filtrado$")
	public void clicoSobreProdutoFiltrado(){
		stepB.clicarSobreProdutoFiltrado();
	}
	
	@When("^filtro por preco \"([^\"]*)\"$")
	public void filtroPorPreco(String preco){
		stepB.filtrarPorPreco(preco);
	}

	@When("^limpo todos os filtros$")
	public void limpoTodosOsFiltros(){
		stepB.clicarBotaoLimparFiltros();
	}
	
	@Then("^verifico ausencia de filtros$")
	public void verificoAusenciaFiltros(){
		Assert.assertTrue(stepB.verificarAusenciaFiltros());
	}
	
	@When("^filtro por composicao \"([^\"]*)\"$")
	public void filtroPorComposicao(String composicao){
		stepB.filtrarPorComposicao(composicao);
	}

	@When("^retiro filtro \"([^\"]*)\"$")
	public void retiroFiltro(String filtro) {
		stepB.retirarFiltro(filtro);
	}

	@Then("^verifico quantidade de filtros \"([^\"]*)\"$")
	public void verificoQuantidadeFiltros(int qtdFiltros) {
	    Assert.assertTrue(stepB.verificarQuantidadeFiltros(qtdFiltros));
	}
	
	@When("^clico no botao de ordenacao$")
	public void clicoBotaoOrdenacao(){
		stepB.clicarBotaoOrdenacao();
	}
	
	@When("^seleciono o tipo de ordenacao \"([^\"]*)\"$")
	public void selecionoTipoOrdenacao(String tipoOrdenacao){
		stepB.selecionarTipoOrdenacao(tipoOrdenacao);
	}
	
	@When("^passo mouse sobre Women$")
	public void passoMouseSobreWomen(){
		stepB.passarMouseSobreWomen();
	}

	@When("^clico no link Tshirts$")
	public void clicoLinkTshirts(){
		stepB.clicarLinkTshirts();
	}
	
	@When("^clico no link Fale Conosco$")
	public void clicoLinkFaleConosco(){
		stepB.clicarLinkFaleConosco();
	}

	@When("^seleciono assunto \"([^\"]*)\"$")
	public void selecionoAssunto(String assunto){
		stepB.selecionarAssunto(assunto);
	}

	@When("^preencho campo de mensagem \"([^\"]*)\"$")
	public void preenchoCampoMensagem(String mensagem){
		stepB.preencherCampoMensagem(mensagem);
	}

	@When("^clico no botao enviar$")
	public void clico_no_botao_enviar(){
		stepB.clicarEmEnviar();
	}

	@Then("^valido mensagem de envio com sucesso$")
	public void validoMensagemEnvioComSucesso(){
		Assert.assertTrue(stepB.verificarMensagemDeEnvio());
	}

	

}
