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
		stage('Build Report') {
			node{	
				bat "bundle install"
				bat "bundle exec rake build spec"
				archive (includes: ‘pkg/*.gem’)
				publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'Coverage', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: ''])
			}
		}
    }
}