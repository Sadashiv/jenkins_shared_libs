def call(name) {
    echo "Weclome ${name} to shared libs"
}

def install() {
    sh "cp /opt/ssg/installpy3.sh ."
    sh "./installpy3.sh -s"
}
