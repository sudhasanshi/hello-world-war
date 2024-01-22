@Library('library-demo') _

pipeline {
    agent any
    stages {
       stage('Demo') {
           steps {
                echo 'Executing a shared lib function'
                sayHello 'Devops'
           }
         }
       }
