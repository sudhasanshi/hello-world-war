pipeline {
  agent {lable 'java'}
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
    }
}
