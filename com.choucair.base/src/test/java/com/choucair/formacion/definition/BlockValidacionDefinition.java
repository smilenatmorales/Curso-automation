package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.BlockValidationSteps;
import com.choucair.formacion.steps.ColorlibFormBlockSteps;
import com.choucair.formacion.steps.PopupValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BlockValidacionDefinition {

	@Steps
	PopupValidationSteps popupValidationSteps; // Instanciamos la clase de steps creada previamente

	@Steps
	BlockValidationSteps blockValidationSteps;
	@Steps
	ColorlibFormBlockSteps colorlibFormBlockSteps;

	@Given("^Ingresar a Funcionalidad Block Validation$")
	public void Ingresar_a_Funcionalidad_Block_Validation() {
		System.out.println("Aqui 1");
		blockValidationSteps.ingresar_Form_Block_Validation();
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
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@Then("^Verificar Respuesta Exitosa Fallida$")
	public void verificar_Respuesta_Exitosa_Fallida() {
		colorlibFormBlockSteps.verificar_registro_exitoso();
	}

	@Then("^Verificar respuesta fallida$")
	public void Verifico_registro_fallido() {
		colorlibFormBlockSteps.verificar_respuesta_fallida();
	}

}
