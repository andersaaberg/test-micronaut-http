Example project for testing Micronaut's low-level http-client and declarative http-client in Grails 4

Project is created using:
curl -O start.grails.org/test-micronaut-http.zip -d version=4.0.0 -d profile=rest-api

The only modification to build.gradle is adding the micronaut-http-client dependency:
`compile 'io.micronaut:micronaut-http-client`
as described at https://docs.grails.org/latest/guide/single.html#callingRestServices

# Testing
```
./gradlew bootRun
curl -i http://localhost:8080/lowLevelClient
curl -i http://localhost:8080/declarativeClient
```

/declarativeClient works just fine, but /lowLevelClient fails as it cannot find rxHttpClient bean to inject.