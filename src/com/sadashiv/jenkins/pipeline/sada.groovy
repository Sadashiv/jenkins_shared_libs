package com.sadashiv.jenkins.pipeline

class sada {

    private final script

    sada(script) {
        this.script = script
    }

    public void addFlow() {
        getGradle()

    }

    void getGradle() {
        script.stage('Build') {
            script.echo "Hello World"
        }
    }

}

