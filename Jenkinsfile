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
                    // Add any build steps here if needed
                }
            }
        }
        
        stage('push') {
            steps {
                // Add any Docker push steps here if needed
            }
        }
        
        stage('Helm Deploy') {
            steps {
                kubernetesDeploy(
                    configs: '',
                    kubeConfig: [path: ''],
                    kubeconfigId: 'eks-cluster',
                    secretName: '',
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
