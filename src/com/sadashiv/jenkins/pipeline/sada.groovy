package com.sadashiv.jenkins.pipeline

class SadaGroovy {

    SadaGroovy(script) {
        this.script = script
    }

    public void addFlow() {
        getGradle()

    }

    void getGradle() {
        script.statge('Build') {
            script.sh 'git remote -v'
        }
    }

}

