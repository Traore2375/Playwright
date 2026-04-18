pipeline {
    agent any

    environment {
        PLAYWRIGHT_BROWSERS_PATH = '0'
    }

    stages {

        stage('Checkout') {
            steps {
                git url: 'https://github.com/Traore2375/Playwright.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Install Playwright') {
            steps {
                bat 'mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test -Dmaven.test.failure.ignore=true'
            }
        }

        stage('Generate Cucumber Report') {
            steps {
                cucumber fileIncludePattern: '**/cucumber.json'
            }
        }
    }

    post {

        always {
            archiveArtifacts artifacts: 'target/**/*.*', fingerprint: true
        }

        success {
            echo '✅ SUCCESS'
        }

        failure {
            echo '❌ FAILURE - check reports'
        }
    }
}