package com.sadashiv.jenkins.pipeline;

//class SadaGroovy {
//   static void main(String[] args){

    def testFunc (){
        //echo "HELLO FROM testFunc from class SadaGroovy"
        System.out.println("Welcome to groovy class SadaGroovy")
    }
//    return this;
//}
//}

def z = new com.sadashiv.jenkins.pipeline.sada()
System.out.println(z.testFunc())
