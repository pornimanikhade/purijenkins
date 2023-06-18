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
                 sh 'mvn clean package'
            }
        }
        stage('Deploy') { 
            steps {
                deploy adapters: [tomcat8(credentialsId: 'tomcat-creds-1', path: '', url: 'http://3.141.192.77:8080/')], contextPath: '/', war: '**/*.war'
            }
        }
    }
}