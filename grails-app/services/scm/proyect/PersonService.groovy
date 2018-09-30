package scm.proyect

import grails.gorm.transactions.Transactional
import groovy.time.TimeCategory
import groovy.time.TimeDuration

import javax.xml.bind.ValidationException
@Transactional
class PersonService {

    def serviceMethod(def asd) {
        return true;
    }



    def savePerson(Person pPerson) {
        PersonProcessService process = new PersonProcessService()
        if (process.adultPerson(pPerson.fechaDeNacimiento, 18)) {
           return pPerson.save()
        } else {
            throw new ValidationException("No es mayor de edad")
        }

    }

    def showPerson(Long pId) {
        def vCambio = "hola mundo XD asdasd"
        return Person.get(pId)
    }


    def editPerson(Long pId) {
        return Person.get(pId)
    }

    def updatePerson(Person pPerson) {
        return pPerson.save()
    }

    def deletePerson(Long pId) {
        def p = Person.get(pId)
        p.delete()
    }
}
