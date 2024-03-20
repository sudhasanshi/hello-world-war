pipeline {
    agent { label 'slave101' }

    stages {
        stage('checkout') {
            steps {
                sh 'rm -rf hello-world-war'
                sh 'git clone https://github.com/tarundanda147/hello-world-war/'
            }
        }
        
        stage('build') {
            steps {
                dir("hello-world-war") {
                    sh 'echo "inside build"'
                    sh 'docker build -t tomcat-war:$(BUILD_NUMBER) .'
                }
            }
        }
        
        stage('push') {
            steps {
                withCredentials([us
