pipeline {
    agent any
    parameters {
        text(name: 'CHANGELOG', defaultValue: '', description: 'Producation developement, staging changes ')

        choice(name: 'ENVIROMENT', choices: ['DEVELOMENT', 'STAGING', 'PRODUCATION'], description: 'Different stage product')

        password(name: 'APIKEY', defaultValue: 'ABC123', description: 'Change the APIkey')
    }
    stages {
        stage('Test') {
            steps {
                //echo "Hello ${params.PERSON}"
                echo "testing phase"
            }
        }
        stage('Deploy') {
            steps {
                //echo "Hello ${params.PERSON}"
                echo "Deployment stage"
            }
        }
        stage('Report') {
            steps {
                echo "Generate a report"
                sh "printf \"Thisw is the change log.\" > report.txt"

            }
        }
    }
}