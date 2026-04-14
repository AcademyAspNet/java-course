<%@ page import="java.util.*" pageEncoding="UTF-8" %>

<%!
    boolean hasProblems() {
        Random random = new Random();
        return random.nextInt() % 2 == 0;
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Главная страница</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-primary border-bottom">
          <div class="container-md">
            <a class="navbar-brand text-white" href="index.jsp">Java Server Pages</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link text-white" href="index.jsp">Главная страница</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-white" href="hello.jsp">Перейти к форме "Привет!"</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        <main class="container-md">
            <% if (hasProblems()) { %>
                <div class="alert alert-danger mt-3">
                    <span>
                        К сожалению, веб-приложение может временно работать некорректно.
                        Мы знаем о проблеме и решим её как можно скорее.
                    </span>
                </div>
            <% } else { %>
                <div class="alert alert-primary mt-3">
                    <span>
                        Проблем с сайтом не наблюдается.
                    </span>
                </div>
            <% } %>
        </main>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
    </body>
</html>