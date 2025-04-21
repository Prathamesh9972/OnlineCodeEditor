pipeline {
    agent any
    
    environment {
        REPO_URL = 'https://github.com/Prathamesh9972/OnlineCodeEditor.git'
        DOCKER_COMPOSE_FILE = 'docker-compose.yml'
    }
    
    triggers {
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: REPO_URL
            }
        }
        
        stage('Build Docker Containers') {
            steps {
                script {
                    sh 'docker-compose -f $DOCKER_COMPOSE_FILE build'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    sh 'docker-compose run --rm python_executor pytest'
                    sh 'docker-compose run --rm js_executor npm test'
                    sh 'docker-compose run --rm java_executor java -cp /app Main'
                    sh 'docker-compose run --rm cpp_executor ./run_tests.sh'
                }
            }
        }

        stage('Deploy to Production') {
            steps {
                script {
                    sh 'docker-compose -f docker-compose.prod.yml up -d'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and Deployment Successful!'
        }
        failure {
            echo 'Build or Deployment Failed!'
        }
    }
}
