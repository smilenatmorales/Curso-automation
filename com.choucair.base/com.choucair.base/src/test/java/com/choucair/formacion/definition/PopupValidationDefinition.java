package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.ColorlibFormBlockSteps;
import com.choucair.formacion.steps.PopupValidationSteps;
import com.choucair.formacion.steps.colorlibFormValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {

	@Steps
	PopupValidationSteps popupValidationSteps; // Instanciamos la clase de steps creada previamente
	@Steps
	colorlibFormValidationSteps ColorlibFormValidationSteps; // Instanciamos la clase de steps creada previamente
	@Steps
	ColorlibFormBlockSteps colorlibFormBlockSteps;

	@Given("^Autentico en colorlib  con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave) {
		popupValidationSteps.login_colorlib(Usuario, Clave);
	}

	@Given("^Ingreso a la funcionalidad  forms validation$")
	public void ingreso_a_la_funcionalidad_forms_validation() {
		popupValidationSteps.ingresar_form_validation();
	}

	@When("^Diligencio formulario Popup validation$")
	public void diligencio_formulario_popup_validation(DataTable dtDatosForm) {
		List<List<String>> data = dtDatosForm.raw();
		System.out.println(data.size());
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		for (int i = 1; i < data.size(); i++) {
			ColorlibFormValidationSteps.diligenciar_popup_datos_tabla(data, i);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() {
		ColorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
	}

	@Then("^Verifico que se presente Globo Informativo de validacion$")
	public void Verifico_que_se_presente_Globo_Informativo_de_validacion() {
		ColorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
	}

	@Given("^Ingresar a Funcionalidad Block Validation$")
	public void ingresar_a_funcionalidad_block_validation() {
		popupValidationSteps.ingresar_form_Block_validation();
	}

	@When("^Diligenciar Formulario Block Validation$")
	public void diligenciar_formulario_Block_validation(DataTable dtDatosForm) {
		List<List<String>> data = dtDatosForm.raw();
		System.out.println(data.size());
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		for (int i = 1; i < data.size(); i++) {
			colorlibFormBlockSteps.diligenciar_formblock_datos_tabla(data, i);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
