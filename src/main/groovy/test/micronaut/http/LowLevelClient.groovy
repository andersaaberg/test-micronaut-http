package test.micronaut.http

import javax.inject.Inject
import javax.inject.Singleton
import groovy.transform.CompileStatic
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client

@CompileStatic
@Singleton
class LowLevelClient {

    @Client('http://www.google.com')
    @Inject
    RxHttpClient rxHttpClient
}
