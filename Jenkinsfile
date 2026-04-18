pipeline {
    agent any

    parameters {
        choice(name: 'ENV', choices: ['dev', 'qa', 'staging', 'prod'], description: 'Environment')
    }

    environment {
        PLAYWRIGHT_BROWSERS_PATH = '0'
    }

    stages {

        stage('Checkout') {
            steps {
                git url: 'https://github.com/Traore2375/Playwright.git', branch: 'master'
            }
        }

        stage('Display Environment') {
            steps {
                echo "Running tests on ENV = ${params.ENV}"
            }
        }

        stage('Clean Build') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Install Playwright Browsers') {
            steps {
                bat 'mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"'
            }
        }

        stage('Run Tests') {
            steps {
                bat "mvn test -Denv=${params.ENV} -Dmaven.test.failure.ignore=true"
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
            echo "✅ SUCCESS on ${params.ENV}"
        }

        failure {
            echo "❌ FAILURE on ${params.ENV} - check reports"
        }
    }
}