package scm.proyect
import grails.rest.*

@Resource(uri='/person')
class Person {

    String nombre
    String apellido
    Date fechaDeNacimiento
    String telefono
    String direccion
    String email


    static constraints = {
        nombre blank: true ,nullable: true
        apellido blank: true ,nullable: true
        fechaDeNacimiento blank: true ,nullable: true
        telefono blank: false
        direccion blank: true
        email blank: true,nullable: false
    }

    static mapping = {
    }
}
