class MyUtilities {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
    }
}
def myJob = job('example')
MyUtilities.addMyFeature(myJob)



/*timeStamps {
    ansiColor('xterm') {
        node('master') {
            stage('Start Stage') {
                sh "echo 'Hello World'"
                library identifier: "shared_libs@master"
                sh "echo 'Load library'"
            }
        }
    }

}
*/
