package scm.proyect

import grails.testing.services.ServiceUnitTest
import org.hibernate.service.Service
import spock.lang.Specification


class PersonServiceSpec extends Specification implements ServiceUnitTest<PersonService> {

    List<Class> getDomainClasses() { [Person] }

    def setup() {
    }

    def cleanup() {
    }

    void "Verifica si es mayor de edad "() {

        given: "se pasa el servicio"
        PersonService personService = new PersonService()
        boolean EsMayor = personService.adultPerson(Date.parse("yyyy-MM-dd", "1992-04-03"), 18)
        expect: "Mayor de 18"

        EsMayor == false

    }

    void "Se verifica si no hay errores al guardar "() {

        given: "se pasa el servicio"
        PersonService personService = new PersonService()
        Person persona = new Person()
        persona.nombre = "test"
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

        EsMayor == false

    }
}
