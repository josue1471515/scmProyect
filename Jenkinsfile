pipeline {
  agent any
  stages {
    stage('ssh') {
      steps {
        bat(script: 'vagrant box add --name orig "C:\\Users\\PC\\Desktop\\maestria\\scm\\scm.box" --force', returnStatus: true, returnStdout: true)
        bat 'vagrant up'
      }
    }
  }
}