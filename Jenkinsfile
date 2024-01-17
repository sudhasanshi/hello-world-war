pipeline {
  agent {label 'java'}
  stages{
    stage('checkout') {
      steps {
        sh 'rm -rf hello-world-war'
        sh 'git clone https://github.com/tarundanda147/hello-world-war/'
   }
}
 stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn clean install'
     }
 }
    stage('deploy') {
            steps {
              sh 'ssh root@172.31.9.118'
              sh 'scp /home/slave4/workspace/apachetomcat/target/ root@172.31.9.118:/opt/apache-tomcat-9.0.85/webapps'
   
            }
        }
    }
}
