pipeline {
  agent any
  stages {
    stage('Commit') {
      parallel {
        stage('Pruebas unitarias') {
          steps {
            sh '''cd "C:\\Users\\PC\\Documents\\maestria\\scmProyect\\"
grails test-app'''
          }
        }
        stage('Compilar') {
          steps {
            sh '''cd "C:\\Users\\PC\\Documents\\maestria\\scmProyect"
grails compile'''
          }
        }
      }
    }
  }
}