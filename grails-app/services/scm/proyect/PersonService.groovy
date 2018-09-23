package scm.proyect

import grails.gorm.transactions.Transactional

@Transactional
class PersonService {

    def serviceMethod() {

    }

    def savePerson(Person pPerson){
        pPerson.save()
    }

    def showPerson(Long pId){
        def vCambio = "hola mundo XD asdasd"
        return  Person.get(pId)
    }


    def     editPerson(Long pId){
        return  Person.get(pId)
    }

    def     updatePerson(Person pPerson){
        return  pPerson.save()
    }

    def deletePerson(Long pId){
        def p = Person.get(pId)
        p.delete()
    }
}
