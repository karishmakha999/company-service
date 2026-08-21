pipeline {

    agent any

    stages {

        stage('Build and Test') {
            steps {
                bat 'mvn clean verify'
            }
        }

      
            stage('SonarQube Analysis') {
    steps {
        withCredentials([
            string(credentialsId: 'companyDataToken', variable: 'SONAR_TOKEN')
        ]) {
			 bat 'if "%SONAR_TOKEN%"=="" (echo TOKEN IS EMPTY) else (echo TOKEN IS AVAILABLE)'
            bat 'mvn sonar:sonar -Dsonar.token=%SONAR_TOKEN%'
        }
    }
}
        }

    }
}