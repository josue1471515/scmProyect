package scm.proyect

import groovy.time.TimeCategory
import groovy.time.TimeDuration


class PersonProcessService {

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
}
