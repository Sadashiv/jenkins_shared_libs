import com.sadashiv.jenkins.pipeline

class CI {


    CI(def script) {
        this.script = script

    }
    void init() {
        initialParameters()
    }

    void initialParameters() {
        String node = 'agent1'
    }
    void build() {
        script.node('agent1') {
            script.echo "First script from calling the groovy code"
        }

    }

}
