/*class MyUtilities {
    def sayHello()  {
        println "Welcome to groovy"
    }
}
myobj = new  MyUtilities()
println "myobj.sayHello()"
*/


timeStamps {
    ansiColor('xterm') {
        node(label: 'master') {
            stage(name: 'Start Stage') {
                sh "echo 'Hello World'"
                library identifier: "shared_libs@master"
                echo 'Load library'
            }
        }
    }

}
