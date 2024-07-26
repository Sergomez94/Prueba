package pt.pruebaTecnica;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import pt.utils.AccionesObjetos;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;




public class PruebaTecnicaPageObject extends PageObject{
	
    public PruebaTecnicaPageObject(WebDriver driver) {
        super(driver);
    }
	AccionesObjetos accionesObjetos;
	PruebaTecnicaUI pruebaTecnicaUI= new PruebaTecnicaUI();
	PruebaTecnicaConstants pruebaTecnicaConstants= new PruebaTecnicaConstants();

	
	public void ingresarAlPortalYRealizarAutenticacion(Map <String,String> data){
		
		//ingresar al portal
		accionesObjetos.abrirUrl();
		accionesObjetos.escribirLog(accionesObjetos.obtenerTituloPagina());
		
		// ingresar con usuario y contraseña		
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxEmail(), data.get("keyEmail"));
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxPassword(), data.get("keyPassword"));
		Serenity.takeScreenshot();
		accionesObjetos.tiempoEsperaImplicito(2);
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnLogin());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
	}
	
	
	public void seleccionarOpcionAddNewClientYSeguirCaminoExistingHouseHold(Map <String,String> data){
	
		//seleccionar opciones add new client a un household existente
		// metodo comentado debido a error presentado se busca forma de agregar alternativa
		//accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnAddNewClient());
		//accionesObjetos.tiempoEsperaImplicito(2);
		//Serenity.takeScreenshot();
		//accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnAddClientExistingHouseHold());
		//accionesObjetos.tiempoEsperaImplicito(2);
		//Serenity.takeScreenshot();
		//accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnNext());
		//accionesObjetos.tiempoEsperaImplicito(2);
		//Serenity.takeScreenshot();
		//accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxSelectHouseHold(), data.get("keyHouseHold"));
		//accionesObjetos.tiempoEsperaImplicito(2);
		//Serenity.takeScreenshot();
		//accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getTxtSelectionSelectHouseHold());
		//accionesObjetos.tiempoEsperaImplicito(2);
		//Serenity.takeScreenshot();
		//accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnNext());
		//accionesObjetos.tiempoEsperaImplicito(2);
		//Serenity.takeScreenshot();
		
		//ruta alternativa creacion miembro household
		seleccionarHouseHold();
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnAñadirCliente());
		
		//llenar formulario y continuar
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxEmailNewClient(), data.get("keyEmailNewClient"));
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxNameNewClient(), data.get("keyNameNewClient"));
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxLastNameNewClient(), data.get("keyLastNameNewClient"));
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxMobileNewClient(), data.get("keyMobileNewClient"));
		accionesObjetos.tiempoEsperaImplicito(1);
		Serenity.takeScreenshot();
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnAddMember());
		accionesObjetos.tiempoEsperaImplicito(8);
		
	}
	
	
	public void validarCreacionDeClienteExitosa() {
		
		//validar creacion del cliente
		accionesObjetos.hacerScroll("0","300");
		accionesObjetos.tiempoEsperaImplicito(5);
		Serenity.takeScreenshot();
		assertTrue(accionesObjetos.obtenerElementos(pruebaTecnicaUI.getTxtNewClient()).getText().contains(pruebaTecnicaConstants.txtNewClient));

	}
	
	public void seleccionarHouseHold() {
		accionesObjetos.tiempoEsperaImplicito(4);
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnJakeSchneider());
		accionesObjetos.tiempoEsperaImplicito(4);
		Serenity.takeScreenshot();
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnHouseHold());
		accionesObjetos.tiempoEsperaImplicito(5);
		Serenity.takeScreenshot();
	}
	
	public void seleccionarHouseHoldYEditarMiembro(Map <String,String> data){
		
		//seleccion de household para editar miembro
		seleccionarHouseHold();
		
		//edicion de miembro
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnEditClient());
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxEditarName(), Keys.chord(Keys.CONTROL,"a") +data.get("keyEditName"));
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxEditarLastName(), Keys.chord(Keys.CONTROL,"a") +data.get("keyEditLastName"));
		accionesObjetos.tiempoEsperaImplicito(1);
		accionesObjetos.escribirTextoWeb(pruebaTecnicaUI.getTxtBoxEditarMobile(), Keys.chord(Keys.CONTROL,"a") +data.get("keyEditMobile"));
		accionesObjetos.tiempoEsperaImplicito(1);
		Serenity.takeScreenshot();
		accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnSaveChanges());
		
		
	}
	
	
	public void validarEdicionDeClienteExitosa() {
		//validar creacion del cliente
		accionesObjetos.hacerScroll("0","300");
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
		assertTrue(accionesObjetos.obtenerElementos(pruebaTecnicaUI.getTxtNuevoCliente()).getText().contains(pruebaTecnicaConstants.txtNuevoCliente));

	}
	
	
	public void seleccionarHouseHoldYBorrarMiembro(Map <String,String> data){
		//seleccion de household para borrar miembro
				seleccionarHouseHold();

		if((accionesObjetos.obtenerElementos(pruebaTecnicaUI.getTxtNuevoCliente()).getText().contains(data.get("keyBorrarCliente")))==true){
			accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnBorrarCliente());
			Serenity.takeScreenshot();
			accionesObjetos.clickElementoWeb(pruebaTecnicaUI.getBtnRemove());
			Serenity.takeScreenshot();
			accionesObjetos.tiempoEsperaImplicito(4);
			
		}
	}
	
	
	public void validarBorrarClienteExitoso(Map <String,String> data) {
		accionesObjetos.tiempoEsperaImplicito(2);
		Serenity.takeScreenshot();
		assertTrue(accionesObjetos.obtenerElementos(pruebaTecnicaUI.getTxtAlert()).isDisplayed());

	}
	
	
	
}
