package com.br.classic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassClassic extends PageObject{

	@FindBy(xpath = "//a[@title='Entrar com sua conta de cliente']")
	private WebElement linkEntrar;
	
	@FindBy(partialLinkText="Não tem uma conta? Crie uma aqui")
	private WebElement linkCriarConta;
	
	public WebElement getLinkCriarConta() {
		return linkCriarConta;
	}
	
	public WebElement getLinkEntrar() {
		return linkEntrar;
	}
}
