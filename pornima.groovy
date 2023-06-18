pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                git branch: 'main', url: 'https://github.com/sagarfast/student-ui.git'
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