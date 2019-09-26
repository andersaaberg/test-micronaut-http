package test.micronaut.http

import javax.inject.Inject

class LowLevelClientController {

    @Inject
    LowLevelClient lowLevelClient

    def index() {
        render lowLevelClient.rxHttpClient.retrieve('/search?q=hello').blockingSingle()
    }
}
