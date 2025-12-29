pipeline {
 agent any
 stages {
  stage('Checkout') {
    steps {
        checkout scm
        }
    }
  stage('Build & Test') {
     steps {
         sh 'mvn clean test'
         }
         }
  stage('Package') {
     steps {
         sh 'mvn package -DskipTests'
         }
         }
  stage('Docker Build') {
     steps {
         sh 'docker build -t spring-ci-cd:latest .'
         }
         }
  stage('Deploy') {
   steps {
    sh '''
    docker stop spring-app || true
    docker rm spring-app || true
    docker run -d -p 8082:8082 --name spring-app spring-ci-cd:latest
    '''
   }
  }
 }
}
