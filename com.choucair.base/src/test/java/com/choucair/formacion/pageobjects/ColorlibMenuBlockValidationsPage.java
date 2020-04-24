package com.choucair.formacion.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObjects;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibMenuBlockValidationsPage extends PageObjects {

	public ColorlibMenuBlockValidationsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

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

	@FindBy(xpath = "//*[@id='content']/div/div/div[1]/div/div/header/div[2]/nav/a[1]\r\n")
	public WebElementFacade minimizar;

	/**
	 * public void menuFormValidation() { menuForms.click();
	 * menuFormValidation.click(); String strMensaje=lblFormValidation.getText();
	 * assertThat(strMensaje,containsString("Popup Validation")); minimizar.click();
	 * }
	 * 
	 * public void menuFormValidation() {
	 * 
	 * colorlibMenuPage.menuForms.click();
	 * colorlibMenuPage.menuFormValidation.click(); String
	 * strMensaje=colorlibMenuPage.lblFormValidation.getText();
	 * assertThat(strMensaje,containsString("Popup Validation"));
	 * colorlibMenuPage.minimizar.click(); }
	 */
	public void menuFormBlockValidation() {

		menuForms.click();
		menuFormValidation.click();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		String strMensaje = lblFormBlockValidation.getText();
		assertThat(strMensaje, containsString("Block Validation"));
		// moveTo("//*[@id='content']/div/div/div[2]/div/div/header/h5");
	}

}
