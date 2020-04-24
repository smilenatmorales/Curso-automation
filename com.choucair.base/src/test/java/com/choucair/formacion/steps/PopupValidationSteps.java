package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

//import net.serenitybdd.core.annotations.findby.FindBy;
//import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {

	ColorlibLoginPage colorlibLoginPage;// 2.1 instanciar una clase que agregaremos para los objetos del login, para el
										// ejemplo la llamaremos “ColorlibLoginPage”
	ColorlibMenuPage colorlibMenuPage;// intanciar el objeto creado en .pageobjects

	@Step
	public void login_colorlib(String strUsuario, String strPass) {// 2.2 Crear el método que va a contener los pasos
																	// para lograr la autenticación, para efectos del
																	// ejemplo, copiemos el texto definido en el
																	// requisito y lo comentamos, así nos servirá de
																	// documentación.
		// a.abrir navegador con la url de prueba
		colorlibLoginPage.open();// 2.3 Serenity, proporciona el método “.open()”, que nos permitirá abrir la url
									// en el navegador parametrizado de una forma sencilla, más adelante vemos la
									// forma de suministrar la url.
		// ingresar usuario demo
		// ingresar password demo
		// clic en botpon sing in
		colorlibLoginPage.IngresarDatos(strUsuario, strPass);// 2.4 Para los pasos de diligenciar el formulario de
																// autenticación, agregamos el método “IngresarDatos”,
																// el cual recibirá los parámetros Usuario y Clave que
																// vienen de la definition.
		// e. verificar la autenticacion (label en home)
		colorlibLoginPage.VerificaHome();// 2.5 Por último agregamos un método para la verificación de un label
											// existente en el Home de la aplicación que nos ayude a identificar el
											// ingreso a la aplicación
	}

	@Step
	public void ingresar_form_validation() {// Invocando el metodo menuFormValidation
		colorlibMenuPage.menuFormValidation();

	}

	/**
	 * @Step public void ingresar_Form_Block_Validation() {//Invocando el metodo
	 *       menuFormValidation colorlibMenuPage.menuFormBlockValidation();
	 * 
	 *       }
	 */

	@Step
	public void ingresar_Form_Inline_Validation() {// Invocando el metodo
		colorlibMenuPage.menuFormInlinekValidation();

	}

}
