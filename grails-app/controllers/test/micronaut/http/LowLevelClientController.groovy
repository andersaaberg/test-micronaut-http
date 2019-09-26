package test.micronaut.http

import io.micronaut.http.client.DefaultHttpClient
import io.micronaut.http.client.DefaultHttpClientConfiguration
import io.micronaut.http.client.RxHttpClient
import javax.annotation.PostConstruct
import javax.inject.Inject

class LowLevelClientController {

    @Inject
    DefaultHttpClientConfiguration defaultHttpClientConfiguration

    RxHttpClient rxHttpClient

    @PostConstruct
    void initHttpClient() {
        rxHttpClient = new DefaultHttpClient(new URL('http://google.com'), defaultHttpClientConfiguration)
    }

    def index() {
        render rxHttpClient.retrieve('/search?q=hello').blockingSingle()
    }
}
