<%-- 
    Document   : login
    Created on : 9 de fev. de 2024, 17:19:28
    Author     : nalis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
           <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
      <link
    rel="stylesheet"
    href="https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css"
  />
      <link rel="stylesheet" type="text/css" href="arquiv/css/login.css">
    <link
    <link rel="stylesheet" href="arquiv/css/produtos.css">
    <link rel="stylesheet" href="arquiv/css/estilo.css">
    <link rel="stylesheet" href="arquiv/css/login.css">
    <link rel="stylesheet" href="arquiv/css/cadastro.css">
    <script src="arquiv/js/menu.js"></script>
    <script src="arquiv/js/loginscript.js"></script>
    <script src="arquiv/js/cadastro.js"></script>
    <script src="arquiv/js/login.js"></script>
    </head>
   
   
<body>  
    <div class="menu"></div>
    <br>
        <section class="login-body">        
          
          <div class="login-container">
          
            <div class="image-section">
              <div class="image-wrapper">
                <img src="imagens/Login/ilustrahullk.jpg" alt="">
              </div>
        
              <div class="conte-container">
                <h1 class="section-heading">POVOS INDÍGENAS E NATUREZA EM PERFEITA SINTONIA <span>Digital.</span></h1>
                <p class="section-paragraph">O encanto da arte Indígena despertam beleza e significado para a sua decoração.</p>
              </div>
            </div>
        
            <div class="form-section">
              
                <div class="logo-container">
                  <a href="index.html" class="logo-container">
                    <img src="imagens/Logo.png" alt="Logo">
                  </a>
                </div>
        
                <h2>Bem vindo! 👋🏻</h2>
                <p>Insira suas credenciais para acessar sua conta.</p>
        
                <div class="input-container">
                  <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" id="email" autocomplete="off">
                  </div>
                  <div class="form-group">
                    <label for="password">Senha</label>
                    <input type="password" id="password">
                  </div>
                </div>
        
                <div class="remember-forgot">
                  <div class="remember-me">
                    <input type="checkbox" value="remember-me" id="remember-me">
                    <label for="remember-me">Lembrar</label>
                  </div>
        
                  <a href="#">Esqueceu a senha?</a>
                </div>
              <form>
                <div class="input-field button">
                  <input type="submit" value="Enviar" />
                </div>
              </form>
                <div class="or-divider">Ou</div>
                <button class="google-signin">
                  <object data="imagens/Login/google.svg"></object>
                  <span>Entrar com Google</span>
                </button>

                </div>
            </div>
            <script src="javascript/cadastrar.js"></script>         
          
        
        </section>
    <!-- Rodapé -->
    <div class="rodape"></div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
