package com.br.classic.steps.business;

import java.util.UUID;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.br.classic.pages.PageObjectClassClassic;

import io.openbdt.element.WebBrowserScreenElement;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessClassic {

	PageObjectClassClassic page;
	// private static Logger LOG = Logger.getLogger(StepBusinessClassic.class);

	@Autowired
	private WebBrowserScreenElement viewElement;

	@Step
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	public void clicarNoLinkEntrar() {
		viewElement.click(page.getLinkEntrar());
	}

	public void clicarNoLinkPaginaCriarConta() {
		viewElement.click(page.getLinkCriarConta());
	}

	public void escolherGeneroUsuario(Integer genero) {
		viewElement.click(page.getRadiosGeneros().get(genero));
	}

	public void preencherNomeUsuario(String nome) {
		viewElement.sendText(page.getCampoFirstName(), nome);
	}

	public void preencherSobrenomeUsuario(String sobrenome) {
		viewElement.sendText(page.getCampoLastName(), sobrenome);
	}

	public void preencherEmailUsuario(String email) {
		viewElement.sendText(page.getCampoEmail(),
				email.split("@")[0] + UUID.randomUUID().toString() + "@" + email.split("@")[1]);
	}

	public void preencherDataNascimentoUsuario(String dataNascimento) {
		viewElement.sendText(page.getCampoBirthday(), dataNascimento);
	}

	public void selecionarReceberOfertas(boolean receberOfertas) {
		if (receberOfertas) {
			viewElement.click(viewElement.findElement(page.getCheckReceberPromocoes()));
		}
	}

	public void selecionarReceberNoticias(boolean receberNoticias) {
		if (receberNoticias)
			viewElement.click(viewElement.findElement(page.getCheckNewsletter()));
	}

	public void preencherSenhaUsuario(String senha) {
		viewElement.sendText(page.getCampoPassword(), senha);
	}

	public void clicarEmSalvar() {
		viewElement.click(page.getBotaoSalvar());
	}

	public boolean validarUsuario(String nomeCompleto) {
		return page.getNomeUsuarioCriado().getText().equals(nomeCompleto);
	}

	public void clicarLinkPerfil() {
		viewElement.click(page.getLinkPerfilUsuario());
	}

	public void clicarOpcaoInformacao() {
		viewElement.click(page.getLinkPaginaInformacao());
	}

	public void preencherNovaSenha(String novaSenha) {
		viewElement.sendText(page.getCampoNovaSenha(), novaSenha);
	}

	public boolean validarInformacoesAtualizadas() {
		return page.getMensagemAlteracaoPerfil().getText().equals("Informações atualizadas com sucesso.");
	}

	public void realizarLogin(String email, String senha) {
		viewElement.sendText(page.getCampoEmail(), email);
		viewElement.sendText(page.getCampoPassword(), senha);
		viewElement.click(page.getBotaoEntrar());
	}

	public void preencherCampoPesquisa(String roupaPesquisada) {
		viewElement.sendText(page.getCampoBusca(), roupaPesquisada);
	}

	public void clicarBotaoPesquisa() {
		viewElement.click(page.getBotaoPesquisa());
	}

	public void selecionarVestidoChiffon() {
		viewElement.click(page.getImagemVestidoChiffon());
	}

	public void selecionarTamanho(String tamanho) {
		viewElement.selectByVisibleText(page.getSelectTamanhoVestido(), tamanho);
	}

	public void selecionarCor(String cor) {
		page.getListaCoresVestido().forEach(element -> {
			if (element.getText().contains(cor)) {
				element.findElement(By.tagName("input")).click();
			}
		});
	}

	public void selecionarQuantidade(Integer qtd) {
		viewElement.clear(page.getCampoQuantidadeVestidos());
		viewElement.sendText(page.getCampoQuantidadeVestidos(), qtd.toString());
	}

	public void clicarAddCarrinho() {
		viewElement.click(page.getBotaoAdicionarCarrinho());
	}

	public void finalizarCompra() {
		viewElement.click(page.getLinkFinalizarPedido());
	}

	public boolean verificarEspecificacoesCompra(String tamanho, String cor, Integer quantidade) {
		String conteudoCompra = page.getInformacoesProduto().getText();
		return conteudoCompra.contains("Tamanho: " + tamanho) && conteudoCompra.contains("Cor: " + cor)
				&& conteudoCompra.contains("Quantidade: " + quantidade.toString());
	}

	public void clicarLinkTodosProdutos() {
		viewElement.click(page.getLinkTodosProdutos());
	}

	public void filtrarPorCor(String cor) {
		page.getListaCores().forEach(elemento -> {
			if (elemento.getText().contains(cor)) {
				viewElement.click(elemento);
			}
		});
	}

	public void filtrarPorTamanho(String tamanho) {
		page.getListaTamanhos().forEach(elemento -> {
			if (elemento.getText().contains(tamanho)) {
				viewElement.click(elemento);
			}
		});
	}

	public void filtrarPorEstilo(String estilo) {
		page.getListaEstilos().forEach(elemento -> {
			if (elemento.getText().contains(estilo)) {
				viewElement.click(elemento);
			}
		});
	}

	public void clicarSobreProdutoFiltrado() {
		viewElement.click(page.getListaProdutos().get(0));
	}

	public void clicarBotaoLimparFiltros() {
		viewElement.click(page.getBotaoLimparFiltros());
	}

	public void filtrarPorPreco(String preco) {
		page.getListaPrecos().forEach(elemento -> {
			if(elemento.getText().contains(preco)){
				viewElement.click(elemento);
			}
		});
	}

	public boolean verificarAusenciaFiltros() {
		return page.getListaDeFiltros().isEmpty();
	}

	public void filtrarPorComposicao(String composicao) {
		page.getListaComposicoes().forEach(elemento -> {
			if(elemento.getText().contains(composicao)){
				viewElement.click(elemento);
			}
		});
	}

}
