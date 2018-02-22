package com.br.classic.steps.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.br.classic.pages.PageObjectClassClassic;

import io.openbdt.element.WebBrowserScreenElement;
import jxl.common.Logger;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessClassic {

	PageObjectClassClassic page;
	private static Logger LOG = Logger.getLogger(StepBusinessClassic.class);
	
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

	
}
