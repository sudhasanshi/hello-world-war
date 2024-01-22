@Library("my_shared_library") _

pipeline {
  agent {label 'java'}
  stages{
    stage('checkout') {
      steps {
        sh 'rm -rf hello-world-war'
        chekout()
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
