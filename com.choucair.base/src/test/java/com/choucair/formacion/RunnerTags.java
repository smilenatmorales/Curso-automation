package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
//@CucumberOptions(features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", tags = "@RetoAlterno2")
//@CucumberOptions(features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", tags = "@Reto2")
//@CucumberOptions(features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", tags = "@Reto")
//@CucumberOptions(features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", tags = "@RetoAlterno")
@CucumberOptions (features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", tags = "@CasoExitoso")
//@CucumberOptions (features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", tags = "@CasoAlterno")
//@CucumberOptions (features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", tags = "@Regresion")
//@CucumberOptions (features = "src/test/resources/features/Nombre.feature", tags = "@CasoAlterno")
public class RunnerTags {

}
