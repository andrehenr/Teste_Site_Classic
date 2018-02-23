package com.br.classic.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassClassic extends PageObject {

	@FindBy(xpath = "//a[@title='Entrar com sua conta de cliente']")
	private WebElement linkEntrar;

	@FindBy(partialLinkText = "Não tem uma conta? Crie uma aqui")
	private WebElement linkCriarConta;

	@FindBy(xpath = "//span[@class='custom-radio']")
	private List<WebElement> radiosGeneros;

	@FindBy(name = "firstname")
	private WebElement campoFirstName;

	@FindBy(name = "lastname")
	private WebElement campoLastName;

	@FindBy(name = "email")
	private WebElement campoEmail;

	@FindBy(name = "password")
	private WebElement campoPassword;

	@FindBy(name = "birthday")
	private WebElement campoBirthday;
	private By checkReceberPromocoes = By.name("optin");
	private By checkNewsletter = By.name("newsletter");

	@FindBy(xpath = "//button[@data-link-action='save-customer']")
	private WebElement botaoSalvar;

	@FindBy(xpath = "//a[@class='account']/span")
	private WebElement nomeUsuarioCriado;

	@FindBy(xpath = "//a[@title='Ver minha conta de usuário']")
	private WebElement linkPerfilUsuario;

	@FindBy(id = "identity-link")
	private WebElement linkPaginaInformacao;

	@FindBy(name = "new_password")
	private WebElement campoNovaSenha;

	@FindBy(tagName = "article")
	private WebElement mensagemAlteracaoPerfil;

	@FindBy(xpath = "//button[@data-link-action='sign-in']")
	private WebElement botaoEntrar;

	@FindBy(xpath = "//div[@id='_desktop_logo']/a")
	private WebElement linkPaginaIncial;

	@FindBy(name = "s")
	private WebElement campoBusca;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement botaoPesquisa;

	@FindBy(xpath = "//img[contains(@alt,'chiffon')]")
	private WebElement imagemVestidoChiffon;

	@FindBy(id = "group_1")
	private WebElement selectTamanhoVestido;

	@FindBy(xpath = "//li[@class='float-xs-left input-container']")
	private List<WebElement> listaCoresVestido;

	@FindBy(name = "qty")
	private WebElement campoQuantidadeVestidos;

	@FindBy(xpath = "//button[@data-button-action='add-to-cart']")
	private WebElement botaoAdicionarCarrinho;

	@FindBy(xpath = "(//div[@class='col-md-6'])[4]")
	private WebElement informacoesProduto;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement linkFinalizarPedido;

	@FindBy(partialLinkText = "Todos os produtos")
	private WebElement linkTodosProdutos;

	@FindBy(xpath = "//ul[@id='facet_28790']/li/label")
	private List<WebElement> listaCores;

	@FindBy(xpath = "(//ul[@class='collapse'])[1]/li/label")
	private List<WebElement> listaTamanhos;

	@FindBy(xpath = "(//ul[@class='collapse'])[3]/li/label")
	private List<WebElement> listaEstilos;

	@FindBy(xpath = "//div[@class='thumbnail-container']/a/img")
	private List<WebElement> listaProdutos;

	@FindBy(xpath = "(//button)[4]")
	private WebElement botaoLimparFiltros;
	
	@FindBy(xpath = "(//ul[@class='collapse'])[6]/li/label")
	private List<WebElement> listaPrecos;
	
	@FindBy(xpath = "//*[@class='filter-block']")
	private List<WebElement> listaDeFiltros;

	@FindBy(xpath = "(//ul[@class='collapse'])[2]/li/label")
	private List<WebElement> listaComposicoes;
	
	public List<WebElement> getListaPrecos() {
		return listaPrecos;
	}
	
	public List<WebElement> getListaDeFiltros() {
		return listaDeFiltros;
	}

	public List<WebElement> getListaProdutos() {
		return listaProdutos;
	}

	public List<WebElement> getListaEstilos() {
		return listaEstilos;
	}

	public List<WebElement> getListaTamanhos() {
		return listaTamanhos;
	}

	public List<WebElement> getListaCores() {
		return listaCores;
	}

	public WebElement getLinkTodosProdutos() {
		return linkTodosProdutos;
	}

	public WebElement getLinkFinalizarPedido() {
		return linkFinalizarPedido;
	}

	public WebElement getInformacoesProduto() {
		return informacoesProduto;
	}

	public WebElement getBotaoAdicionarCarrinho() {
		return botaoAdicionarCarrinho;
	}

	public WebElement getCampoQuantidadeVestidos() {
		return campoQuantidadeVestidos;
	}

	public List<WebElement> getListaCoresVestido() {
		return listaCoresVestido;
	}

	public WebElement getSelectTamanhoVestido() {
		return selectTamanhoVestido;
	}

	public WebElement getImagemVestidoChiffon() {
		return imagemVestidoChiffon;
	}

	public WebElement getBotaoPesquisa() {
		return botaoPesquisa;
	}

	public WebElement getCampoBusca() {
		return campoBusca;
	}

	public WebElement getLinkPaginaIncial() {
		return linkPaginaIncial;
	}

	public WebElement getBotaoEntrar() {
		return botaoEntrar;
	}

	public WebElement getLinkPerfilUsuario() {
		return linkPerfilUsuario;
	}

	public WebElement getLinkPaginaInformacao() {
		return linkPaginaInformacao;
	}

	public WebElement getCampoNovaSenha() {
		return campoNovaSenha;
	}

	public WebElement getMensagemAlteracaoPerfil() {
		return mensagemAlteracaoPerfil;
	}

	public WebElement getNomeUsuarioCriado() {
		return nomeUsuarioCriado;
	}

	public By getCheckNewsletter() {
		return checkNewsletter;
	}

	public By getCheckReceberPromocoes() {
		return checkReceberPromocoes;
	}

	public WebElement getCampoBirthday() {
		return campoBirthday;
	}

	public WebElement getCampoPassword() {
		return campoPassword;
	}

	public WebElement getCampoEmail() {
		return campoEmail;
	}

	public WebElement getCampoLastName() {
		return campoLastName;
	}

	public WebElement getCampoFirstName() {
		return campoFirstName;
	}

	public List<WebElement> getRadiosGeneros() {
		return radiosGeneros;
	}

	public WebElement getLinkCriarConta() {
		return linkCriarConta;
	}

	public WebElement getLinkEntrar() {
		return linkEntrar;
	}

	public WebElement getBotaoSalvar() {
		return botaoSalvar;
	}

	public WebElement getBotaoLimparFiltros() {
		return botaoLimparFiltros;
	}

	public List<WebElement> getListaComposicoes() {
		return listaComposicoes;
	}
}
