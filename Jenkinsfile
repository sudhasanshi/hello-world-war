@Library('library_hello') _
pipeline {
    agent {label 'java'}
    stages {
        stage('Checkout') {
            steps {
                script {
                    sh  'rm -rf hello-world-war'
                    sh  'git clone https://github.com/tarundanda147/hello-world-war.git'
                }
            }
        }
        stage('build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
		
           stage('SonarQube Scan') {
               steps {
			   withSonarQubeEnv('sonar'){
				script {
                       sonar()
				}
             }
			}
}
}
}
