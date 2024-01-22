@Library('library-demo') _


pipeline {
  agent {label 'java'}
  stages{
    stage('Demo') {
      steps {
        sh 'rm -rf hello-world-war'
        checkout 'https://github.com/tarundanda147/hello-world-war.git'
      }
   }
}
}
