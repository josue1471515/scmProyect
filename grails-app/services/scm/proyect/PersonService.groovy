package scm.proyect

import grails.gorm.transactions.Transactional
import groovy.time.TimeCategory
import groovy.time.TimeDuration

import javax.xml.bind.ValidationException


class PersonService {

    def serviceMethod(def asd) {
        return true;
    }

    def adultPerson(Date date, int limitYears) {

        Date dateNow = new Date()
        TimeDuration tiempo = TimeCategory.minus(dateNow ,date )
        int years = tiempo.days / 365
        if (years > limitYears) {
            return true
        } else {
            return false
        }

    }

    def savePerson(Person pPerson) {
        if (adultPerson(pPerson.fechaDeNacimiento, 18)) {
            pPerson.save()
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
