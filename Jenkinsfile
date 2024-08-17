pipeline {
    agent any
    tools {
        maven "maven"
        jdk "jdk"
    }
    stages {
        stage('Initialize'){
            steps{
                echo "initialize "
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }

        stage('Check Directory') {
                    steps {
                        sh 'ls '
                   }
        }
        stage('Build') {
                    steps {
                        dir("/var/lib/jenkins/workspace/Book") {

                           sh 'mvn -B -DskipTests clean package'
                        }

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