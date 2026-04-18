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

        stage('Install Dependencies') {
            steps {
                bat 'mvn install -DskipTests'
            }
        }

        stage('Install Playwright Browsers') {
            steps {
                bat 'mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test -Dmaven.test.failure.ignore=true'
            }
        }

        stage('Generate Reports') {
            steps {
                cucumber fileIncludePattern: '**/cucumber.json',
                         sortingMethod: 'ALPHABETICAL'

                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target',
                    reportFiles: 'cucumber.html',
                    reportName: 'Cucumber HTML Report'
                ])
            }
        }
    }

    post {

        success {
            echo '✅ Build and tests SUCCESS'
        }

        failure {
            echo '❌ Build FAILED - check reports'
        }

        always {
            archiveArtifacts artifacts: 'target/**/*.*', fingerprint: true
        }
    }
}