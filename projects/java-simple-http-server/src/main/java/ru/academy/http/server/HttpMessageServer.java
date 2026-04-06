package ru.academy.http.server;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class HttpMessageServer {

    static void main() throws IOException {
        // HTTP: 80 или 8080, HTTPS: 443
        InetSocketAddress address = new InetSocketAddress(80);
        int backlog = 0;

        HttpServer httpServer = HttpServer.create(address, backlog);

        httpServer.createContext("/", (exchange) -> {
            String responseMessage = "<h1>Привет, мир!</h1>";
            byte[] responseMessageAsBytes = responseMessage.getBytes(StandardCharsets.UTF_8);

            Headers responseHeaders = exchange.getResponseHeaders();
            responseHeaders.add("Content-Type", "text/html;charset=UTF-8");

            exchange.sendResponseHeaders(200, responseMessageAsBytes.length);

            try (OutputStream outputStream = exchange.getResponseBody()) {
                outputStream.write(responseMessageAsBytes);
            }
        });

        // http://127.0.0.1 или http://localhost
        httpServer.start();
    }
}
