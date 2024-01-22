@Library("library_hello") _
pipeline {
  agent { label 'java' }
  stages{
    stage('checkout') {
      steps {
        sh 'rm -rf hello-world-war'
        sh 'git clone https://github.com/tarundanda147/hello-world-war/'
      }
    }
    stage('Build') {
            steps {
                script {
                    sh 'pwd'
                    sh 'ls'
                    build 'package'
        }
      }
    }
    stage('Deploy') {
      steps {
        script {
          deploy()
        }
      }
    }
  }
}
