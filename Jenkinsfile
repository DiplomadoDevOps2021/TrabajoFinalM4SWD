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

        stage('Run') {
            steps {
                
            }
        }

        stage('TestJunit') {
            steps {
                sh "mvn test"
            }
        }

        stage('TestNewman') {
            steps {
                sh "nohup bash mvnw spring-boot:run &"
                sh "sleep 20"
                sh "ls"
                validaStatus('http://localhost:9000/rest/msdxc/dxc?ahorro=55000000&sueldo=1500000')
                sh "newman run .\LabMod4.postman_collection.json"
            }
        }
    }
}