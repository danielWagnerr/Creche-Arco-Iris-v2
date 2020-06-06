pipeline {
   agent any
   stages {
      stage('Build') {
         steps {
            echo 'Building Creche Arco Iris'
            sh “mvn spring-boot:run”
         }
      }
     stage(“Confirmar Testes”) {
         steps {
            input: “Rodar os testes?”
         }
      }
      stage('Test') {
         steps {
            echo 'Testing Creche Arco Iris'
            sh ‘mvn test’
         }
      }
      stage('Deploy') {
         steps {
            echo 'Deploying Creche Arco Iris'
            sh “mvn spring-boot:run”
         }
      }
   }
}
