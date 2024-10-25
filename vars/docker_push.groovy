def call(String Project, String ImageTag, String dockerhubuser){
   withCredentials([usernamePassword('credentialsId':"dockerhubcred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                       
                  
                sh 'docker login -u ${dockerHubUser} -p ${dockerHubPass}'
   }
                // sh 'docker image tag notes-app:latest $dockerHubUser/notes-app:latest'
                sh 'docker push ${dockerHubUser}/${Project}:${ImageTag}'
   
}
