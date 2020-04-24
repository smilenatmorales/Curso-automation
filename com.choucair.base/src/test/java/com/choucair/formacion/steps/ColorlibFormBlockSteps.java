package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ColorlibFormBlockPage;
//import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;

import net.thucydides.core.annotations.Step;

public class ColorlibFormBlockSteps {

	ColorlibFormBlockPage colorlibFormBlock;

	@Step
	public void diligenciar_formblock_datos_tabla(List<List<String>> data, int id) {

		colorlibFormBlock.Required(data.get(id).get(0).trim());
		colorlibFormBlock.Email(data.get(id).get(1).trim());
		colorlibFormBlock.Password(data.get(id).get(2).trim());
		colorlibFormBlock.ConfirmaPassword(data.get(id).get(3).trim());
		colorlibFormBlock.Date(data.get(id).get(4).trim());
		colorlibFormBlock.Url(data.get(id).get(5).trim());
		colorlibFormBlock.Digits(data.get(id).get(6).trim());
		colorlibFormBlock.Rango(data.get(id).get(7).trim());
		colorlibFormBlock.Checkbox();
		colorlibFormBlock.validate();

	}

	@Step
	public void verificar_registro_exitoso() {
		colorlibFormBlock.form_sin_errores();
	}

	@Step
	public void verificar_respuesta_fallida() {
		colorlibFormBlock.form_con_errores();
	}

}
