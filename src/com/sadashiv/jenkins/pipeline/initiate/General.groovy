import groovy.transform.Field
import hudson.model.Cause


timestamps {

    ansicolor('xterm') {
        def flow
        node('agent1') {
            stage('Initiate') {
                echo "Started running"
            }

        }
    }

}
