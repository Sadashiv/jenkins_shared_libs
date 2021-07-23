class MyUtilities {
    def sayHello()  {
        println "Welcome to groovy"
    }
}
myobj = new  MyUtilities()
println myobj.sayHello()



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
