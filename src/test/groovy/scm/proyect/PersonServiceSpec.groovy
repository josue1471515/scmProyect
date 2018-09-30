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
            PersonProcessService personService = new PersonProcessService()
            boolean EsMayor = personService.adultPerson(Date.parse("yyyy-MM-dd", "1992-04-03"), 18)
        expect: "Mayor de 18"

            EsMayor == true

    }


}
