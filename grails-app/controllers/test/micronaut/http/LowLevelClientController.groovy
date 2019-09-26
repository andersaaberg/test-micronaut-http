package test.micronaut.http

import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client

import javax.inject.Inject

class LowLevelClientController {

    @Inject
    @Client('http://www.google.com')
    RxHttpClient rxHttpClient

    def index() {
        render rxHttpClient.retrieve('/search?q=hello').blockingSingle()
    }
}
