pipeline {
  agent any
  stages {
    stage('ssh') {
      steps {
        bat 'vagrant box add --name orig "C:\\Users\\PC\\Desktop\\maestria\\scm\\scm.box"'
        bat 'vagrant up'
      }
    }
  }
}