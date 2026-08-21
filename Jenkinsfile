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
			 bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:5.5.0.6356:sonar -Dsonar.token=%SONAR_TOKEN% -Dsonar.organization=karishmakha999 -Dsonar.projectKey=karishmakha999_company-service'
        }
    }
}
        }

    }
