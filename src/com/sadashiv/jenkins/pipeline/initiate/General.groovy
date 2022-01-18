import groovy.transform.Field
import hudson.model.Cause


timestamps {

    ansiColor('xterm') {
        def flow
        node('agent1') {
            stage('Initiate') {
                echo "Started running"
            }

        }
    }

}
