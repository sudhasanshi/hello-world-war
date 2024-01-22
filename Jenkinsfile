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
 //stage('build') {
 //           steps {
 //               sh 'mvn --version'
 //               sh 'mvn clean install'
 //    }
 //}
 //  stage('deploy') {
 //           steps {
 //             sh 'scp /home/slave4/workspace/hello-world-war/target/hello-world-war-1.0.0.war root@172.31.9.118:/opt/apache-tomcat-9.0.85/webapps'
   
 //           }
 //       }
 //  }
//}
