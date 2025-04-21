pipeline {
  agent any

  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/Prathamesh9972/OnlineCodeEditor.git'
      }
    }

    stage('Build Containers') {
      steps {
        sh 'docker-compose build'
      }
    }

    stage('Run Containers') {
      steps {
        sh 'docker-compose down'
        sh 'docker-compose up -d'
      }
    }
  }
}
