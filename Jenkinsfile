pipeline {
  agent any
  stages {
    stage('Compilar') {
      steps {
        bat(script: 'cd C:\\Users\\PC\\Documents\\maestria\\scmProyect', returnStatus: true)
        bat(script: 'grails test-app', returnStatus: true)
      }
    }
  }
}