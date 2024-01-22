def call() {
       // Your SonarQube scan steps go here
       
       mvn sonar:sonar \
  -Dsonar.projectKey=groovypipeline \
  -Dsonar.host.url=http://65.1.147.242:9000 \
  -Dsonar.login=09388cf9d7699b6b40c7203f8a51e23105b57be4
   }
return this
