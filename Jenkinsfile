pipeline {
  agent any
  stages {
    stage('Compilar') {
      parallel {
        stage('Test') {
          steps {
            bat(script: 'cd C:\\Users\\PC\\Documents\\maestria\\scmProyect', returnStatus: true)
            bat 'grails test-app'
          }
        }
        stage('Compilar') {
          steps {
            bat(script: 'cd C:\\Users\\PC\\Documents\\maestria\\scmProyect', returnStatus: true)
            bat 'grails compile'
          }
        }
      }
    }
    stage('Copiar') {
      steps {
        bat 'vagrant up'
        bat 'vagrant ssh -c "sudo touch /opt/pruebassh"'
      }
    }
  }
}