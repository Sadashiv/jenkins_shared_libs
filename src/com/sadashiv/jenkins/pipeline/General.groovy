import groovy.transform.Field
import hudson.model.Cause


@Field boolean allowManualBuilds

timestamps {

    ansiColor('xterm') {
        def flow
        node('agent1') {
            stage('Initiate') {
                echo "Started running"
/*                if (!allowManualBuilds && currentBuild.rawBuild.getCause(Cause.UserIDCause)) {
                    errot("Can't run this jenkins job manually")
                }*/
            }
            stage('Build') {
                echo "Runnning build"
                def list = ['Grace','Rob','Emmy']
                echo assert ('Emmy' in list)
            }
            String flowName = "com.sadashiv.jenkins.pipeline.CI"
      //     class flowClass = Class.forName(flowName, true, this.class.classLoader)
      //      flow = flowClass.getrConstructor(object.class) newInstance(this)
            echo "Flow ${flowName}"

        }
    }
    //flow.init()
    //flow.build()

}
