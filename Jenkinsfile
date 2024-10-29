pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Book-service-CI-CD/Author-Service', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                echo 'Building Author Service...'
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing Author Service...'
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying Author Service...'
                bat 'docker build -t author-service:latest .'
                bat 'docker run -d -p 8082:8080 author-service:latest'
            }
        }
    }
}
