package com.br.classic.steps.definition;

import java.util.UUID;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.br.classic.steps.business.StepBusinessClassic;

import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionClassic {

	@Steps
	StepBusinessClassic stepB;
	
	@Given("^estou na pagina inicial do site$")
	public void paginaIncialDoSite(){
		stepB.openHome("http://10.1.10.133:8080/br/");
	}
	
	@When("^clico no link Entrar$")
	public void clicoLinkEntrar(){
		stepB.clicarNoLinkEntrar();
	}
	
	@When("^clico no link Não tem uma conta\\? Crie uma aqui$")
	public void clicoLinkPaginaCriarConta(){
		stepB.clicarNoLinkPaginaCriarConta();
	}
	
}
