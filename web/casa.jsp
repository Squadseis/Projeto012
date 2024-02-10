<%-- 
    Document   : casa
    Created on : 9 de fev. de 2024, 17:08:09
    Author     : nalis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <title>A̶r̶t̶e̶ ̶I̶n̶d̶í̶g̶e̶n̶a̶</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
      <link rel="stylesheet" href="arquiv/css/produtos.css">
    <link rel="stylesheet" href="arquiv/css/estilo.css">
    
    <script src="arquiv/js/menu.js"></script>
    <script src="arquiv/js/loginscript.js"></script>
    <script src="arquiv/js/cadastro.js"></script>
    <script src="arquiv/js/login.js"></script>
</head>

<body>

    <div class="menu"></div>
    <!-- Slide   -->
    <div id="carouselExampleInterval" class="carousel" data-bs-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active" data-bs-interval="2000">
                <img src="imagens/anuncios/anuncio3.png" class="d-block w-100">
            </div>
            <div class="carousel-item" data-bs-interval="2000">
                <img src="imagens/anuncios/anuncio2.png" class="d-block w-100">
            </div>
            <div class="carousel-item">
                <img src="imagens/anuncios/anuncio1.png" class="d-block w-100">
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval"
            data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval"
            data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>

    <hr class="mt-3" />
    

    <div class="container-fluid">
        <div class="row">
            <div class="row row-cols-2 row-cols-sm-2 row-cols-md-3 row-cols-lg-4 row-cols-xl-4 g-2">

                <div class="col categorias">
                    <img class="produto-image card-img-top img-fluid" src="imagens/categorias/categoria-decoração.png">
                    <h6 class="card-title text-center">Decoração</h6>
                </div>

                <div class="col categorias">
                    <img class="produto-image card-img-top img-fluid" src="imagens/categorias/categoria-cama.png">
                    <h6 class="card-title text-center">Colchões</h6>
                </div>

                <div class="col categorias">
                    <img class="produto-image card-img-top img-fluid" src="imagens/categorias/categoria-banho-cama.png">
                    <h6 class="card-title text-center text-decoration-none">Cama/Banho</h6>
                </div>

                  <div class="col categorias">
                    <img class="produto-image card-img-top img-fluid" src="imagens/categorias/categoria-eletrodomesticos.png">
                    <h6 class="card-title text-center">Eletrodomésticos</h6>
                </div>

                <div class="col categorias">
                    <img class="produto-image card-img-top img-fluid" src="imagens/categorias/categoria-cozinha.png">
                    <h6 class="card-title text-center">Cozinha</h6>
                </div>

                <div class="col categorias">
                    <img class="produto-image card-img-top img-fluid" src="imagens/categorias/categoria-moveis.png">
                    <h6 class="card-title text-center">Moveis</h6>
                </div>
            </div>
        </div>
        <style>
            .categorias{
                max-width: 100px;
                margin: auto;
                display: block;
                cursor: pointer;
            }
            .categorias img{
                border-radius: 500px;   
            }
        </style>

    <div class="container-fluid">
        <div class="row">
            <div class="t-produtos row row-cols-2    row-cols-sm-2 row-cols-md-3 row-cols-lg-4 row-cols-xl-4 g-2">
                <div class="col">
                    <div class="produto card h-auto d-flex flex-column">
                        <div class="produto-icons d-flex justify-content-between">
                            <button class="icon-button"><i class="bi bi-heart"></i></button>
                            <button class="icon-button"><i class="bi bi-cart-check"></i></button>
                        </div>
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/peixe.png">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">Peixe de madeira</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;"></s>R$ 120,00</p>
                            <p class="card-text text-danger text-lg-end">frete gratis</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="produto card h-auto d-flex flex-column">
                        <div class="produto-icons d-flex justify-content-between">
                            <button class="icon-button"><i class="bi bi-heart"></i></button>
                            <button class="icon-button"><i class="bi bi-cart-check"></i></button>
                        </div>
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/peixe.png">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">Peixe de madeira</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;"></s>R$ 120,00</p>
                            <p class="card-text text-danger text-lg-end">frete gratis</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="produto card h-auto d-flex flex-column">
                        <div class="produto-icons d-flex justify-content-between">
                            <button class="icon-button"><i class="bi bi-heart"></i></button>
                            <button class="icon-button"><i class="bi bi-cart-check"></i></button>
                        </div>
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/peixe.png">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">Peixe de madeira</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;"></s>R$ 120,00</p>
                            <p class="card-text text-danger text-lg-end">frete gratis</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="produto card h-auto d-flex flex-column">
                        <div class="produto-icons d-flex justify-content-between">
                            <button class="icon-button"><i class="bi bi-heart"></i></button>
                            <button class="icon-button"><i class="bi bi-cart-check"></i></button>
                        </div>
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/peixe.png">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">Peixe de madeira</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;"></s>R$ 120,00</p>
                            <p class="card-text text-danger text-lg-end">frete gratis</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="produto card h-auto d-flex flex-column">
                        <div class="produto-icons d-flex justify-content-between">
                            <button class="icon-button"><i class="bi bi-heart"></i></button>
                            <button class="icon-button"><i class="bi bi-cart-check"></i></button>
                        </div>
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/peixe.png">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">Peixe de madeira</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;"></s>R$ 120,00</p>
                            <p class="card-text text-danger text-lg-end">frete gratis</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="produto h-auto card d-flex flex-column">
                        <div class="produto-icons d-flex justify-content-between">
                            <button class="icon-button"><i class="bi bi-heart"></i></button>
                            <button class="icon-button"><i class="bi bi-cart-check"></i></button>
                        </div>
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/pulseira3.jpg">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">Pulseira</h6>
                            <p></p>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;"></s>R$ 120,00</p>
                            <p class="card-text text-danger text-lg-end">frete gratis</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="produto card h-auto d-flex flex-column">
                        <div class="produto-icons d-flex justify-content-between">
                            <button class="icon-button"><i class="bi bi-heart"></i></button>
                            <button class="icon-button"><i class="bi bi-cart-check"></i></button>
                        </div>
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/kit-colar.jpg">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">kit-colar</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;"></s>R$ 120,00</p>
                            <p class="card-text text-danger text-lg-end">frete gratis</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="produto card h-auto d-flex flex-column">
                        <div class="produto-icons d-flex justify-content-between">
                            <button class="icon-button"><i class="bi bi-heart"></i></button>
                            <button class="icon-button"><i class="bi bi-cart-check"></i></button>
                        </div>
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/pulseira1.jpg">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">Pulseira</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;"></s>R$ 120,00</p>
                            <p class="card-text text-danger text-lg-end">frete gratis</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <style>
        .row {
            margin-bottom: 20px;
        }
    </style>
    <div class="rodape"></div>

    <!-- Bootstrap JavaScript para Bootstrap 5 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>

</html>