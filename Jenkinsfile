pipeline {
    agent any

    environment {
        PLAYWRIGHT_BROWSERS_PATH = '0'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Traore2375/Playwright.git'
            }
        }

        stage('Clean Project') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Install Playwright Browsers') {
            steps {
                bat 'mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Generate Cucumber Report') {
            steps {
                cucumber buildStatus: 'UNSTABLE',
                         fileIncludePattern: '**/cucumber.json',
                         sortingMethod: 'ALPHABETICAL'
            }
        }

        stage('Publish HTML Report') {
            steps {
                publishHTML([
                    allowMissing: true,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target',
                    reportFiles: 'cucumber.html',
                    reportName: 'HTML Cucumber Report'
                ])
            }
        }
    }

    post {
        success {
            echo '✅ Tests executed successfully'
        }

        failure {
            echo '❌ Tests failed - check reports'
        }

        always {
            archiveArtifacts artifacts: 'target/**/*.*', fingerprint: true
        }
    }
}