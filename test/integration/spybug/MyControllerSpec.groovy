package spybug

import grails.test.spock.IntegrationSpec

import spock.lang.*

class MyControllerSpec extends IntegrationSpec {
    def grailsApplication

    MyController myController = new MyController()
    def mockMyService

    def "My spy should be called"() {
        when:
            mockMyService = Spy(MyService) {
                methodToSpy() >> {
                    println "methodToSpy called"
                } // stub out content of this fn
            }
            myController.myService = mockMyService
            
            myController.callService()

        then:
            1 * mockMyService.methodToSpy()
    }
}
