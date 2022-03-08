// pipeline --> stages --> stage --> steps --> step
pipeline {
  agent {label 'terraform && jenkins'}

  environment {
    TEST="google.com"
    SSH=credentials('CENTOS_SSH')
  }

  stages {

    stage('Terraform Init') {
      steps {
        sh 'echo Hello World'
        sh 'echo ${TEST}'
        sh 'echo ${SSH}'
        sh 'sleep 30'
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