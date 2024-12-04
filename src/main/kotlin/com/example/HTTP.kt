package com.example

import com.codahale.metrics.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.metrics.dropwizard.*
import io.ktor.server.plugins.callid.*
import io.ktor.server.plugins.calllogging.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.plugins.swagger.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.util.concurrent.TimeUnit
import org.slf4j.event.*

fun Application.configureHTTP() {
    routing {
        swaggerUI(path = "openapi")
    }
    install(CORS) {
        allowMethod(HttpMethod.Options)
        allowMethod(HttpMethod.Put)
        allowMethod(HttpMethod.Delete)
        allowMethod(HttpMethod.Patch)
        allowHeader(HttpHeaders.Authorization)
        allowHeader("MyCustomHeader")
        anyHost() // @TODO: Don't do this in production if possible. Try to limit it.
    }
}
