Feature: The system must support creating and updating Tariff Plans with configurable details such as code, description,
  plan type, included units, fixed charge, and minute rates (LDN, LDI, LE), both as included and additional values.
  Each plan must have a validity period (start and end date) and an “Altamira Homologous Plan” code.
  When modifying a plan, the current validity must be closed (fecha_final), and a new one must be created with updated data (fecha_inicial)
  in the davox.planes_voz_corporativo table.

  Scenario Outline: Acceso y navegación al formulario de registro de plan

    Given I am on the Davox Plus login page
    When I login with valid credentials
      | user        | password        |
      | <userDavox> | <passwordDavox> |
    And I click on the Básicas button and select the Facturación option
    Then I should be redirected to the facturation page

    And hago clic en la opción Mantenimiento Plan Voz Corporativa
    Then I should be redirected to the form to register a plan
    When I comple the form with codigo plan "<codigoPlan>", descripcion "<desciption>", unidades incluidas "<includedUnits>", cargo fijo "<fixedCharge>", valor minuto ldn incluido "<LDNMinuteRate>", valor minuto ldi incluido "<LDIMinuteRate>", valor minuto le incluido "<LEMinuteRate>", valor minuto ldn adicional "<additionalLdnMinuteValue>", valor minuto ldi adicional "<additionalLdiMinuteValue>", valor minuto le adicional "<AdditionalLeMinuteValue>", plan homologo altamira "<altamiraHomologousPlan>", bono altamira "<altamiraBond>" and click on agregar button
    Then I can see the message "<successMessage>" and click on the aceptar button

    Given I go to the search option
    When I search for the plan code "<codigoPlan>" and click the Buscar button
    And I click on the found plan ID
    Then the plan information should be loaded in the form

    When I update the included units to "<nuevasUnidadesIncluidas>"  and I click the Guardar button without changing the start date
    Then I should see an error message "<errorMsaje1>"

    When I update the start date
    Then I should see a success message "<successMessage>"

    Then I connect to the database and verify the updated plan using the query "<queryPlanVosCorporativa>" and check the values for codigo plan "<codigoPlan>", description "<desciption>", included units "<includedUnits>", fixed charge "<fixedCharge>", included minute rates "<LDNMinuteRate>", "<LDIMinuteRate>", "<LEMinuteRate>", and additional rates "<additionalLdnMinuteValue>", "<additionalLdiMinuteValue>", "<AdditionalLeMinuteValue>", homologous plan "<altamiraHomologousPlan>", and bond "<altamiraBond>"

    Then I connect to the database and verify the Altamira bond using the query "<QueryHomologacionPlanes>", expecting plan code "<altamiraHomologousPlan>" and bond "<altamiraBond>"


    Examples:
      | userDavox | passwordDavox | codigoPlan | desciption | includedUnits | fixedCharge | fixedCharge | LDNMinuteRate | LDIMinuteRate | LEMinuteRate | additionalLdnMinuteValue | additionalLdiMinuteValue | AdditionalLeMinuteValue | altamiraHomologousPlan | altamiraBond | successMessage                            | nuevasUnidadesIncluidas | errorMsaje1            | queryPlanVosCorporativa                                            | QueryHomologacionPlanes                                        |
      | DavoxUser | 123456        | 5018       | Prueba     | 3000000       | 52          | 52          | 52            | 172           | 172          | 52                       | 52                       | 52                      | G5                     | BDMG         | Se ha ingresado correctamente el registro | 4000000                 | Error en actualización | SELECT * FROM DAVOX.planes_voz_corporativa WHERE COD_PLAN = '5012' | SELECT * FROM DAVOX.homologacion_planes WHERE COD_PLAN = '241' |
