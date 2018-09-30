package scm.proyect

import grails.testing.mixin.integration.Integration
import grails.transaction.*
import spock.lang.Specification

@Integration
@Rollback
class PersonIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Se verifica si no hay errores al guardar "() {

        given: "se pasa el servicio"
            PersonService personService = new PersonService()
            Person persona = new Person()
            persona.nombre = "test2"
            persona.telefono = "test"
            persona.fechaDeNacimiento = Date.parse("yyyy-MM-dd", "1992-04-03")
            persona.email = "test"
            boolean EsMayor = false
            try{
                personService.savePerson(persona)
                EsMayor = true
            }catch (Exception ex){
                EsMayor = false
            }
        expect: "Se crea corectamente"

        EsMayor == true

    }
}
