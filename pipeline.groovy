pipeline {
    agent {
        label,'slave' 
    }
    stages { 
      stage( 'git checkout') {
           steps {
              git branch:'main', url: 'https://github.com/kaneri-taklikar/my-student-app.git'
          }
       } 
      stage( 'build-stage') { 
          steps {
              sh '/opt/maven/bin/mbn clean package'
          }
      }
      stage( 'test-stage') {
           steps { 
               echo "this is test-stage"
           }
      }
      stage( 'deploy-stage') {
           steps {
              echo "this is deply-stage"
           } 
       }
    } 
 }
     
