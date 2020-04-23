package com.choucair.formacion.pageobjects;

import static org.junit.Assume.assumeThat;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")//con la url de prueba, la cual será utilizada por el método .open, que agregamos en los steps.

public class ColorlibLoginPage extends PageObject {
	
	//Campo usuario
		@FindBy(xpath="//*[@id='login']/form/input[1]")
		public WebElementFacade txtUsername;
	//Campo password
		@FindBy(xpath="//*[@id='login']/form/input[2]")
		public WebElementFacade txtPassword;
	//Boton
		@FindBy (xpath="//*[@id='login']/form/button")
		public WebElementFacade btnSignIn;
	//label del home a verificar
		@FindBy (xpath="//*[@id='bootstrap-admin-template']")
		public WebElementFacade  lblHomePpal;
		
		
		
		public void IngresarDatos (String strUsuario, String strPass) {//Recibe los parametros de usuario y clave desde los steps
			txtUsername.sendKeys(strUsuario);
			txtPassword.sendKeys(strPass);
			btnSignIn.click();
		}
		
		public void VerificaHome() {
			String labelv="Bootstrap-Admin-Template";
			String strMensaje=lblHomePpal.getText();
			assumeThat(strMensaje, containsString(labelv));
		}

}
