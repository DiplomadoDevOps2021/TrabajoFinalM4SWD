pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                sh "mvn clean"
            }
        }

        stage('Compile') {
            steps {
                sh "mvn compile"
            }
        }

       /* stage('TestJunit') {
            steps {
                sh "mvn test"
            }
        }
*/
        stage('TestNewman') {
            steps {
                sh "nohup bash mvnw spring-boot:run &"
                sh "sleep 20"
                sh "ls"
                sh "newman run LabMod4.postman_collection.json"
            }
        }
    }
}