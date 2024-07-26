package pt.pruebaTecnica;



import java.util.Map;

import net.serenitybdd.annotations.Step;



public class PruebaTecnicaSteps {
	PruebaTecnicaPageObject pruebaTecnicaPageObject;
	
	
	@Step("^Ingresar al portal y realizar autenticacion$")
	public void ingresarAlPortalYRealizarAutenticacion(Map <String,String> data){
		pruebaTecnicaPageObject.ingresarAlPortalYRealizarAutenticacion(data);
	}
	
	@Step("^seleccionar opcion addNewClient y seguir camino existing HouseHold$")
	public void seleccionarOpcionAddNewClientYSeguirCaminoExistingHouseHold(Map <String,String> data){
		pruebaTecnicaPageObject.seleccionarOpcionAddNewClientYSeguirCaminoExistingHouseHold(data);
	}
	
	@Step("^validar creacion de cliente exitosa$")
	public void validarCreacionDeClienteExitosa() {
		pruebaTecnicaPageObject.validarCreacionDeClienteExitosa();
		}
	
	@Step("^seleccionar HouseHold y editar miembro$") 
	public void seleccionarHouseHoldYEditarMiembro(Map <String,String> data){
		pruebaTecnicaPageObject.seleccionarHouseHoldYEditarMiembro(data);
	}
	
	@Step("^validar edicion de cliente exitosa$")
	public void validarEdicionDeClienteExitosa() {
		pruebaTecnicaPageObject.validarEdicionDeClienteExitosa();
	}
	
	@Step("^seleccionar HouseHold y borrar miembro$")
	public void seleccionarHouseHoldYBorrarMiembro(Map <String,String> data){
		pruebaTecnicaPageObject.seleccionarHouseHoldYBorrarMiembro(data);
	}
	
	@Step("^validar borrar cliente exitoso$")
	public void validarBorrarClienteExitoso(Map <String,String> data) {
		pruebaTecnicaPageObject.validarBorrarClienteExitoso(data);
	}
}
