pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                //sh
                bat "mvn test -Dcucumber.filter.tags=@smoke"
            }
        }
    }
}