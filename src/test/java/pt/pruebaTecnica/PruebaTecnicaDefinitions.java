package pt.pruebaTecnica;

import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pt.utils.AccionesObjetos;
import pt.utils.ManejoDataExcel;


public class PruebaTecnicaDefinitions {
	
	AccionesObjetos accionesObjetos;
	ManejoDataExcel dataExcel= new ManejoDataExcel();

	@Steps
	PruebaTecnicaSteps pruebaTecnicaSteps;
	
	@Given("^Ingresar al portal y realizar autenticacion$")
	public void ingresarAlPortalYRealizarAutenticacion(Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.ingresarAlPortalYRealizarAutenticacion(data);
	}

	@When("^seleccionar opcion addNewClient y seguir camino existing HouseHold$")
	public void seleccionarOpcionAddNewClientYSeguirCaminoExistingHouseHold(Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.seleccionarOpcionAddNewClientYSeguirCaminoExistingHouseHold(data);
	}

	@Then("^validar creacion de cliente exitosa$")
	public void validarCreacionDeClienteExitosa() {
		pruebaTecnicaSteps.validarCreacionDeClienteExitosa();
	}

	@When("^seleccionar HouseHold y editar miembro$") 
	public void seleccionarHouseHoldYEditarMiembro(Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.seleccionarHouseHoldYEditarMiembro(data);
	}

	@And("^validar edicion de cliente exitosa$")
	public void validarEdicionDeClienteExitosa() {
		pruebaTecnicaSteps.validarEdicionDeClienteExitosa();
	}

	@When("^seleccionar HouseHold y borrar miembro$")
	public void seleccionarHouseHoldYBorrarMiembro(Map <String,String> data){
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.seleccionarHouseHoldYBorrarMiembro(data);
	}

	@And("^validar borrar cliente exitoso$")
	public void validarBorrarClienteExitoso(Map <String,String> data) {
		String FilaDataExcel= data.get("keyFilaDataExcel");
		data=dataExcel.leerFilaDataExcel("pruebaTecnica",Integer.valueOf(FilaDataExcel));
		pruebaTecnicaSteps.validarBorrarClienteExitoso(data);
	}
	

	
}
