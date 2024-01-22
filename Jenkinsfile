@Library('library-demo') _

pipeline {
    agent { label 'java' }
    stages {
       stage('Checkout') {
            steps {
                script {
                    sh("""
                       rm -rf hello-world-war
                       git clone https://github.com/tarundanda147/hello-world-war.git
                       ls -ltr
                    """)
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    build 'install'
                }
            }
        }
    }
}
