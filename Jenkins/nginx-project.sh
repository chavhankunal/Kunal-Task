pipeline {
    agent{
        label 'kunal'
    }
    stages{
        stage("Git Pull"){
            steps{
            sh'''git clone https://github.com/chavhankunal/nginx.git'''
            sh'''sudo bash ./nginx/file.sh'''
        }
        
        }
    }
}