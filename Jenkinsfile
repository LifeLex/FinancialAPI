pipeline {
    agent any
    environment{
        PATH= "/usr/share/maven/bin:$PATH"
    }
    tools{
        maven "3.6.3"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn -version"
                sh 'mvn clean package'
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