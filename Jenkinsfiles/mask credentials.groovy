def artifactory_vars = 'cred-id'

node {
withCredentials([
[$class: 'UsernamePasswordMultiBinding', credentialsId: artifactory_vars,
usernameVariable: 'ARTIFACTORY_USER', passwordVariable:'ARTIFACTORY_API_KEY'],

]){
stage('echo variables') {

 sh """(
echo "User: ${ARTIFACTORY_USER}"
echo "Pass: ${ARTIFACTORY_API_KEY}"

)"""
}
}
}
