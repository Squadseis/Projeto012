<%-- 
    Document   : carrinho
    Created on : 9 de fev. de 2024, 16:46:41
    Author     : nalis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>carrinho</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="card text-bg-dark m-3"  id="categorias">
                    <img src="imagens/produtos/pete.png" class="card-img"  id="categorias">
                    <a href="#" class="text-center card-img-overlay nav-link">Acessórios</a>
                </div>
            </div>

            <div class="col">
                <div class="card text-bg-dark m-3"  id="categorias">
                    <img src="imagens/produtos/pulseira1.jpg" class="card-img"  id="categorias">
                    <a href="#" class="text-center card-img-overlay nav-link">Acessórios</a>
                </div>
            </div>

            <div class="col">
                <div class="card text-bg-dark m-3"  id="categorias">
                    <img src="imagens/produtos/peixe.png" class="card-img"  id="categorias">
                    <a href="#" class="text-center card-img-overlay nav-link">Acessórios</a>
                </div>
            </div>

            <div class="col">
                <div class="card text-bg-dark m-3"  id="categorias">
                    <img src="imagens/produtos/pete.png" class="card-img"  id="categorias">
                    <a href="#" class="text-center card-img-overlay nav-link">Acessórios</a>
                </div>
            </div>
        </div>
    </div>

    <style>

        #categorias {
            width: 200px;
            border-radius: 100rem;
        }
    </style>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>

