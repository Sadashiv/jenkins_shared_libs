package com.sadashiv.jenkins.pipeline

class sada {

    private final script

    sada(script) {
        this.script = script
        script.echo "Welcome to " +this
        script.echo "Welcome to " +this.script
    }

    public void addFlow() {
        getGradle()
        getGitVersion()
        getBuildNumber()
        getCurrentDirectory()


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
            println("Hello World")
        }
    }

    void getCurrentDirectory() {
        script.stage("Get PWD") {
            String currentDir = new File(".").getAbsolutePath()
            script.echo "Get working directory " +currentDir
//            script.sh "./installpy3.sh -s"
//            def cmd=new CommandShell()
//            cmd.execute("cd /opt && ls -lrt")
            def command = "git --version"
            def proc = command.execute()
            proc.waitFor()              

            println "Process exit code: ${proc.exitValue()}"
            println "Std Err: ${proc.err.text}"
            println "Std Out: ${proc.in.text}"

        }
    }

}

