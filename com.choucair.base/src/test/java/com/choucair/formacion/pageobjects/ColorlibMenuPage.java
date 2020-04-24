package com.choucair.formacion.pageobjects;

import static org.junit.Assert.assertThat;

//import org.openqa.selenium.interactions.touch.ScrollAction;

//import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import static org.hamcrest.Matchers.containsString;

//import org.apache.tools.ant.filters.TokenFilter.ContainsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibMenuPage extends PageObject {

	// Menú Forms
	@FindBy(xpath = "//*[@id='menu']/li[6]/a")
	public WebElementFacade menuForms;

	// Menu Form General
	@FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[1]/a")
	public WebElementFacade menuFormGeneral;

	// Submenu Form Validation
	@FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
	public WebElementFacade menuFormValidation;

	// Form Validation =label informativo
	@FindBy(xpath = "//*[@id='content']/div/div/div[1]/div/div/header/h5")
	public WebElementFacade lblFormValidation;

	// form Block validation =label informativo
	@FindBy(xpath = "//*[@id='content']/div/div/div[2]/div/div/header/h5")
	public WebElementFacade lblFormBlockValidation;

	// form Inline Validation =label informativo
	@FindBy(xpath = "//*[@id='content']/div/div/div[3]/div/div/header/h5")
	public WebElementFacade lblForInlineValidation;

	@FindBy(xpath = "//*[@id='content']/div/div/div[1]/div/div/header/div[2]/nav/a[1]")
	public WebElementFacade minimizar;

	@FindBy(xpath = "//*[@id='content']/div/div/div[2]/div/div/header/div[2]/nav/a[1]")
	public WebElementFacade minimizarForBlockValidation;

	public void menuFormValidation() {
		menuForms.click();
		menuFormValidation.click();
		String strMensaje = lblFormValidation.getText();
		assertThat(strMensaje, containsString("Popup Validation"));

	}

	public void menuFormBlockValidation() {
		menuForms.click();
		menuFormValidation.click();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		String strMensaje = lblFormBlockValidation.getText();
		assertThat(strMensaje, containsString("Block Validation"));
		minimizar.click();
	}

	public void menuFormInlinekValidation() {
		menuForms.click();
		menuFormValidation.click();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		minimizar.click();
		String strMensaje = lblForInlineValidation.getText();
		assertThat(strMensaje, containsString("Inline Validation"));
		minimizarForBlockValidation.click();
		
	}

}
