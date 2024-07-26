#Autor: Sergio Gomez
@PruebaTecnicaZoefin
Feature: Casos de prueba tecnica para ZoeFin

  @CreacionMiembroExistingHouseHold
  Scenario Outline: Creacion de Miembro en un HouseHold Existente
    Given Ingresar al portal y realizar autenticacion
      | keyFilaDataExcel | <filaDataExcel> |
    When seleccionar opcion addNewClient y seguir camino existing HouseHold
      | keyFilaDataExcel | <filaDataExcel> |
    And validar creacion de cliente exitosa

    Examples: 
      | filaDataExcel |
      |             2 |

  @EdicionMiembroExistingHouseHold
  Scenario Outline: Edicion de Miembro en un HouseHold Existente
    Given Ingresar al portal y realizar autenticacion
      | keyFilaDataExcel | <filaDataExcel> |
    When seleccionar HouseHold y editar miembro
      | keyFilaDataExcel | <filaDataExcel> |
    And validar edicion de cliente exitosa

    Examples: 
      | filaDataExcel |
      |             3 |

  @BorrarMiembroExistingHouseHold
  Scenario Outline: Borrar un Miembro en un HouseHold Existente
    Given Ingresar al portal y realizar autenticacion
      | keyFilaDataExcel | <filaDataExcel> |
    When seleccionar HouseHold y borrar miembro
      | keyFilaDataExcel | <filaDataExcel> |
    And validar borrar cliente exitoso
      | keyFilaDataExcel | <filaDataExcel> |
    Examples: 
      | filaDataExcel |
      |             4 |
