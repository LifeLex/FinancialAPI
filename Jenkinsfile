pipeline {
    agent any
    tools{
        docker
        maven
    }
    stages {
        stage('Build') {
            steps {
                sh "mvn -version"
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}