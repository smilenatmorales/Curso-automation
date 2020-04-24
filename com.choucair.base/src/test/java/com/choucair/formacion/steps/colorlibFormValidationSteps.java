package com.choucair.formacion.steps;

import java.util.List;
import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;
import net.thucydides.core.annotations.Step;

public class ColorlibFormValidationSteps {

	ColorlibFormValidationPage colorlibFormValidationPage;

	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
		colorlibFormValidationPage.Required(data.get(id).get(0).trim());
		colorlibFormValidationPage.Select_Sport(data.get(id).get(1).trim());
		colorlibFormValidationPage.Multiple_Select(data.get(id).get(2).trim());
		colorlibFormValidationPage.Multiple_Select(data.get(id).get(3).trim());
		colorlibFormValidationPage.url(data.get(id).get(4).trim());
		colorlibFormValidationPage.email(data.get(id).get(5).trim());
		colorlibFormValidationPage.password(data.get(id).get(6).trim());
		colorlibFormValidationPage.confirm_password(data.get(id).get(7).trim());
		colorlibFormValidationPage.minimun_field_size(data.get(id).get(8).trim());
		colorlibFormValidationPage.maximun_field_size(data.get(id).get(9).trim());
		colorlibFormValidationPage.number(data.get(id).get(10).trim());
		colorlibFormValidationPage.ip(data.get(id).get(11).trim());
		colorlibFormValidationPage.date(data.get(id).get(12).trim());
		colorlibFormValidationPage.date_earlier(data.get(id).get(13).trim());
		colorlibFormValidationPage.validate();

	}

	@Step
	public void verificar_ingreso_datos_formulario_exitoso() {
		colorlibFormValidationPage.form_sin_errores();
	}

	@Step
	public void verificar_ingreso_datos_formulario_con_errores() {
		colorlibFormValidationPage.form_con_errores();
	}

	@Step
	public void diligenciar_formInline_datos_tabla(List<List<String>> data, int id) {
		colorlibFormValidationPage.required3(data.get(id).get(0).trim());
		colorlibFormValidationPage.email3(data.get(id).get(1).trim());
		colorlibFormValidationPage.password3(data.get(id).get(2).trim());
		colorlibFormValidationPage.confirmarPassword3(data.get(id).get(3).trim());
		colorlibFormValidationPage.date3(data.get(id).get(4).trim());
		colorlibFormValidationPage.url3(data.get(id).get(5).trim());
		colorlibFormValidationPage.minsize3(data.get(id).get(6).trim());
		colorlibFormValidationPage.maxsize3(data.get(id).get(7).trim());
		colorlibFormValidationPage.minNum3(data.get(id).get(8).trim());
		colorlibFormValidationPage.maxNum3(data.get(id).get(9).trim());
		colorlibFormValidationPage.check3();
		colorlibFormValidationPage.validateInline();

	}

	public void verificar_con_exito() {
		colorlibFormValidationPage.form_exitoso();
	}

	@Step
	public void verificar_sin_exito() {
		colorlibFormValidationPage.form_fallido();
	}
}
