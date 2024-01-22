pipeline {
  agent any
  stages {
    stage('Unit Test') {
      steps {
        sh 'mvn clean test'
      }
    }
    stage('Deploy Standalone') {
      steps {
        sh 'mvn deploy -P standalone'
      }
    }
    stage('Deploy AnyPoint') {
      environment {
        ANYPOINT_CREDENTIALS = credentials('anypoint.credentials')
      }
      steps {
        sh 'mvn deploy -P arm -Darm.target.name=local-4.0.0-ee -Danypoint.username=${ANYPOINT_CREDENTIALS_USR}  -Danypoint.password=${ANYPOINT_CREDENTIALS_PSW}'
      }
    }
    stage('Deploy CloudHub') {
      environment {
        ANYPOINT_CREDENTIALS = credentials('anypoint.credentials')
      }
      steps {
        sh 'mvn deploy -P cloudhub -Dmule.version=4.0.0 -Danypoint.username=${ANYPOINT_CREDENTIALS_USR} -Danypoint.password=${ANYPOINT_CREDENTIALS_PSW}'
      }
    }
  }
}
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
      stage('deploy') {
        steps {
          sh 'scp /home/slave4/workspace/hello-world-war/target/hello-world-war-1.0.0.war root@172.31.9.118:/opt/apache-tomcat-9.0.85/webapps'

        }
      }
    }
  }
