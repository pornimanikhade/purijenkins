pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                echo 'pull stage'
            }
        }
        stage('Test') { 
            steps {
                 echo 'test stage'
            }
        }
        stage('Deploy') { 
            steps {
                 echo 'deploy stage'
            }
        }
    }
}