pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Test') {
            steps {
                echo 'Vérification des fichiers du projet...'
                sh 'ls -l'
            }
        }

        stage('Build') {
            steps {
                echo 'Build terminé (projet web statique)'
            }
        }
    }

    post {
        success {
            echo 'Pipeline exécuté avec succès'
        }
        failure {
            echo 'Erreur dans le pipeline'
        }
    }
}
