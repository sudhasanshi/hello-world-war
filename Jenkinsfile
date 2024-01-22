@Library("my_shared_library") _

pipeline {
  agent {label 'java'}
  stages{
    stage('checkout') {
      steps {
        sh 'rm -rf hello-world-war'
        chekout 'https://github.com/tarundanda147/hello-world-war/'
        sh 'pwd'
       sh 'ls'
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
  }
}
