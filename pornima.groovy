pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
               echo 'pull stage'
            }
        }
        stage('build') { 
            steps {
               sh 'mvn clean package'
            }
        }
        stage('Deploy') { 
            steps {
               echo 'deploy stage'
            }
        }
    }
}