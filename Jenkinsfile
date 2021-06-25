pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Test') {
            steps {
                //sh
                bat "mvn test -Dcucumber.filter.tags=@smoke"
            }
        }
    }
}