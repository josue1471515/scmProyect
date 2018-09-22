pipeline {
  agent any
  stages {
    stage('Compilar') {
      parallel {
        stage('Test') {
          steps {
            bat(script: 'cd C:\\Users\\PC\\Documents\\maestria\\scmProyect', returnStatus: true)
            bat(script: 'grails test-app', returnStatus: true, returnStdout: true)
          }
        }
        stage('Compilar') {
          steps {
            bat(script: 'cd C:\\Users\\PC\\Documents\\maestria\\scmProyect', returnStatus: true)
            bat(script: 'grails compile', returnStatus: true, returnStdout: true)
          }
        }
      }
    }
  }
}