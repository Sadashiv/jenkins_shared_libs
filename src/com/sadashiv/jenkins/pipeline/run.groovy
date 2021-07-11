package com.sadashiv.jenkins.pipeline

public class FirstGroovy {

    //public static void main(String[] args){
    //public void GroovyMessage() {
    //    System.out.println("My First groovy packages")
    //}
    def classmessage(){
        return "My first package"
        //System.out.println("My first package")
    }
}

def groovyobj = new FirstGroovy()
System.out.println(groovyobj.classmessage())
System.out.println("Hello")
/*stage("New Stage") {
    script {
        System.out.println("Hello")
    }
}
*/
assert groovyobj.classmessage() == "My first package"
