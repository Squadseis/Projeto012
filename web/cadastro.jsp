<%-- 
    Document   : cadastro
    Created on : 9 de fev. de 2024, 16:29:10
    Author     : nalis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
    <link rel="stylesheet" type="text/css" href="arquiv/css/cadastro.css">
    <link
    rel="stylesheet"
    href="https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css" />
    
   
      <script src="arquiv/js/menu.js"></script>
    <script src="arquiv/js/loginscript.js"></script>
    <script src="arquiv/js/cadastro.js"></script>
    <script src="arquiv/js/login.js"></script>
    </head>
    <body>
        <div class="menu"></div>
<body>  
   
  <section class="cadastro-body">

    <div class="cadastro-container">

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
        <div class="form-wrapper">
          <div class="logo-container">
            <a href="#" class="logo-container">
              <img src="imagens/Logo.png" alt="Logo">
            </a>
          </div>
  
          <h2>Bem vindo! 👋🏻</h2>
          <p>Insira suas credenciais para acessar sua conta.</p>
  
          <div class="input-container">
              <form action="#">
                  <div class="field email-field">
                    <div class="input-field">
                      <input type="email" placeholder="Digite seu e-mail" class="email" />
                    </div>
                    <span class="error email-error">
                      <i class="bx bx-error-circle error-icon"></i>
                      <p class="error-text">Por favor digite um email válido</p>
                    </span>
                  </div>
                  <div class="field create-password">
                    <div class="input-field">
                      <input
                        type="password"
                        placeholder="Criar senha"
                        class="password"
                      />
                      <i class="bx bx-hide show-hide"></i>
                    </div>
                    <span class="error password-error">
                      <i class="bx bx-error-circle error-icon"></i>
                      <p class="error-text">
                        Insira pelo menos 8 caracteres com número, símbolo, letra minúscula e maiúscula.
                      </p>
                    </span>
                  </div>
          <div class="field confirm-password">
              <div class="input-field">
                <input
                  type="password"
                  placeholder="Confirme sua senha"
                  class="cPassword"
                />    
                <i class="bx bx-hide show-hide"></i>
              </div>
              <span class="error cPassword-error">
                <i class="bx bx-error-circle error-icon"></i>
                <p> class="error-text">A senha não corresponde</p>
              </span>
            </div>
          <form>  
            <div class="input-field button">
              <input type="submit" value="Enviar" />
            </div>
          </form>
        </div>
        <script src="/script.js"></script>
        
        <div>
  
          <div class="or-divider">ou</div>
  
          <button class="google-signin">
            <object data="imagens/Login/google.svg"></object>
            <span>Entrar com Google</span>
          </button>
        </div>
      </div>

    <script src="java/cadastrar.js"></script>
    </div>

  </section>
    <!-- Rodapé -->
    <div class="rodape"></div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
    </body>
</html>
