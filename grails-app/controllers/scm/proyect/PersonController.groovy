package scm.proyect

import javax.xml.bind.ValidationException
import static org.springframework.http.HttpStatus.NO_CONTENT


class PersonController {

    PersonService gPersonService = new PersonService()
    def index() {
        respond Person.getAll()
    }

    def algo(){
        return false
    }
    
    def algo333(){
        return false
    }
    def create() {
        respond new Person(params)
    }

    def show(Long id){
        respond gPersonService.showPerson(id)
    }

    def save( Person pPerson){
        if (pPerson == null) {
            notFound()
            return
        }

        try {
            pPerson = gPersonService.savePerson(pPerson)
        } catch (ValidationException e) {

            respond pPerson.errors, view: 'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'Person.label', default: 'Person'), Person.name])
                redirect pPerson
            }
            '*' { respond pPerson, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond gPersonService.editPerson(id)
    }


    def update(Person pPerson) {
        gPersonService.updatePerson(pPerson)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Person.label', default: 'Person'), Person.name])
                redirect pPerson
            }
            '*' { respond pPerson, [status: UPDATED] }
        }

    }

    def delete(Long id) {

        if (id == null) {
            notFound()
            return
        }

        gPersonService.deletePerson(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'conexion.label', default: 'Person'), id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

}
