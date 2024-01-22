@Library('library-demo') _

pipeline {
    agent { lable 'java' }
    stages {
       stage('Demo') {
           steps {
                echo 'Executing a shared lib function'
                sayHello 'Devops'
           }
         }
       }
     }
