package ru.academy.http.server;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class HttpStaticServer {

    static void main() throws IOException {
        InetSocketAddress address = new InetSocketAddress(80);
        int backlog = 0;

        Path staticFilesDirectoryPath = Path.of("C:\\Users\\Academy\\Desktop\\Static Files");
        HttpHandler httpHandler = new StaticHttpHandler(staticFilesDirectoryPath);

        HttpServer httpServer = HttpServer.create(address, backlog);
        httpServer.createContext("/", httpHandler);

        httpServer.start();
    }
}

class StaticHttpHandler implements HttpHandler {

    private final Path staticFilesDirectoryPath;

    StaticHttpHandler(Path staticFilesDirectoryPath) {
        this.staticFilesDirectoryPath = staticFilesDirectoryPath;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        URI requestUri = exchange.getRequestURI();

        String requestUriAsString = requestUri.toString();
        requestUriAsString = requestUriAsString.replaceFirst("^/+", "");

        Path targetFilePath = staticFilesDirectoryPath.resolve(requestUriAsString);

        if (!Files.exists(targetFilePath)) {
            sendError(exchange, "Запрашиваемый ресурс не найден!", 404);
            return;
        }

        byte[] fileBytes = Files.readAllBytes(targetFilePath);

        exchange.sendResponseHeaders(200, fileBytes.length);

        try (OutputStream outputStream = exchange.getResponseBody()) {
            outputStream.write(fileBytes);
        }
    }

    private void sendError(HttpExchange exchange, String errorMessage, int statusCode) throws IOException {
        String htmlContent = "<h1>При обработке запроса возникла ошибка</h1>" +
                             "<hr>" +
                             "<p style=\"color: red;\">" + errorMessage + "</p>";

        byte[] contentBytes = htmlContent.getBytes(StandardCharsets.UTF_8);

        Headers responseHeaders = exchange.getResponseHeaders();
        responseHeaders.add("Content-Type", "text/html; charset=UTF-8");

        exchange.sendResponseHeaders(statusCode, contentBytes.length);

        try (OutputStream outputStream = exchange.getResponseBody()) {
            outputStream.write(contentBytes);
        }
    }
}
