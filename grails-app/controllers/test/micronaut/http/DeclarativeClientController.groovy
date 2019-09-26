package test.micronaut.http

import javax.inject.Inject

class DeclarativeClientController {
    @Inject
    DeclarativeClient declarativeClient

    def index() {
        render declarativeClient.searchGoogle()
    }
}
