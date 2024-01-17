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
              sh 'scp /home/slave4/workspace/apachetomcat/target/hello-world-war-1.0.0.war root@172.31.9.118:/opt/apache-tomcat-9.0.85/webapps'
     }
  }
              stage('restart') {
            steps {
                    sh 'ls -l /opt/apache-tomcat-9.0.85/bin/catalina.sh'
                    sh 'ls -l /opt/apache-tomcat-9.0.85/bin/shutdown.sh'
                    sh 'chmod +x /opt/apache-tomcat-9.0.85/bin/*.sh'
                    sh '/opt/apache-tomcat-9.0.85/bin/shutdown.sh'
              sh '/opt/apache-tomcat-9.0.85/bin/shutdown.sh'
              sh '/opt/apache-tomcat-9.0.85/bin/startup.sh'
            }
        }
    }
}
