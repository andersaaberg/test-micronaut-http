package test.micronaut.http

import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@CompileStatic
@Client('http://www.google.com')
interface DeclarativeClient {

    @Get(uri='/search?q=hello', consumes=MediaType.TEXT_HTML)
    String searchGoogle()
}
