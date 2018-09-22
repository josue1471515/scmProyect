pipeline {
  agent any
  stages {
    stage('') {
      steps {
        bat(returnStatus: true, script: 'cd C:\\Users\\PC\\Documents\\maestria\\scmProyect')
        bat(script: 'grails test-app', returnStatus: true)
      }
    }
  }
}