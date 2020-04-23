package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormBlockPage extends PageObject{
	
	//Campo Required
	@FindBy (xpath = "//*[@id='required2']")
	public WebElementFacade txtRequired2;
	
	// Campo Email
	@FindBy (xpath = "//*[@id='email2']")
	public WebElementFacade txEmail2;
	
	//Campo Password
	@FindBy (xpath = "//*[@id='password2']")
	public WebElementFacade txtPassword2;
	
	//Campo Confirmar Password
	@FindBy (xpath = "//*[@id='confirm_password2']")
	public WebElementFacade txtConfirmarPass2;
	
	//Campo Date
	@FindBy (xpath = "//*[@id='date2']")
	public WebElementFacade txtDate2;
	
	//Campo Url
	@FindBy (xpath = "//*[@id='url2']") 
	public WebElementFacade txtUrl;
	
	//Campo Digits Only
	@FindBy (xpath = "//*[@id='digits']")
	public WebElementFacade txtDigits;
	
	//Campo Rango
	@FindBy (xpath = "//*[@id='range']")
	public WebElementFacade txtRange;

	//Campo checkbox policy
	@FindBy (xpath = "//*[@id='agree2']")
	public WebElementFacade checkagree;
	
	//Boton validate
	@FindBy (xpath = "//*[@id='block-validate']/div[10]/input")
	public WebElementFacade btnblockValidate;
	
	public void Required (String datoPrueba) {
		WebElement element = getDriver().findElement(By.id("required2"));
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element);
		actions.perform();
	
		txtRequired2.sendKeys(datoPrueba);
	}
	
	public void Email (String datoPrueba) {
		txEmail2.click();
		txEmail2.clear();
		txEmail2.sendKeys(datoPrueba);
	}
	
	public void Password (String datoPrueba) {
		txtPassword2.click();
		txtPassword2.clear();
		txtPassword2.sendKeys(datoPrueba);
	}
	
	public void ConfirmaPassword (String datoPrueba) {
		txtConfirmarPass2.click();
		txtConfirmarPass2.clear();
		txtConfirmarPass2.sendKeys(datoPrueba);
	}
	

	public void Date (String datoPrueba) {
		txtDate2.click();
		txtDate2.clear();
		txtDate2.sendKeys(datoPrueba);
	}
	
	public void Url (String datoPrueba) {
		txtUrl.click();
		txtUrl.clear();
		txtUrl.sendKeys(datoPrueba);
	}
	
	public void Digits (String datoPrueba) {
		txtDigits.click();
		txtDigits.clear();
		txtDigits.sendKeys(datoPrueba);
	}
	
	public void Rango (String datoPrueba) {
		txtRange.click();
		txtRange.clear();
		txtRange.sendKeys(datoPrueba);
	}
	
	public void Checkbox () {
		checkagree.click();
		//checkagree.sendKeys(datoPrueba);
	}
	
	public void validate() {
		btnblockValidate.click();
	}

}
