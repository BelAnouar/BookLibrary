pipeline {
    agent any
    tools {
        maven "maven"
        jdk "jdk"
    }
    environment {
        JAVA_HOME = "/opt/java/openjdk"
        PATH = "${JAVA_HOME}/bin:${M2_HOME}/bin:${env.PATH}"
    }
    stages {
        stage('Initialize'){
            steps {
                echo "Initialize"
                echo "JAVA_HOME = ${env.JAVA_HOME}"
                echo "M2_HOME = /opt/maven"
                echo "PATH = ${env.PATH}"
            }
        }

        stage('Check Directory') {
            steps {
                sh 'ls'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
    post {
        always {
            junit(
                allowEmptyResults: true,
                testResults: '*/test-reports/.xml'
            )
        }
    }
}
