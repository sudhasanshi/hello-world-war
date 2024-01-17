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
               sh 'cp /home/slave4/workspace/apachetomcat/target/hello-world-war-1.0.0.war /opt/apache-tomcat-9.0.85/webapps'
            }
        }
    }
}
