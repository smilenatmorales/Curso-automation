package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibMenuBlockValidationsPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class BlockValidationSteps {

	ColorlibMenuPage colorlibMenuPage;
	ColorlibMenuBlockValidationsPage colorlibMenuBlockValidationsPage;

	@Step
	public void ingresar_Form_Block_Validation() {// Invocando el metodo menuFormValidation
		colorlibMenuPage.menuFormBlockValidation();
	}
}
