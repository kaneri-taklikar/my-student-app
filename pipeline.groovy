pipeline {
    agent { label 'slave' }
    stages {
        stage('Git Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/kaneri-taklikar/my-student-app.git'
            }
        }
        stage('Build') {
            steps {
                sh '/opt/maven/bin/mbn clean package'
            }
        }
        stage('Test') {
            steps {
                echo "Running tests..."
            }
        }
    }
}

     
