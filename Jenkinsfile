pipeline {
    agent any

    stages {
        stage('checkout') {
            steps {
                sh 'rm -rf hello-world-war'
                sh 'git clone https://github.com/tarundanda147/hello-world-war/'
            }
        }
        
        stage('build') {
            steps {
                dir("hello-world-war") {
                    sh 'echo "inside build"'
                    // Removed Docker build step
                }
            }
        }
        
        stage('push') {
            steps {
                // Removed Docker push step
            }
        }
        
        stage('Helm Deploy') {
            steps {
                kubernetesDeploy(
                    configs: '',
                    kubeConfig: [path: ''],
                    kubeconfigId: 'eks-cluster',
                    secretNamespace: 'hello-world-war',
                    ssh: [sshCredentialsId: '*', sshServer: ''],
                    textCredentials: [
                        certificateAuthorityData: '',
                        clientCertificateData: '',
                        clientKeyData: '',
                        serverUrl: 'https://'
                    ]
                ) {
                    echo 'Deploying to Kubernetes using Helm'
                    sh "helm upgrade first --install hello-world-war --namespace hello-world-war --set image.tag=$BUILD_NUMBER"
                }
            }
        }
    }
}
