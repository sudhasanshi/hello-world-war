@Library('library-demo') _

pipeline {
  agent {
    label 'java'
  }
  stages {
    stage('Demo') {
      steps {
        sh 'rm -rf hello-world-war'
        sh 'git clone https://github.com/tarundanda147/hello-world-war.git'
      }
    }
    stage('Build') {
      steps {
        script {
          build 'install'
        }
      }
    }
      stage('deploy') {
        steps {
          sh 'cp /home/slave4/workspace/hello-world-war/target/hello-world-war-1.0.0.war opt/apache-tomcat-9.0.85/webapps'

        }
      }
    }
  }
