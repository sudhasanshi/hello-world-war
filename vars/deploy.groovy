def call() {
    echo "installing java project"
    sh '''
    echo "yes"
      sh 'cp /home/slave4/workspace/hello-world-war/target/hello-world-war-1.0.0.war /opt/apache-tomcat-9.0.85/webapps'
    '''
}
