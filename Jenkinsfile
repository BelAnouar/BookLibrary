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

        stage('check version java') {
                    steps {
                        sh '''
                            env | grep -e PATH -e JAVA_HOME
                            java -version
                        '''
                   }
        }
        stage('Build') {
                   steps {

                       sh 'mvn dependency:go-offline -B'
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