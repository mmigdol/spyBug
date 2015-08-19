package spybug

class MyController {

	def myService

    def callService() {
    	println "in callService"
    	myService.serviceMethod()
    }
}

