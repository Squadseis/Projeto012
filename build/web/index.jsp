<%-- 
    Document   : index
    Created on : 5 de fev. de 2024, 23:08:18
    Author     : nalis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home</title>
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
        <%--
        <form action="ServletV" method="POST" >
        <input type="text" name="cn"/>
        <button> submit</button>
        </form>
        <a href="cadastro.jsp" style="display: block ;">Clique aqui para ir para aba de cadastro </a>
        <a href="carrinho.jsp" style="display: block ;" >Clique aqui para ir para aba de carrinho </a>
        <a href="casa.jsp" style="display: block ;" >Clique aqui para ir para aba de casa </a>
        <a href="categoria.jsp" style="display: block ;" >Clique aqui para ir para aba de categoria  </a>
        <a href="corpo.jsp" style="display: block ;" >Clique aqui para ir para aba de corpo</a>
        <a href="ferramenta.jsp" style="display: block ;" >Clique aqui para ir para aba de ferramenta</a>
        <a href="login.jsp" style="display: block ;" >Clique aqui para ir para aba de login </a>
        <a href="menu.jsp" style="display: block ;" >Clique aqui para ir para aba de menu </a>
        <a href="moda.jsp" style="display: block ;" >Clique aqui para ir para aba de moda </a>
        <a href="promocões.jsp" style="display: block ;" >Clique aqui para ir para aba de promocoes </a>
        <h1>012</h1> 
        --%>
         <div class="menu"></div>
             <br>
    <!--Slide-->
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
            <span class="carousel-control-next-icon " aria-hidden="true"></span>
            <span class="visually-hidden ">Next</span>
        </button>
    </div>

    <!-- Regua horizontal -->
    <hr class="mt-3 mb-5" />
    <div class="card-text">
        <h5 class="ms-3">Ofertas do dia → <a href="">Ver todas</a></h5>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="t-produtos row row-cols-2 row-cols-sm-2 row-cols-md-3 row-cols-lg-4 row-cols-xl-4 g-2">
                <div class="col">
                    <div class="produto card h-auto d-flex flex-column">
                        <div class="produto-icons d-flex justify-content-between">
                            <button class="icon-button"><i class="bi bi-heart"></i></button>
                            <button class="icon-button"><i class="bi bi-cart-check"></i></button>
                        </div>
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/pulseira1.jpg">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">Pulseira de miçangas</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;">R$ 200,00</s>
                                <br>R$ 120,00</p>
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
                            <h6 class="card-title text-center">Pulseira de miçangas</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;">R$ 200,00</s>
                                <br>R$ 120,00</p>
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
                        <img class="produto-image card-img-top img-fluid" src="imagens/produtos/pulseira2.jpg">
                        <div class="produto-info card-body">
                            <h6 class="card-title text-center">Pulseira de miçangas</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;">R$ 200,00</s>
                                <br>R$ 120,00</p>
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
                            <h6 class="card-title text-center">Kit Pulseira + colar e brinco</h6>
                            <p class="card-text produto-descricao mb-lg-3"> Em 6x de R$ 20 sem juros</p>
                            <p class="card-text text-danger produto-preco"><s style="font-size: 15px;">R$ 200,00</s>
                                <br>R$ 120,00</p>
                            <p class="card-text text-danger text-lg-end">frete gratis</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <br><br>
    <hr>
    <h5 class="ms-3">Destaques em arte indígena → <a href="">Ver todas</a></h5>
    
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


    <div class="rodape"></div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
    </body>
</html>
