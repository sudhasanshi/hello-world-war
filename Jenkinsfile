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
