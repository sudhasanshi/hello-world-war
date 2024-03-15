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
              dir(hello-world-war)
              {
                 sh 'docker build -t tomcat-war:1.0 .'
              }
            }
 }
    stage('deploy') {
            steps {
              sh 'docker rm -f tomcat-war'
              sh 'docekr run -d -p 5555:8080 --name tomcat-war tomcat-war:1.0'
            }
        }
    }
}
