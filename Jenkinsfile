// pipeline --> stages --> stage --> steps --> step
pipeline {
  agent {label 'terraform && jenkins'}

  environment {
    TEST="google.com"
  }

  stages {

    stage('Terraform Init') {
      steps {
        sh 'echo Hello World'
        sh 'echo $TEST'
      }
    }

    stage('Terraform Plan') {
      steps {
        sh 'echo Hello World'
      }
    }

    stage('Terraform Apply') {
      steps {
        sh 'echo Hello World'
      }
    }
  }

  post {
    always {
      sh 'echo Hello'
    }
 }
}