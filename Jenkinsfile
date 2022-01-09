@Library('shared_libs@master')_
import com.sadashiv.jenkins.pipeline
node {
    pipeline = new SadaGroovy(this)
    pipeline.addFlow()
}

/**
package com.sadashiv.jenkins.pipeline.sada.*

pipeline {
    agent any

    stages {

        stage('Demo') {
            steps {
                echo 'Hello World'
                hello("Sadashiv")
            }
        }

        stage('Add'){
            steps {

                echo "Add two number is:"
                airthop.add(1,2)
            }
        }

        stage('Multip'){
            steps {

                echo "Multiply two number is:"
                airthop.mul(2,2)
            }
        }

        stage("From package") {
            steps{
                script {
                    def obj = new com.sadashiv.jenkins.pipeline.sada().testFunc()
                    System.out.println("Hello")
                    System.out.println(obj)
                }
            }
    }
}
**/
