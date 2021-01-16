pipeline {
    agent any
    tools{
        maven "3.6.0"
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