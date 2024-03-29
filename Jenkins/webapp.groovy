pipeline{
    agent {
        label 'agent1'
    }
    stages{
        stage('installing apache2'){
            steps{
                sh ''' sudo apt install apache2 -y '''
                sh '''  sudo systemctl start apache2'''
            }
        }
        stage('Downloding Templet'){
            steps{
                sh '''sudo wget https://www.free-css.com/assets/files/free-css-templates/download/page296/spering.zip'''
            }
        }
        stage('installing unzip and unziping project')
        {
            steps{
                sh ''' sudo apt install unzip -y'''
                sh ''' sudo unzip spering.zip'''
            }
        }
        stage('moving files to apache2')
        {
            steps{
                sh ''' sudo rm -rf /var/www/html/*'''
                sh ''' sudo mv ./spering-html/* /var/www/html/'''
            }
        }
    }
}