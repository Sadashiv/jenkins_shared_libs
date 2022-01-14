package com.sadashiv.jenkins.pipeline

class sada {

    private final script

    sada(script) {
        this.script = script
    }

    public void addFlow() {
        getGradle()
        getGitVersion()
        getBuildNumber()


    }

    void getGradle() {
        script.stage('Gradle Version') {
            script.echo "gradle -version"
        }
    }
    void getGitVersion() {
        script.stage("Git version") {
            script.echo "git --version"
        }
    }
    void getBuildNumber() {
        script.stage("Build Number") {
            script.echo "Latest Build Number" + script.env.BUILD_NUMBER
        }
    }

}

