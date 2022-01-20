import groovy.transform.Field
import hudson.model.Cause


timestamps {

    ansiColor('xterm') {
        def flow
        node('agent1') {
            stage('Initiate') {
                echo "Started running"
            }
            String flowName = "com.sadashiv.jenkins.pipeline.CI"
      //      class flowClass = Class.forName(flowName, true, this.class.classLoader)
      //      flow = flowClass.getrConstructor(object.class) newInstance(this)
            echo "Flow ${flowName}"

        }
    }
    //flow.init()
    //flow.build()

}
