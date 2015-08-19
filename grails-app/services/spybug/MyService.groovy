package spybug

class MyService {

    def serviceMethod() {
    	println "in serviceMethod about to call methodToSpy"
    	methodToSpy()
    	println "Back from methodToSpy"
    }

    def methodToSpy() {
    	println "I should not get called"
    }
}
