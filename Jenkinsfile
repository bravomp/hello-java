pipeline {
	agent any
	environment {
		CONNECT = 'https://localhost:8080/'
		PROJECT = 'hello-java'
	}

	stages {
		stage('Build') {
			steps {
				sh 'mvn -B compile'
			}
		}
		stage('Test') {
			steps {
				sh 'mvn -B test'
			}
		}
		stage('Coverity Full Scan') {
			/* when {
				allOf {
					not { changeRequest() }
					expression { BRANCH_NAME ==~ /(master|stage|release)/ }
				}
			} */
			steps {
				echo "$CONNECT"
				withCoverityEnvironment(coverityInstanceUrl: "$CONNECT", projectName: "$PROJECT", streamName: "$PROJECT-$BRANCH_NAME") {
					sh '''
						cov-build --dir idir mvn -B clean compile
						cov-analyze --dir idir --ticker-mode none --strip-path $WORKSPACE --webapp-security
						cov-commit-defects --dir idir --ticker-mode none --url $COV_URL --stream $COV_STREAM \
							--description $BUILD_TAG --target Linux_x86_64 --version $GIT_COMMIT
					'''
				}
			}
		}
	}
}
