def call() {
       // Your SonarQube scan steps go here 
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonar-token -Dsonar.host.url=http://65.1.147.242:9000 -Dsonar.java.binaries=target/classes'
       }
return this
