@Library('library-demo') _

pipeline {
    agent { label 'java' }
    stages {
       stage('Demo') {
           steps {
                echo 'Executing a shared lib function'
                sayHello 'Devops'
           }
         }
       }
     }
