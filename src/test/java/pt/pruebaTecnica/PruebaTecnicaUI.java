package pt.pruebaTecnica;

public class PruebaTecnicaUI {

	final String TIPO_XPATH="xpath";
	final String TIPO_ID="id";
	final String TIPO_CSS_SELECTOR="cssSelector";
	
	//objetos login
	private final String[] txtBoxEmail= {TIPO_ID,"username"};
	private final String[] txtBoxPassword= {TIPO_ID,"password"};
	private final String[] btnLogin= {TIPO_XPATH,"//button[normalize-space()='Continue']"};
	
	//objetos añadir cliente
	private final String[] btnAddNewClient= {TIPO_XPATH,"(//img[@alt='add_new_client icon'])[1]"};
	private final String[] btnAddClientExistingHouseHold= {TIPO_XPATH,"(//button[@type='button'])[4]"};
	private final String[] btnNext= {TIPO_XPATH,"//button[normalize-space()='Next']"};
	private final String[] txtBoxSelectHouseHold= {TIPO_ID,"input-search"};
	private final String[] txtSelectionSelectHouseHold= {TIPO_XPATH,"//div[contains(@class,'styles-module_searchClient__option__')]"};
	private final String[] txtBoxEmailNewClient= {TIPO_XPATH,"(//input[@class='styles-module_baseInput__input__JY0W6 styles-module_baseInput__input__modRegular__xJKul'])[1]"};
	private final String[] txtBoxNameNewClient= {TIPO_XPATH,"(//input[@class='styles-module_baseInput__input__JY0W6 styles-module_baseInput__input__modRegular__xJKul'])[2]"};
	private final String[] txtBoxLastNameNewClient= {TIPO_XPATH,"(//input[@class='styles-module_baseInput__input__JY0W6 styles-module_baseInput__input__modRegular__xJKul'])[3]"};
	private final String[] txtBoxMobileNewClient= {TIPO_XPATH,"(//input[@class='styles-module_baseInput__input__JY0W6 styles-module_baseInput__input__modRegular__xJKul'])[4]"};
	private final String[] txtNewClient= {TIPO_XPATH,"//p[normalize-space()='New Client']"};
	
	private final String[] btnAñadirCliente= {TIPO_XPATH,"//button[normalize-space()='Add Member']"};
	private final String[] btnAddMember= {TIPO_XPATH,"//button[@class='styles_memberInfo__button__WzDCo styles-module_button__XmRSx styles-module_button__blue__su2bF styles-module_button__modMedium__uLakc styles-module_button__blue_primary__9PN9a styles-module_button__modReverse__QbwGK']"};
	
	
	//objetos modificar cliente
	private final String[] btnJakeSchneider= {TIPO_XPATH,"//span[normalize-space()='Jake Schneider']"};
	private final String[] btnHouseHold= {TIPO_XPATH,"//a[normalize-space()='Household']"};
	private final String[] btnEditClient= {TIPO_XPATH,"//i[@class='fa-light fa-pen-to-square']"};
	private final String[] txtBoxEditarName= {TIPO_XPATH,"(//input[@class='styles-module_baseInput__input__JY0W6 styles-module_baseInput__input__modRegular__xJKul'])[1]"};	
	private final String[] txtBoxEditarLastName= {TIPO_XPATH,"(//input[@class='styles-module_baseInput__input__JY0W6 styles-module_baseInput__input__modRegular__xJKul'])[2]"};	
	private final String[] txtBoxEditarMobile= {TIPO_XPATH,"(//input[@class='styles-module_baseInput__input__JY0W6 styles-module_baseInput__input__modRegular__xJKul'])[3]"};	
	private final String[] btnSaveChanges= {TIPO_XPATH,"//button[normalize-space()='Save Changes']"};
	private final String[] txtNuevoCliente= {TIPO_XPATH,"//p[normalize-space()='Nuevo Cliente']"};

	//objetos borrar cliente
	private final String[] btnBorrarCliente= {TIPO_XPATH,"//i[@class='fa-light fa-trash']"};
	private final String[] btnRemove= {TIPO_XPATH,"//button[normalize-space()='Remove']"};
	private final String[] txtAlert= {TIPO_XPATH,"//p[normalize-space()='Your information is secure']"};
	
	
	public String[] getTxtBoxEmail() {
		return txtBoxEmail;
	}


	public String[] getTxtBoxPassword() {
		return txtBoxPassword;
	}


	public String[] getBtnLogin() {
		return btnLogin;
	}


	public String[] getBtnAddNewClient() {
		return btnAddNewClient;
	}


	public String[] getBtnAddClientExistingHouseHold() {
		return btnAddClientExistingHouseHold;
	}


	public String[] getBtnNext() {
		return btnNext;
	}


	public String[] getTxtBoxSelectHouseHold() {
		return txtBoxSelectHouseHold;
	}


	public String[] getTxtSelectionSelectHouseHold() {
		return txtSelectionSelectHouseHold;
	}


	public String[] getTxtBoxEmailNewClient() {
		return txtBoxEmailNewClient;
	}


	public String[] getTxtBoxNameNewClient() {
		return txtBoxNameNewClient;
	}


	public String[] getTxtBoxLastNameNewClient() {
		return txtBoxLastNameNewClient;
	}


	public String[] getTxtBoxMobileNewClient() {
		return txtBoxMobileNewClient;
	}


	public String[] getTxtNewClient() {
		return txtNewClient;
	}


	public String[] getBtnHouseHold() {
		return btnHouseHold;
	}


	public String[] getBtnEditClient() {
		return btnEditClient;
	}


	public String[] getTxtBoxEditarName() {
		return txtBoxEditarName;
	}


	public String[] getTxtBoxEditarLastName() {
		return txtBoxEditarLastName;
	}


	public String[] getTxtBoxEditarMobile() {
		return txtBoxEditarMobile;
	}


	public String[] getBtnJakeSchneider() {
		return btnJakeSchneider;
	}


	public String[] getBtnSaveChanges() {
		return btnSaveChanges;
	}


	public String[] getTxtNuevoCliente() {
		return txtNuevoCliente;
	}


	public String[] getBtnBorrarCliente() {
		return btnBorrarCliente;
	}


	public String[] getBtnRemove() {
		return btnRemove;
	}


	public String[] getTxtAlert() {
		return txtAlert;
	}


	public String[] getBtnAñadirCliente() {
		return btnAñadirCliente;
	}


	public String[] getBtnAddMember() {
		return btnAddMember;
	}

	

	
}
