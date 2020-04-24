package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;

public class ColorlibFormValidationPage extends PageObject {

	// Campo Required
	@FindBy(xpath = "//*[@id='req']")
	public WebElementFacade txtRequired;

	// Campo Seleccion de deporte 1
	@FindBy(xpath = "//*[@id='sport']")
	public WebElementFacade cmbSport1;

	// Campo url
	@FindBy(xpath = "//*[@id='url1']")
	public WebElementFacade txtUrl;

	@FindBy(id = "email1")
	public WebElementFacade txtEmail1;

	@FindBy(id = "pass1")
	public WebElementFacade txtpass1;

	@FindBy(id = "pass2")
	public WebElementFacade txtpass2;

	@FindBy(id = "minsize1")
	public WebElementFacade txtMinsize1;

	@FindBy(id = "maxsize1")
	public WebElementFacade txtMaxsize;

	@FindBy(id = "number2")
	public WebElementFacade txtNumber;

	@FindBy(id = "ip")
	public WebElementFacade txtIp;

	@FindBy(id = "date3")
	public WebElementFacade txtDate;

	@FindBy(id = "past")
	public WebElementFacade txtDateEarlier;

	@FindBy(xpath = "//*[@id='sport2']")
	public WebElementFacade cmbSport2;

	@FindBy(xpath = "//*[@id='popup-validation']/div[14]/input")
	public WebElementFacade btnValidate;

	@FindBy(xpath = "(//DIV [@class='formErrorContent'])[1]")
	public WebElementFacade globoInformativo;

	public void Required(String datoPrueba) {
		txtRequired.click();
		txtRequired.clear();
		txtRequired.sendKeys(datoPrueba);
	}

	public void Select_Sport(String datoPrueba) {
		cmbSport1.click();
		cmbSport1.selectByVisibleText(datoPrueba);
	}

	public void url(String datoPrueba) {
		txtUrl.click();
		txtUrl.clear();
		txtUrl.sendKeys(datoPrueba);
	}

	public void email(String datoPrueba) {
		txtEmail1.click();
		txtEmail1.clear();
		txtEmail1.sendKeys(datoPrueba);
	}

	public void password(String datoPrueba) {
		txtpass1.click();
		txtpass1.clear();
		txtpass1.sendKeys(datoPrueba);
	}

	public void confirm_password(String datoPrueba) {
		txtpass2.click();
		txtpass2.clear();
		txtpass2.sendKeys(datoPrueba);
	}

	public void minimun_field_size(String datoPrueba) {
		txtMinsize1.click();
		txtMinsize1.clear();
		txtMinsize1.sendKeys(datoPrueba);
	}

	public void maximun_field_size(String datoPrueba) {
		txtMaxsize.click();
		txtMaxsize.clear();
		txtMaxsize.sendKeys(datoPrueba);
	}

	public void number(String datoPrueba) {
		txtNumber.click();
		txtNumber.clear();
		txtNumber.sendKeys(datoPrueba);
	}

	public void ip(String datoPrueba) {
		txtIp.click();
		txtIp.clear();
		txtIp.sendKeys(datoPrueba);
	}

	public void Multiple_Select(String datoPrueba) {
		cmbSport2.selectByVisibleText(datoPrueba);

	}

	public void date(String datoPrueba) {
		txtDate.click();
		txtDate.clear();
		txtDate.sendKeys(datoPrueba);
	}

	public void date_earlier(String datoPrueba) {
		txtDateEarlier.click();
		txtDateEarlier.clear();
		txtDateEarlier.sendKeys(datoPrueba);
	}

	public void validate() {
		btnValidate.click();
	}

	public void form_sin_errores() {
		assertThat(globoInformativo.isCurrentlyVisible(), is(false));
	}

	public void form_con_errores() {
		assertThat(globoInformativo.isCurrentlyVisible(), is(true));
	}

	// Elementos del formulario Inline Validattion

	@FindBy(xpath = "//*[@id='required']")
	public WebElementFacade txtRequired3;

	@FindBy(xpath = "//*[@id='email']")
	public WebElementFacade txtEmail3;

	@FindBy(xpath = "//*[@id='password']")
	public WebElementFacade txtPassword3;

	@FindBy(xpath = "//*[@id='confirm_password']")
	public WebElementFacade txtConfirmarPassword3;

	@FindBy(xpath = "//*[@id='date']")
	public WebElementFacade txtDate3;

	@FindBy(xpath = "//*[@id='url']")
	public WebElementFacade txtUrl3;

	@FindBy(xpath = "//*[@id='agree']")
	public WebElementFacade checkagree3;

	@FindBy(xpath = "//*[@id='minsize']")
	public WebElementFacade txtMinsize3;

	@FindBy(xpath = "//*[@id='maxsize']")
	public WebElementFacade txtMaxsize3;

	@FindBy(xpath = "//*[@id='minNum']")
	public WebElementFacade txtminNum3;

	@FindBy(xpath = "//*[@id='maxNum']")
	public WebElementFacade txtmaxNum3;

	@FindBy(xpath = "//*[@id=\"inline-validate\"]/div[12]/input")
	public WebElementFacade btnValidateInline;

	@FindBy(xpath = "//SPAN[@id='date-error']")
	public WebElementFacade alertas;

	public void required3(String datoPrueba) {
		// WebElement element = getDriver().findElement(By.id("required"));
		txtRequired3.click();
		txtRequired3.clear();
		txtRequired3.sendKeys(datoPrueba);
	}

	public void email3(String datoPrueba) {
		txtEmail3.click();
		txtEmail3.clear();
		txtEmail3.sendKeys(datoPrueba);
	}

	public void password3(String datoPrueba) {
		txtPassword3.click();
		txtPassword3.clear();
		txtPassword3.sendKeys(datoPrueba);
	}

	public void confirmarPassword3(String datoPrueba) {
		txtConfirmarPassword3.click();
		txtConfirmarPassword3.clear();
		txtConfirmarPassword3.sendKeys(datoPrueba);
	}

	public void date3(String datoPrueba) {
		txtDate3.click();
		txtDate3.clear();
		txtDate3.sendKeys(datoPrueba);
	}

	public void url3(String datoPrueba) {
		txtUrl3.click();
		txtUrl3.clear();
		txtUrl3.sendKeys(datoPrueba);
	}

	public void minsize3(String datoPrueba) {
		txtMinsize3.click();
		txtMinsize3.clear();
		txtMinsize3.sendKeys(datoPrueba);
	}

	public void maxsize3(String datoPrueba) {
		txtMaxsize3.click();
		txtMaxsize3.clear();
		txtMaxsize3.sendKeys(datoPrueba);
	}

	public void minNum3(String datoPrueba) {
		txtminNum3.click();
		txtminNum3.clear();
		txtminNum3.sendKeys(datoPrueba);
	}

	public void maxNum3(String datoPrueba) {
		txtmaxNum3.click();
		txtmaxNum3.clear();
		txtmaxNum3.sendKeys(datoPrueba);
	}

	public void check3() {
		checkagree3.click();

	}

	public void validateInline() {
		btnValidateInline.click();
	}

	public void form_exitoso() {
		assertThat(alertas.isCurrentlyVisible(), is(false));
	}

	public void form_fallido() {
		assertThat(alertas.isCurrentlyVisible(), is(true));
	}

}
